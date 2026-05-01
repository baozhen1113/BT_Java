import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a string:");
        String str = sc.nextLine();
        String vowels = "aeiouAEIOU";

        System.out.println("Input: "+ str);
        System.out.print("Output: ");

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!vowels.contains(String.valueOf(c))) {
                System.out.print(c);
            }
        }

    }
}
