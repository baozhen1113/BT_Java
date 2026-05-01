import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        int n = sc.nextInt();

        int result = sumEven(n);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static int sumEven(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
