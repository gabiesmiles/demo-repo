import java.util.Scanner;

public class EnterSentence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for input
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            System.out.print("Every fifth character: ");
            for (int i = 4; i < sentence.length(); i += 5) {
                System.out.print(sentence.charAt(i));
            }

            scanner.close();
        }
    }

