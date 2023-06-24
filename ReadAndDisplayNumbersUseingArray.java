
//  Write a program to read and display n numbers using an array

import java.util.Scanner;

public class ReadAndDisplayNumbersUseingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element enter by you ?");
        int number = sc.nextInt();
        int a[] = new int[number];
        System.out.println("enter element of array");
        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("your enter numbers are ");
        for (int i = 0; i < number; i++) {
            System.out.println(a[i]);
        }
    }
}
