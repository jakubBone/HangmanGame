import java.util.Scanner;

public class Game extends Gibbet {

    Scanner scanner = new Scanner(System.in);

        public void compare(char[] wordInTable, char[] hiddenWord, String word, int wordLength){
        int counter = 0;
        boolean isGameContunue = true;
        //counter < wordLength
        while(isGameContunue) {
            char userGuess = guessTheLetter();
            for (int i = 0; i < wordInTable.length; i++) {
                if (wordInTable[i] == userGuess) {
                    System.out.println("Congratulation!");
                    wordInTable[i] = ' ';
                    hiddenWord[i] = userGuess;
                    System.out.println();
                    for (int j = 0; j < word.length(); j++) {
                        System.out.print(hiddenWord[j]);
                    }
                    counter++;
                    if()
                        isGameContunue = false;
                    break;
                } else {
                    System.out.println("You missed");
                    Game.printHang1();
                    break;
                }

            }
        }
        System.out.println("Congratulation! You won everything!");
    }

    public char guessTheLetter() {
        System.out.print("Guess the letter: ");
        char guess = scanner.next().charAt(0);
        return guess;
    }
}
