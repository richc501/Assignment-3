package Builder;
//Richard Cunningham
//The purpose of this assignment is to identify and use Java classes which are related to strings and their methods.
//
//
//Problem Statement
//
//Write a program which will accept a string from the keyboard, “Java is fun!” Your program must determine the capacity of the string. Then, append a second string, “I love it!” to the first string. At this point you will enter a string “Yes, “ and insert this string so that the output of the entire string will display “Java is fun. Yes, I love it!”
//
//
//Directions
//
//Create a class called Builder.
//Using the StringBuilder class, write a program which will accept a string from the keyboard, “Java is fun!”
//Your program must determine and display the capacity of the string.
//Append a second string, “I love it!” to the first string.
//Require the user to enter a string “Yes, “
//Insert the string, “Yes ” at the correct location, such that the output of the entire string will be “Java is fun. Yes, I love it!”
//Display your output using clear and appropriate messages.
//Document each statement concisely.
//Save your complete console output to a text file to turn in with this assignment.
//Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.
import java.util.Scanner;
public class Builder {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//String java = keyboard.nextLine();
		String java = "Java is fun! ";//What user would inputs
		StringBuilder build = new StringBuilder(java);//creates String builder
		
		build.append(" I love it!");//adds string to string builder
		//String inputYes = keyboard.nextLine();
		String inputYes = "Yes,";//What user would input
		build.insert(build.indexOf("!")+2, inputYes);// inserts user input and first ! mark
		System.out.println(build);
	}
}
