
import java.util.Scanner;

public class HangmanTest {

    public static void main(String[] args)  {

        Gibbet gibbet = new Gibbet();
        Game game = new Game();
        Scanner sc = new Scanner(System.in);

        gibbet.makeEmptyGibbet();
        //gibbet.printEmptyGibbet();
        System.out.println();
        game.askForWord();


        while(Game.ifGameContinue){
            game.checkGuess();
                    System.out.println("Actual state of word: " + String.valueOf(Game.hidenWord));
                    System.out.println();
                    }
                }
            }

