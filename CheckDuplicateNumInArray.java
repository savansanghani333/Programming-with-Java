
// Write a program to find whether the array contains a duplicate number or not.
import java.util.Scanner;

public class CheckDuplicateNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element enter by you ?");
        int number = sc.nextInt();
        int a[] = new int[number];
        System.out.println("enter element of array");
        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
        }
        boolean isDuplicate = false;
        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j <= number; j++) {

                try {
                    if (a[i] == a[j]) {
                        isDuplicate = true;
                        break;
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            if (isDuplicate) {
                break;
            }
        }
        if (isDuplicate) {
            System.out.println("array include Duplicate element");
        } else {
            System.out.println("array  not include Duplicate element");
        }
    }
}
