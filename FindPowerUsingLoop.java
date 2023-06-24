//Write a program to find power of a number using loop.

import java.util.Scanner;

public class FindPowerUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a base ");
        int base = sc.nextInt();
        System.out.println("enter a poear ");
        int power = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans = ans * base;
        }
        System.out.println("power is " + ans);

    }
}
