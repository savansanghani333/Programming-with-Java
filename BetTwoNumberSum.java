
//  Write a program to calculate sum of numbers from m to n.
import java.util.Scanner;

public class BetTwoNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 ");
        int m = sc.nextInt();
        System.out.println("enter number 2 ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum of numbers from " + m + " to " + n + " is " + sum);

    }
}
