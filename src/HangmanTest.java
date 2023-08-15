
import java.util.Scanner;

public class HangmanTest {

    public static void main(String[] args)  {

        Game game = new Game();
        Scanner sc = new Scanner(System.in);

        Gibbet.makeGibbet();

        for(int i = 0; i < 9 ; i++){
            System.out.println();
            for (int j = 0; j < 18; j++) {
                System.out.print(Gibbet.gibbet[i][j]);
            }
        }

        /*
        System.out.print("Wymyśl słowo: ");
        String haslo = sc.nextLine();
        char[] chars = haslo.toCharArray();
        char[] ukryteHaslo = new char[haslo.length()];
        for (int i = 0; i < haslo.length(); i++) {
            ukryteHaslo[i] = '_';
        }
        System.out.print("Słowo do zgadnięcia: ");

        for (int i = 0; i < haslo.length(); i++) {
            System.out.print(ukryteHaslo[i]);
        }


        System.out.println(" Ilość liter: " + haslo.length());
        System.out.println();

        game.guess();
        game.porownanie(chars, ukryteHaslo, haslo);
*/
        }
    }

