import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        int result = countWords(input);

        System.out.println("Output: " + result);

        sc.close();
    }
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
