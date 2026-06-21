public class substring {
    public static String substring(String str,int startIN,int endIN){
        String substr = " ";
        for(int i = startIN;i<endIN;i++){//statring index se ending index -1 tk;
            substr += str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        str.substring(0,5);
        System.out.println(substring(str,0,5));
    }
    
}
