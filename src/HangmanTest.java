
import java.util.Scanner;

public class HangmanTest {

    public static void main(String[] args)  {

        Gibbet gibbet = new Gibbet();
        Game game = new Game();
        Scanner sc = new Scanner(System.in);

        gibbet.makeEmptyGibbet();
        gibbet.printEmptyGibbet();
        System.out.println();
        game.askForWord();


        while(Game.ifGameContinue){
            gibbet.printEmptyGibbet();
            game.checkGuess();
                    System.out.println(Game.hidenWord);
                    gibbet.printEmptyGibbet();
                    System.out.println(Game.hidenWord);
                    }
                }
            }

