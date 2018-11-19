import java.util.Scanner;

// Exercise 2
// Author: Adam Czajkowski
// Date: November 2018

public class TotalAndDifference {
    // User submit total and diffrence of a and b, program prints value of a and b
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;

        System.out.println("Submit total (a+b) and difference (a-b) between a and b");
        System.out.println("Submit total: ");
        double total = scanner.nextDouble();

        System.out.println("Submit difference: ");
        double diff = scanner.nextDouble();

     // *******************************************************************/
        // a+b = total
        // a-b = diff
        // a = total - b
        // (total - b) -b = diff
        // total - 2b = diff
        // -2b = diff - total
        // b = (diff - total)/-2
        // a = total - ((diff - total)/-2)
     // *******************************************************************/

        b = (diff - total)/-2;
        a = total - ((diff - total)/-2);

        System.out.println("a = " + String.format("%.2f", a) + ", b = " + String.format("%.2f", b) );
    }
}
