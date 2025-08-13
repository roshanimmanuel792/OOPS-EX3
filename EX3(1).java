import java.util.Scanner;

public class strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String text = sc.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            for (int j = i + 1; j < text.length(); j++) 

            {

                if (text.charAt(i)==text.charAt(j) ) {

                    count++;

                }

            }

        }

        if (count==0)

            System.out.println("Perfect");

        else

            System.out.println("not perfect");

    }

}
