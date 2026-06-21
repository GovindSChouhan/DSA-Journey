public class Flag {
    public static void main(String[] args) {

        
        final String RESET = "\u001B[0m";
        final String BG_ORANGE = "\u001B[48;5;208m"; //Raal Rang
        final String BG_WHITE = "\u001B[47m";        // White Ranng
        final String BG_GREEN = "\u001B[42m";        // Haara raang
        final String BLUE = "\u001B[34m";            // panni 

        // laal RANG
        for (int i = 0; i < 5; i++) {
            System.out.println(BG_ORANGE + "                                        " + RESET);
        }

        // SAFETH with CVNK
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println(BG_WHITE + "  " + BLUE + "Hppy Independence Day 4rom Govind" + BG_WHITE + "             " + RESET);

            } else {
                System.out.println(BG_WHITE + "                                        " + RESET);
            }
        }

        // haara
        for (int i = 0; i < 5; i++) {
            System.out.println(BG_GREEN + "                                        " + RESET);
        }
       
    }
    
}
