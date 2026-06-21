import java.util.*;

public class Max_ActNOTsor {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};


        // Sorting 
        int activities[][] = new int[start.length][3];

        // Populate the activities array
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // Activity number (index)
            activities[i][1] = start[i]; // Start time
            activities[i][2] = end[i]; // End time
        }

        // Sort the activities by end time (column 2)
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Always select the first activity
        count = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2]; // Last end time

        // Iterate over the activities and select the ones that don't overlap
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) { // If the current activity's start time is >= last end time
                count++;
                ans.add(activities[i][0]); // Add the activity number to the result
                lastEnd = activities[i][2]; // Update last end time
            }
        }

        System.out.println("Max activities = ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + (ans.get(i) + 1) + " "); // Add 1 to the activity number to match the original index
        }
    }
}
