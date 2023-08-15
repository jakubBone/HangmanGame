public class Gibbet {
    public static String[][] gibbet = new String[9][18];

    public static void makeGibbet() {
        // zero step
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 18; j++) {
                gibbet[i][j] = " ";
            }
        }

        // first step
        gibbet[8][0] = "/";
        // second step
        gibbet[8][2] = "\\";
        // third step
        for(int i = 1; i < 8; i++){
            gibbet[i][1] = "|";
        }
        //fourth step
        for(int i = 1; i < 17; i++){
            gibbet[0][i] = "-";
        }
        //fifth step
        gibbet[1][2] = "/";
        //sixth step
            gibbet[1][16] = "|";
            gibbet[2][16] = "|";
        //seventh step
        gibbet[3][16] = "0";
        //eihth
        gibbet[4][16] = "|";
        gibbet[5][16] = "|";
        //ninth
        gibbet[4][15] = "/";
        //tenth
        gibbet[4][17] = "\\";
        //eleventh
        gibbet[6][15] = "/";
        //twelvth
        gibbet[6][17] = "\\";
    }

        public static void printHang13 () {
            System.out.println(" ---------------");
            System.out.println(" |/             |");
            System.out.println(" |              |");
            System.out.println(" |              O");
            System.out.println(" |             /|\\");
            System.out.println(" |              |");
            System.out.println(" |             / \\");
            System.out.println(" |              ");
            System.out.println("/ \\               ");
        }

        public static void printHang0 () {
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
        }


        public static void printHang1 () {
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("/                 ");
        }

        public static void printHang2 () {
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("                  ");
            System.out.println("/ \\              ");
        }
        public static void printHang3 () {
            System.out.println("                 ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\              ");
        }

        public static void printHang4 () {
            System.out.println(" ----------------");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\              ");
        }
        public static void printHang5 () {
            System.out.println(" ---------------");
            System.out.println(" |/              ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\             ");
        }
        public static void printHang6 () {
            System.out.println(" ---------------");
            System.out.println(" |/             |");
            System.out.println(" |              |");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\                ");
        }
        public static void printHang7 () {
            System.out.println(" ---------------");
            System.out.println(" |/             |");
            System.out.println(" |              |");
            System.out.println(" |              O");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\                ");
        }
        public static void printHang8 () {
            System.out.println(" ---------------");
            System.out.println(" |/             |");
            System.out.println(" |              |");
            System.out.println(" |              O");
            System.out.println(" |              |");
            System.out.println(" |              |");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\                ");
        }
        public static void printHang9 () {
            System.out.println(" ---------------");
            System.out.println(" |/              |");
            System.out.println(" |              |");
            System.out.println(" |              O");
            System.out.println(" |              |\\");
            System.out.println(" |              |");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\                ");
        }
        public static void printHang10 () {
            System.out.println(" ---------------");
            System.out.println(" |/             |");
            System.out.println(" |              |");
            System.out.println(" |              O");
            System.out.println(" |              |\\");
            System.out.println(" |              |");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\                ");
        }
        public static void printHang11 () {
            System.out.println(" ---------------");
            System.out.println(" |/             |");
            System.out.println(" |              |");
            System.out.println(" |              O");
            System.out.println(" |             /|\\");
            System.out.println(" |              |");
            System.out.println(" |               ");
            System.out.println(" |               ");
            System.out.println("/ \\                ");
        }
        public static void printHang12 () {
            System.out.println(" ---------------");
            System.out.println(" |/             |");
            System.out.println(" |              |");
            System.out.println(" |              O");
            System.out.println(" |             /|\\");
            System.out.println(" |              |");
            System.out.println(" |               \\");
            System.out.println(" |               ");
            System.out.println("/ \\                ");
        }

    }
