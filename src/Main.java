import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double efficiency = 0;
        double price = 0;
        boolean validInput = false;

        // Loop for inputting number of gallons of gas in the tank
        do {
            System.out.print("Enter number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        validInput = false; // Reset flag for the next input

        // Loop for inputting fuel efficiency in miles per gallon
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        validInput = false; // Reset flag for the next input

        // Loop for inputting the price of gas per gallon
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Calculate cost per 100 miles
        double costPer100Miles = (100 / efficiency) * price;
        // Calculate how far the car can go with the gas in the tank
        double distance = gallons * efficiency;

        // Output the results
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");

        in.close();
    }
}
