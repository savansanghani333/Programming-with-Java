
//Write a program to calculate area of a Circle.
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a radius");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("area of circle is " + area);
    }
}