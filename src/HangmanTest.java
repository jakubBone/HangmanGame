
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

        boolean ifGameContinues = true;

        while(ifGameContinues){
            game.checkGuess();
            System.out.println(Game.hidenWord);
                if(Gibbet.gibbetPartsCounter > 11 || Game.hidenWord == Game.completedWord){
                    if(Game.gibbetPartsCounter > 11) {
                        System.out.println("Gibbet full, you lost!");
                        ifGameContinues = false;
                    }
                    else if (Game.hidenWord == Game.completedWord) {
                        System.out.println("You win!!");
                        ifGameContinues = false;
                    }
                }
            }
        }
    }

