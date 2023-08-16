import java.util.Scanner;

public class Game extends Gibbet {

    Scanner scanner = new Scanner(System.in);

        public void compare(char[] wordInTable, char[] hiddenWord, String word, int wordLength) {
            char userGuess = guessTheLetter();
            boolean ifUserMissed = true;
            //boolean ifGameContinue = true;
            while (true) {
                for (int i = 0; i < wordInTable.length; i++) {
                    if (wordInTable[i] == userGuess)
                        wordInTable[i] = ' ';
                        hiddenWord[i] = userGuess;
                        ifUserMissed = false;
                    }
                    if (ifUserMissed == false) {
                        System.out.println("Good job!");
                        for (int j = 0; j < wordLength; j++) {
                            System.out.println(hiddenWord[j]);
                        }
                    }
                    else{
                        System.out.println("You missed");
                        Gibbet.printGibbet();
                        Gibbet.gibbetPartsCounter++;
                    }
                    if(hiddenWord == wordInTable) {
                        System.out.println("You won!");
                        break;
                    }
                    else if (gibbetPartsCounter == 11) {
                        System.out.println("You lost!");
                        break;
                    }
                }
            }



                   /* System.out.println("congratulations! You won");
                else if (Gibbet.gibbetPartsCounter == 11)
                    System.out.println("Game over, you lost");*/
    public char guessTheLetter() {
        System.out.print("Guess the letter: ");
        char guess = scanner.next().charAt(0);
        return guess;
    }
}
