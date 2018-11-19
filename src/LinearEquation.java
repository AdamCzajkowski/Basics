import java.util.Scanner;

// Exercise 1
// Author: Adam Czajkowski
// Date: November 2018

public class LinearEquation {
    // User submit a and b from linear equation and program prints result (x) from it
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("a*x + b = 0");
        System.out.println("Submit a: ");
        a = scanner.nextInt();

        if (a == 0){
            System.out.println("a cannot be 0, one more try!");
            start();
        }

        System.out.println("Submit b: ");
        b = scanner.nextInt();

        System.out.println(a + "*x + " + b + " = 0");

        double x = -b/a;
        System.out.println("x = " + String.format("%.2f",x));
    }
}
