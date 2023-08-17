import java.util.Scanner;

public class Game extends Gibbet {
    Scanner scanner = new Scanner(System.in);
    public static String word;
    public static char[] wordInTable;
    public static char[] hidenWord;

    public static char [] completedWord;

    public void askForWord() {
        System.out.print("Come up with a word: ");
        word = scanner.nextLine();
        wordInTable = word.toCharArray();
        hidenWord = new char[word.length()];
        completedWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hidenWord[i] = '_';
        }
        System.out.print("Word to guess: ");
        for (int i = 0; i < word.length(); i++) {
            System.out.print(hidenWord[i]);
        }
        System.out.println(" Number of letters: " + word.length());
        System.out.println();
    }

        public void checkGuess() {
            boolean hit = false;
            char userGuess = guessTheLetter();
                for (int i = 0; i < wordInTable.length; i++) {
                    if (wordInTable[i] == userGuess) {
                        wordInTable[i] = ' ';
                        hidenWord[i] = userGuess;
                        completedWord[i] = userGuess;
                        hit = true;
                    }
                }
            if(hit)
                System.out.println("Congratulation, you hit the letter!");
            else {
                System.out.println("You missed");
                Gibbet.buildGibbet();
                Gibbet.gibbetPartsCounter++;
            }
        }

    public char guessTheLetter() {
            System.out.print("Guess the letter: ");
            char guess = scanner.next().charAt(0);
            return guess;
        }
    }