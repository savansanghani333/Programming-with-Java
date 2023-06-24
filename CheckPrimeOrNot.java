//  Write a program to check whether a number is prime or not.

import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to check prime or not");
        int number = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
