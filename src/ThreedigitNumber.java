import java.util.Scanner;

// Exercise 3
// Author: Adam Czajkowski
// Date: November 2018

public class ThreedigitNumber {
    // User submit 3-digit number and program prints hundrets, tens, units of that number
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Submit 3-digit number: ");
        int threedigit = scanner.nextInt();

        int hundrets = threedigit / 100;
        int tens = (threedigit%100)/10;
        int units = threedigit - (hundrets*100) - (tens*10);

        System.out.println("Your number: " + threedigit);
        System.out.println("Hundrets: " + hundrets + ", Tens: " + tens + ", Units: " + units);
    }
}
