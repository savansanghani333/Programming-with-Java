// Write a program to find whether a number is odd or even
import java.util.Scanner;

public class Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number + " is Odd number");
        }
    }
}
