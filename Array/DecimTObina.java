public class DecimTObina {
    public static int dectobin(int n) {
        int binN = 0;
        int pow = 0;

        while (n > 0) {
            int remainder = n % 2;
            binN = binN + remainder * (int) Math.pow(10, pow);
            pow++;
            n = n / 2;   // MUST be /2
        }

        return binN;
    }

    public static void main(String[] args) {
        System.out.println(dectobin(4));
    }
}
