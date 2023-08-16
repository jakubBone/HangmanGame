import java.util.Scanner;

public class Game extends Gibbet {

    Scanner scanner = new Scanner(System.in);
        public void compare(char[] wordInTable, char[] hiddenWord, String word, int wordLength) {
            boolean isGameContunue = true;
            while (counter == wordLength) {
                char userGuess = guessTheLetter();
                for (int i = 0; i < wordInTable.length; i++) {
                    if (wordInTable[i] == userGuess) {
                        System.out.println("Congratulation!");
                        wordInTable[i] = ' ';
                        hiddenWord[i] = userGuess;
                        counter++;
                        System.out.println();
                        break;
                    }
                }
            }
            System.out.println("You missed");
            Gibbet.gibbetPartsCounter++;
            if (Gibbet.gibbetPartsCounter == 11) {

                Gibbet.buildGibbet();
                Gibbet.gibbetPartsCounter++;
                if (Gibbet.gibbetPartsCounter == 11)
                    System.out.println("Full gibbet, you lost1");
                System.out.println("Congratulation! You won everything!");
            }
        }

    public char guessTheLetter() {
        System.out.print("Guess the letter: ");
        char guess = scanner.next().charAt(0);
        return guess;
    }
}
