import java.util.Scanner;

class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element enter by you ???");
        int n = sc.nextInt();
        System.out.println("enter element : " + n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("sorted element are :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}