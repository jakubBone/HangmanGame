
import java.util.Scanner;

public class HangmanTest {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Gibbet gibbet = new Gibbet();

        System.out.print("Wymyśl słowo: ");
        String haslo = sc.nextLine();
        char[] chars = haslo.toCharArray();
        System.out.print("Zgadnij słowo: ");

        for(int i = 0; i < haslo.length(); i++){
            System.out.print("_");
        }
        System.out.println(" Ilość liter: " + haslo.length());
        System.out.println();


        System.out.print("zgadnij litere: ");
        char guess = sc.next().charAt(0);

        for(int i = 0; i < haslo.length(); i++){
            System.out.print("_");
        }
        System.out.println();


            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == guess) {
                    System.out.println("Brawo, trafiłeś!");
                    chars[i] = ' ';
                    gibbet.printGibbet();
                    System.out.println();
                    break;
                }
            }

        }
    }

