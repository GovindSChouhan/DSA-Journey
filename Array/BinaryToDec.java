public class BinaryToDec {

    public static int binary(int binaryn) {
        int pow = 0;
        int decn = 0;

        while (binaryn > 0) {
            int lastD = binaryn % 10;
            decn = decn + (lastD * (int) Math.pow(2, pow));
            pow++;
            binaryn = binaryn / 10;
        }
        return decn;   // 🔑 FIX
    }

    public static void main(String[] args) {
        System.out.println(binary(101));
    }
}
