import java.util.Scanner;

public class Game extends Gibbet {
    Scanner scanner = new Scanner(System.in);

        public void porownanie (char[] chars, char[] ukryteHaslo, String haslo){
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == guess()) {
                    System.out.println("Brawo, trafiłeś!");
                    chars[i] = ' ';
                    System.out.println();
                    ukryteHaslo[i] = guess();
                    for (int j = 0; j < haslo.length(); j++) {
                        System.out.print(ukryteHaslo[j]);
                    }
                    break;
                }
            }
        }
    public char guess() {
        System.out.print("zgadnij litere: ");
        char guess = scanner.next().charAt(0);
        return guess;
    }
}
