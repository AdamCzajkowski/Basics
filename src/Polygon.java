import java.util.Scanner;

public class Polygon {

// Exercise 4
// Author: Adam Czajkowski
// Date: November 2018

    public static void start(){
        // User submit number of polygon's walls and program prints value of angle between walls of the polygon
        Scanner scanner = new Scanner(System.in);

        System.out.println("Submit number of polygon's walls: ");
        int walls = scanner.nextInt();
        double angle = 0;

        if (walls <= 2){
            System.out.println("polygon's minimum number of walls is 3, try one more time");
            start();
        } else if (walls == 3) {
            angle = 180/walls;
            System.out.println("Your's polygon has " + walls + " walls and value of angle between them is " + String.format("%.2f", angle));
        } else {
            angle = 360/walls;
            System.out.println("Your's polygon has " + walls + " walls and value of angle between them is " + String.format("%.2f", angle));
        }
    }
}
