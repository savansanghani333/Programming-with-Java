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

        for (int i = 0; i <= number - 1; i++) {
            for (int J = i + 1; i <= number; i++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
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
