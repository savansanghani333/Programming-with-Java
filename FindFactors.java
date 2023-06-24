// Write a program to find factors of a given number.

import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to find Factors ");
        int number = sc.nextInt();
        System.out.print("Factors of " + number + " is ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ,");
            }
        }
    }
}
