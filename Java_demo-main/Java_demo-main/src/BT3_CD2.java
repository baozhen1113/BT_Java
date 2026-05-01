import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BT3_CD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static String removeDuplicates(String str) {
        if (str == null) return "";

        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}
