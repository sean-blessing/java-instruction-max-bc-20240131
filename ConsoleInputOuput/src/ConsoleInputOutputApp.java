import java.util.Scanner;

public class ConsoleInputOutputApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Console IO!");
		Scanner sc = new Scanner(System.in);
		
		// Get user's name
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		// Get user's favorite number
		System.out.print("Enter favorite #: ");
		int nbr = sc.nextInt();
		
		// get a percentage
		System.out.print("Enter interest rate: ");
		double interest = sc.nextDouble();
		
		System.out.println("Hello "+name+", your fav number is "+nbr+
				", and the interest rate is "+interest);
		
		System.out.println("Bye");
	}

}
