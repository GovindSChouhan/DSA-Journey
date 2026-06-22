import java.util.*;

class Graph {
    private Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Add a user to the graph
    public void addUser(String user) {
        adjacencyList.putIfAbsent(user, new ArrayList<>());
    }

    // Add a connection between two users
    public void addConnection(String user1, String user2) {
        adjacencyList.get(user1).add(user2);
        adjacencyList.get(user2).add(user1); // Undirected graph
    }

    // Get the adjacency list (graph)
    public Map<String, List<String>> getGraph() {
        return adjacencyList;
    }

    // Find the shortest path between two users using BFS
    public List<String> shortestPath(String start, String end) {
        Queue<List<String>> queue = new LinkedList<>();
        queue.add(Arrays.asList(start));
        Set<String> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String currentUser = path.get(path.size() - 1);
            if (currentUser.equals(end)) {
                return path;
            }
            if (!visited.contains(currentUser)) {
                visited.add(currentUser);
                for (String neighbor : adjacencyList.get(currentUser)) {
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.add(newPath);
                }
            }
        }
        return null; // No path found
    }

    // Find the most influential user (user with the most connections)
    public String mostInfluentialUser() {
        String influentialUser = null;
        int maxConnections = -1;

        for (Map.Entry<String, List<String>> entry : adjacencyList.entrySet()) {
            if (entry.getValue().size() > maxConnections) {
                maxConnections = entry.getValue().size();
                influentialUser = entry.getKey();
            }
        }
        return influentialUser;
    }

    // Detect communities using DFS
    public List<List<String>> detectCommunities() {
        Set<String> visited = new HashSet<>();
        List<List<String>> communities = new ArrayList<>();

        for (String user : adjacencyList.keySet()) {
            if (!visited.contains(user)) {
                List<String> community = new ArrayList<>();
                dfs(user, visited, community);
                communities.add(community);
            }
        }
        return communities;
    }

    // DFS helper function
    private void dfs(String user, Set<String> visited, List<String> community) {
        visited.add(user);
        community.add(user);
        for (String neighbor : adjacencyList.get(user)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited, community);
            }
        }
    }

    // Suggest friends based on mutual connections
    public List<String> suggestFriends(String user) {
        Map<String, Integer> suggestions = new HashMap<>();
        for (String friend : adjacencyList.get(user)) {
            for (String mutualFriend : adjacencyList.get(friend)) {
                if (!mutualFriend.equals(user) && !adjacencyList.get(user).contains(mutualFriend)) {
                    suggestions.put(mutualFriend, suggestions.getOrDefault(mutualFriend, 0) + 1);
                }
            }
        }
        List<String> sortedSuggestions = new ArrayList<>(suggestions.keySet());
        sortedSuggestions.sort((a, b) -> suggestions.get(b) - suggestions.get(a));
        return sortedSuggestions;
    }
}

public class SocialMediaNetworkAnalyzer {
    public static void main(String[] args) {
        Graph socialNetwork = new Graph();

        // Add users
        socialNetwork.addUser("Alice");
        socialNetwork.addUser("Bob");
        socialNetwork.addUser("Charlie");
        socialNetwork.addUser("Dave");
        socialNetwork.addUser("Eve");

        // Add connections
        socialNetwork.addConnection("Alice", "Bob");
        socialNetwork.addConnection("Alice", "Charlie");
        socialNetwork.addConnection("Bob", "Dave");
        socialNetwork.addConnection("Charlie", "Eve");

        // Print the graph
        System.out.println("Graph: " + socialNetwork.getGraph());

        // Find the shortest path
        System.out.println("Shortest path from Alice to Eve: " + socialNetwork.shortestPath("Alice", "Eve"));

        // Find the most influential user
        System.out.println("Most influential user: " + socialNetwork.mostInfluentialUser());

        // Detect communities
        System.out.println("Communities: " + socialNetwork.detectCommunities());

        // Suggest friends
        System.out.println("Friend suggestions for Alice: " + socialNetwork.suggestFriends("Alice"));
    }
}