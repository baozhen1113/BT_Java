import java.util.Scanner;

public class BT1_CD3 {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // index từ 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Input số phần tử: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Nhập mảng (đã sắp xếp)
        System.out.println("Nhập mảng (tăng dần):");
        for (int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }

        // Nhập target
        System.out.print("Input target: ");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        // In output
        System.out.print("Output: ");
        if (result[0] == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }

        sc.close();
    }
}