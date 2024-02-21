import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the student registration app!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();

		System.out.print("Enter birth year: ");
		int birthYear = sc.nextInt();
		
		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*"
							+ birthYear);

		
		System.out.println("Bye");

	}

}
