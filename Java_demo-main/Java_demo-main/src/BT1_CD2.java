import java.util.Scanner;

public class BT1_CD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập thu nhập hàng năm (triệu đồng): vd 5tr --> nhập 5:");
        double income = sc.nextDouble();

        double tax = 0;

        if (income <= 5) {
            tax = income * 0.05;
        } else if (income <= 10) {
            tax = 5 * 0.05 + (income - 5) * 0.10;
        } else if (income <= 18) {
            tax = 5 * 0.05
                    + 5 * 0.10
                    + (income - 10) * 0.15;
        } else if (income <= 32) {
            tax = 5 * 0.05
                    + 5 * 0.10
                    + 8 * 0.15
                    + (income - 18) * 0.20;
        } else if (income <= 52) {
            tax = 5 * 0.05
                    + 5 * 0.10
                    + 8 * 0.15
                    + 14 * 0.20
                    + (income - 32) * 0.25;
        } else if (income <= 80) {
            tax = 5 * 0.05
                    + 5 * 0.10
                    + 8 * 0.15
                    + 14 * 0.20
                    + 20 * 0.25
                    + (income - 52) * 0.30;
        } else {
            tax = 5 * 0.05
                    + 5 * 0.10
                    + 8 * 0.15
                    + 14 * 0.20
                    + 20 * 0.25
                    + 28 * 0.30
                    + (income - 80) * 0.35;
        }

        System.out.println("Số thuế phải trả: " + tax + " triệu đồng");

        sc.close();
    }
}