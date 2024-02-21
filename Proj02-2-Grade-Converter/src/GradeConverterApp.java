import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the grade converter app!");

		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			String letterGrade = "";
			
			System.out.print("Enter numerical grade: ");
			int numericGrade = sc.nextInt();
			
			if (numericGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericGrade >= 80) {
				letterGrade = "B";
			}
			else if (numericGrade >= 67) {
				letterGrade = "C";
			}
			else if (numericGrade >= 60) {
				letterGrade = "D";
			}
			else {
				letterGrade = "F";
			}
			
			System.out.println("Letter Grade: "+letterGrade);
			
			
			System.out.print("Continue? (Y/y) ");
			choice = sc.next();
		}
		
		System.out.println("bye");
	}

}
