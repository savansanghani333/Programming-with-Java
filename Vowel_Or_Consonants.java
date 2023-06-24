
//  Write a program to determine whether the entered character is vowel or not.
import java.util.Scanner;

public class Vowel_Or_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonants");
        }
    }
}
