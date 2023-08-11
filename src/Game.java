public class Game extends Gibbet{
    Scanner sc = new Scanner(System.in);

    System.out.print("Wymyśl słowo: ");
    String haslo = sc.nextLine();
    char[] chars = haslo.toCharArray();
        System.out.print("Zgadnij słowo: ");

    char[] ukryteHaslo = new char[haslo.length()];

        for(int i = 0; i < haslo.length(); i++){
        ukryteHaslo[i] = '_';
    }

        for(int i = 0; i < haslo.length(); i++){
        System.out.print(ukryteHaslo[i]);
    }

        System.out.println(" Ilość liter: " + haslo.length());
        System.out.println();

        System.out.print("zgadnij litere: ");
    char guess = sc.next().charAt(0);


        System.out.println();


            for (int i = 0; i < chars.length; i++) {
        if (chars[i] == guess) {
            System.out.println("Brawo, trafiłeś!");
            chars[i] = ' ';
            gibbet.printHang1();
            System.out.println();
            ukryteHaslo[i] = guess;
            for(int j = 0; j < haslo.length(); j++){
                System.out.print(ukryteHaslo[j]);
            }
            break;
        }
    }
}
