import java.util.Scanner;

public class Game extends Gibbet {

    Scanner scanner = new Scanner(System.in);

        public void compare(char[] chars, char[] hiddenWord, String word){
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == guess()) {
                    System.out.println("Congratulation!");
                    chars[i] = ' ';
                    System.out.println();
                    hiddenWord[i] = guess();
                    for (int j = 0; j < word.length(); j++) {
                        System.out.print(hiddenWord[j]);
                    }
                    break;
                }
            }
        }
    public char guess() {
        System.out.print("Guess the letter: ");
        char guess = scanner.next().charAt(0);
        return guess;
    }
}
