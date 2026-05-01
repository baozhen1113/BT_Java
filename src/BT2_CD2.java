import java.util.Scanner;

public class BT2_CD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
