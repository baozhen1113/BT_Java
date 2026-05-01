import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        String result = getFirstLetters(input);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static String getFirstLetters(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }

        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0))).append(" ");
        }

        return result.toString().trim();
    }
}
