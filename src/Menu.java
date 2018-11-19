import java.util.Scanner;

// Author: Adam Czajkowski
// Date: November 2018

public class Menu {

   public static void menu() {
       Scanner scanner = new Scanner(System.in);
       while(true) {
           tableOfContent();
           int option = scanner.nextInt();

           switch (option) {
               case 1:
                   System.out.println("Exercise 1:\n");
                   LinearEquation.start();
                   System.out.println("End of program, choose another: ");

                   continue;
               case 2:
                   System.out.println("Exercise 2:\n");
                   TotalAndDifference.start();
                   System.out.println("End of program, choose another: ");

                   break;
               case 3:
                   System.out.println("Exercise 3:\n");
                   ThreedigitNumber.start();
                   System.out.println("End of program, choose another: ");

                   break;
               case 4:
                   System.out.println("Exercise 4:\n");
                   Polygon.start();
                   System.out.println("End of program, choose another: ");

                   break;
               default:
                   System.out.println("Selected exit option");
                   return;
           }
       }

   }
    public static void tableOfContent() {
        System.out.println(" 1. Linear equation - User submit a and b from linear equation and program prints result from it");
        System.out.println(" 2. Total and diffrence - User submit total and diffrence of a and b, program prints value of a and b");
        System.out.println(" 3. Three-digit number - User submit 3-digit number and program prints hundrets, tens, units of that number");
        System.out.println(" 4. Polygon - User submit number of polygon's walls and program prints value of angle between walls of the polygon");
        System.out.println(" Other: Exit\n");
        System.out.print("Program: \n");

    }
}
