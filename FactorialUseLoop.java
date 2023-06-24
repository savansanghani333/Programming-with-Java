//  Write a program to find factorial of a number. (Using Loop)

import java.util.Scanner;

public class FactorialUseLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to find factorial ");
        int number = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= number; i++) {
            ans = ans * i;
        }
        System.out.println(ans + " is factorial of " + number);
    }
}
