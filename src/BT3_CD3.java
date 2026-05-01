import java.util.Scanner;

public class BT3_CD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input s: ");
        String s = sc.nextLine();

        System.out.print("Input t: ");
        String t = sc.nextLine();

        String result = minWindow(s, t);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128]; // ASCII
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (need[c] > 0) count--;
            need[c]--;

            // Khi đủ ký tự
            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;

                if (need[leftChar] > 0) count++;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
