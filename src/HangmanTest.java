
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
        System.out.println();

        System.out.print("Come up with a word: ");
        String word = sc.nextLine();
        char[] chars = word.toCharArray();
        char[] hidenWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hidenWord[i] = '_';
        }
        System.out.print("Word to guess: ");

        for (int i = 0; i < word.length(); i++) {
            System.out.print(hidenWord[i]);
        }


        System.out.println("Number of letters: " + word.length());
        System.out.println();

        game.guess();
        game.compare(chars, hidenWord, word);

        }
    }

