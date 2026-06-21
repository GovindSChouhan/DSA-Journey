public class WordBreakPoblam {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0;i<26;i++){
                children[i] = null;

            }
        }
    
    }
    public static Node root = new Node();
    public static void insert(String arr){
        Node curr = root;;
        for(int level = 0;level <arr.length();level++){
            int idx = arr.charAt(level)-'a';
            if(curr.children[idx] == null){
              curr = root.children[idx] = new Node();

            }
            curr= curr.children[idx]; 
        }
      curr.eow = true;

    }
    public static boolean search(String key){
        Node curr = root;
        for(int level = 0;level<key.length();level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i =1;i<=key.length();i++){

            //substg(beg idx, last idx(exclu idx) strg mai lst idx wala !agega)
            //1st mai single length ka ek char hoga .
            //1st part k liye search ko 2nd k liye recursive

           // key.substring(0, i) 
           // key.substring(i)//i ko java as a beginnig add treak karega

           if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
             return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
       String arr[] = {"i","like","sam","samsung","mobile","ice"};
       for(int i = 0;i<arr.length;i++){
          insert(arr[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));


    }
}
