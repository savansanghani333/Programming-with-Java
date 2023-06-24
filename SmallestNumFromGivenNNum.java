
// Write a program to find position of the smallest number from given n numbers
import java.util.Scanner;

public class SmallestNumFromGivenNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element enter by you ?");
        int number = sc.nextInt();
        int a[] = new int[number];
        System.out.println("enter element of array");
        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int index = 0;
        for (int i = 1; i < number; i++) {
            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        System.out.println("Smallest Number is " + min + " and index is " + index);
    }
}
