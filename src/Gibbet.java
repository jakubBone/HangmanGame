public class Gibbet {
    public static String [][] gibbet = new String [18][9];

    public static void makeGibbet(){

        // zero step
        for(int i = 0; i < 18; i++){
            for(int j = 0; j < 9; j++) {
                gibbet[i][j] = " ";
            }
        }

        // first step
        gibbet[0][8] = "/";
        // second step
        gibbet[2][8] = "\\";
        // third step
        for(int i = 1; i < 8; i++){
            gibbet[1][i] = "|";
        }
        //fourth step
        for(int i = 0; i < 18; i++){
            gibbet[0][i] = "-";
        }
        //fifth step
        gibbet[1][2] = "/";
        //sixth step
        for(int i = 1; i < 3; i++) {
            gibbet[16][i] = "|";
        }
        //seven step
    }

    public static void printHang0(){
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


    public static void printHang1(){
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

    public static void printHang2(){
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
    public static void printHang3(){
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

    public static void printHang4(){
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
    public static void printHang5(){
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
    public static void printHang6(){
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
    public static void printHang7(){
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
    public static void printHang8(){
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
    public static void printHang9(){
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
    public static void printHang10(){
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
    public static void printHang11(){
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
    public static void printHang12(){
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
    public static void printHang13(){
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
}
