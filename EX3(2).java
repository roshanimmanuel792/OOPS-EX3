import java.util.Scanner;

public class wordsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Paragraph:");
        String paragraph = sc.nextLine();

        System.out.println("Enter the word to search:");
        String word = sc.nextLine();

        int wordCount = 0;

        String actpara = paragraph.toLowerCase();
        String[] parawords = actpara.split("\\s+");

        for (int i = 0; i < parawords.length; i++) {
            if (word.toLowerCase().equals(parawords[i])) {
                wordCount++;
            }
        }

        System.out.println("The given word \"" + word + "\" is found " + wordCount + " times.");
    }
}