public class Recursion{
    public static void printDEC(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDEC(n-1);
    }
    public static void printINC(int n){
        if(n== 1){
            System.out.print(n+" ");
            return;
        }
        printINC(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
       printDEC(n);
       System.out.println("    ");
        printINC(n);
        
    }
}