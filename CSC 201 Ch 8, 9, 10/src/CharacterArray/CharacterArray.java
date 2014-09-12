package CharacterArray;

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
