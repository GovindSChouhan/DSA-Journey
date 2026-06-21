import java.util.*;
public class praac{
    static class Node{
        Node child[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0;i<26;i++){
                child[i] = null;
            }
        } 
    }
    public static Node root = new Node();
    public static void Insert(String word){
        Node curr = root;
        for(int level = 0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();

            }
           curr = curr.child[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level = 0;level<key.length();level++){
            int idx = key.charAt(level)-'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        return curr.eow = true;
    }
    public static void main(String[] args) {
        String word[] = {"the", "a", "there", "their", "any", "three"};

        for(int i = 0;i<word.length;i++){
            Insert(word[i]);
            System.out.println("Inserted :-"+word[i]);

        }
        System.out.println(search("three"));
        System.out.println(search("thor"));
      

        
    }
}   