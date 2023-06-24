
// Write a program to calculate average of first n numbers
import java.util.Scanner;

public class AverageOfFirst_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a last number ");
        int number = sc.nextInt();
        double avg = (number + 1) / 2.0;
        System.out.println("average of first " + number + " numbers is " + avg);

    }
}
