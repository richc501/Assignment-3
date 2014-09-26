package CharacterArray;
//Richard Cunningham
//The purpose of this assignment is to identify and use Java classes which are related to strings and their methods.
//
//
//Problem Statement
//
//Write a program which will store the following string into a character array:
//
//6901 Sudley Road Manassas VA
//
//Your program will display each original character, determine and display whether the character is a digit or a letter, and  redisplay the character according to the directions below.
//
//Directions
//
//Create a class called CharacterArray.
//The scanner class is not required
//Write a program which will accept an alpha numeric string at the keyboard.
//Store the string, of any length, into a character array, for example: 
//NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109
//For each visible character:
//Display the original character
//Determine and display whether the character is a digit or a letter
//If the character is a lower case letter, redisplay the character in upper case
//If the character is a upper case letter, redisplay the character in lower case
//If the character is a digit, display it as an * (asterisk)
//Display your output using clear and appropriate messages.
//Document each statement concisely.
//Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.
public class CharacterArray {
	public static void main(String[]args)
	{
		StringBuilder input = new StringBuilder("NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109");
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))//checks if char is digit
				input.replace(i, i+1, "*");//replace digit with *
			else if(Character.isAlphabetic(input.charAt(i)))//checks if character
			{
				char testLetterChar = input.charAt(i);//makes char at i
				String testLetterString = Character.toString(testLetterChar);//converts char to string
				if(Character.isUpperCase(input.charAt(i)))//if string upper case
				{
					testLetterString = testLetterString.toLowerCase();//makes character lower case
					input.replace(i,i+1,testLetterString);//replace character 
				}
				else
				{
					testLetterString = testLetterString.toUpperCase();//makes character upper case
					input.replace(i, i+1, testLetterString);//replace character
				}
			}
		}
		System.out.println(input);
	}
}
