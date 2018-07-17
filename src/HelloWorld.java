import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// this is a single line comment
		// this is another

		/*
		 * 
		 * This is an example of a block comment
		 * 
		 * 
		 */
		System.out.print("Hello again!");
		System.out.println("Hello World!");
		
		Scanner scnr = new Scanner(System.in);
		// this is a scanner object that can be reused over and over again
		// when switching between int to strings, need to clear out scanner
		
		System.out.println("Hey! Please enter a number: ");
		int userNum = scnr.nextInt();
		
		
		System.out.println(userNum);
		
		System.out.println("Please enter a sentence: ");
		// creating a garbage line to consume any left over stuff in the scanner
		scnr.nextLine();
		String sentence = scnr.nextLine();
		System.out.println(sentence);
		
		
		System.out.println("Please enter a double: ");
		double userDouble = scnr.nextDouble(); 
		System.out.println(userDouble);
		
		String name = "Antonella"; //1 line declaration
		String name2; //2 line declaration
		name = "Ben";
		
		final String TEST = "hello"; //this is a constant, cannot change
		// TEST = "hello again";we cannot do this 
		
		// primitive data types
		byte b = 127;
		short s = 128; 
		int i = 1333333;
		long l = 434343434343434343L; //long needs to have L or l
		float f = (float)56.7; //or can use f in the end as well
		double d = 67.99999999;
		char c = '@';
		boolean bool = true; //or false
		
		System.out.println(9 % 5); //mainly use to check even or odd num
		s++;
		s--;
		
		c++; 
		++c; 
		
		String words = "this is a sentence";
		words += " and I added some words!"; // += means it combines the same variable together
		
		short age = 35; 
		double myAge = age; // implicit casting 
		
		//explicit casting 
		//when going from larger to smaller types 
		double test = 47.95; //more precise 
		int test2 = (int)test; //truncates any precision
		
		
		// scanner should be closed at the end of the program
		scnr.close();
	}

}
