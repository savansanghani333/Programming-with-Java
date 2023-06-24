// Read n numbers in an array then read two different numbers, replace 1st number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class ReplaceNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element enter by you ?");
        int number = sc.nextInt();
        int a[] = new int[number];
        System.out.println("enter element of array");
        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter number1");
        int n1 = sc.nextInt();
        System.out.println("enter number2");
        int n2 = sc.nextInt();

        boolean isInclude = false;

        for (int i = 0; i < number; i++) {
            if (a[i] == n1) {
                isInclude = true;
                break;
            }
        }
        if (isInclude) {
            for (int i = 0; i < number; i++) {
                if (a[i] == n1) {
                    a[i] = n2;
                }
            }
            System.out.println("new array element is ");
            for (int i = 0; i < number; i++) {
                System.out.println(a[i]);
            }
        } else {
            System.out.println(" please! enter a valid number1 and number2");
        }
    }
}
