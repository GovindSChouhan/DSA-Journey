import java.util.Scanner;
public class basicArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        System.out.println("enter the marks of ");
         marks[0] = sc.nextInt();
        System.out.println("enter the marks of ");
        marks[1] = sc.nextInt();
        System.out.println("enter the marks of ");
         marks[2] = sc.nextInt();

        System.out.println("marks  of math is "+marks[0]);
        System.out.println("marks of chem is "+marks[1]);
        System.out.println("marks of computer is "+marks[2]);

     int persent = (marks[0] + marks[1] + marks[2])/3;
     System.out.println("% is "+persent+ "%");

        sc.close();




    }
}