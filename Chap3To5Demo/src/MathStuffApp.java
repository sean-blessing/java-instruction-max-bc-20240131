import java.util.Scanner;

public class MathStuffApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Math Stuff App!");
		
		Scanner sc = new Scanner(System.in);
		
		// get two numbers and add them
		
		int nbr1 = promptWholeNumber("Enter whole number 1: ", sc);
		int nbr2 = promptWholeNumber("Enter whole number 2: ", sc);
		
		double dbl1 = promptDouble("Enter a decimal number 1: ", sc);
		double dbl2 = promptDouble("Enter a decimal number 2: ", sc);
		
		System.out.println(nbr1 * nbr2);
		System.out.println(dbl1 * dbl2);
				
		System.out.println("Bye");

	}
	
	private static int promptWholeNumber(String prompt, Scanner sc) {
		int nbr = 0;
		boolean success = false;
		while (!success) {
			try {
				System.out.println(prompt);
				nbr = Integer.parseInt(sc.nextLine());
				success = true;
			}
			catch (Exception e) {
				System.err.println("Error - input must be a whole number.");
			}
		}
		return nbr;
	}
	
	private static double promptDouble(String prompt, Scanner sc) {
		double nbr = 0;
		boolean success = false;
		while (!success) {
			try {
				System.out.println(prompt);
				nbr = Double.parseDouble(sc.nextLine());
				success = true;
			} catch (Exception e) {
				System.err.println("Error - input must be a decimal number.");
			}
		}
		return nbr;
	}

}
