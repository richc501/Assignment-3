package Builder;
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
