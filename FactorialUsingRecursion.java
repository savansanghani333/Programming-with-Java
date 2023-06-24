//  Write a program to find factorial of a number. (Using Recursion)

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to find factorial ");
        int number = sc.nextInt();
        int ans = getFactorial(number);
        System.out.println(ans + " is factorial of " + number);
    }

    public static int getFactorial(int number) {
        if (number <= 0) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}
