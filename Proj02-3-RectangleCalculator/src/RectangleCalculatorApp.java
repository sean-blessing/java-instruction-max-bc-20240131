import java.util.Scanner;

public class RectangleCalculatorApp {
    
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Rectangle Calculator");
        System.out.println();  // print a blank line

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from the user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());
            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());

            // calculate the area and perimeter
            double area = length * width;
            double perimeter = 2 * length + 2 * width;

            // display the result
            System.out.println("Area:         " +  area);
            System.out.println("Perimeter:    " +  perimeter);
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        
    }
}
