import java.util.Scanner;

public class Game extends Gibbet {
    Scanner scanner = new Scanner(System.in);
    public static String word;
    public static char[] wordInTable;
    public static char[] hidenWord;

    public static int counter;

    public static boolean ifGameContinue = true;


    public void askForWord() {
        System.out.print("Come up with a word: ");
        word = scanner.nextLine();
        wordInTable = word.toCharArray();
        hidenWord = new char[word.length()];
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
                        hit = true;
                    }
                }
            if(hit) {
                counter++;
                if(counter < word.length())
                    System.out.println("Congratulation, you hit the letter!");
                else {
                    System.out.println("Great! You win!");
                    ifGameContinue = false;
                }
            }
            else {
                if(gibbetPartsCounter < 11) {
                    System.out.print("You missed! The gibbet is being formed: ");
                    Gibbet.buildGibbet();
                    Gibbet.printEmptyGibbet();
                    gibbetPartsCounter++;
                }
                else {
                    System.out.println("Gibbet is completed... You lost :( !");
                    ifGameContinue = false;
                }

            }
        }


    public char guessTheLetter() {
            System.out.print("Guess the letter: ");
            char guess = scanner.next().charAt(0);
            return guess;
        }
    }