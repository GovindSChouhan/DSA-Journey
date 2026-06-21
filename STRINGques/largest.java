public class largest {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};

        String largest = fruits[0];//1st string jo hai ussy hii largest man liya 
        for(int i = 1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) <0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
