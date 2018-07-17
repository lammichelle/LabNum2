import java.util.Scanner;

public class LabNum2 {

	public static void main(String[] args) {

		System.out.println("Welcome to Grand Circus's Room Detail Generator!");

		Scanner scnr = new Scanner(System.in);

		String answer; // created a string for later uses, and has to be placed outside of the do loop

		do { //do while loop 

			System.out.println("Enter Length: ");
			double length = scnr.nextDouble();

			System.out.println("Enter Width: ");
			double width = scnr.nextDouble();

			System.out.println("Enter Height: ");
			double height = scnr.nextDouble();

			double area = width * length;
			System.out.println("Area: " + area);

			double perimeter = (width + length) * 2;
			System.out.println("Perimeter: " + perimeter);

			double volume = (width * height * length);
			System.out.println("Volume: " + volume);

			System.out.println("Continue?(yes/no)");

			// scnr.nextLine(); - can also use garbage line when changing numeric type to
			// string - the LINE is main point
			answer = scnr.next(); 
			// alternative is scnr.nextLine();

			if (answer.equalsIgnoreCase("no")) {
				break;
			}
		} while (answer.equalsIgnoreCase("yes")); //continues looping

	}
}
