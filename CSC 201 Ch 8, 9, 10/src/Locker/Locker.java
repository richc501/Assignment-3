package Locker;
//Richard Cunningham
//The purpose of this assignment is to create a class that includes an attribute that is another class type and methods that support those attributes.
//
//Problem Statement
//
//A locker for a high school student has a locker number, a student name assigned to it, a number of books stored inside the locker, and also a combination lock. The lock is constructed with a combination that has 3 numbers between 0 and 39. The lock is opened if the user turns the lock to the right to the first combination number, and then left to the second combination number, and then right to third combination number. When the dial is reset it will then be pointing to 0.
//
//Create a class to represent the locker and another class to represent the combination lock. The Locker class will include an attribute that is of type CombinationLock. Each class must include a constructor with no input argument and also a constructor that requires input arguments for all attributes. Each class must include the appropriate set and get methods. Each class must include a method to print out all attributes.
//
//The CombinationLock class must include the following problem specific methods:
//
//A method named resetDial that resets the dial to position 0.
//A method named turnLeft that will turn the dial to the left a certain number of ticks from the current position. The number of ticks to turn will be passed as an input argument to this method.
//A method named turnRight that will turn the dial to the right a certain number of ticks from the current position. The number of ticks to turn will be passed as an input argument to this method.
//A method named openLock that will try to open the lock with a combination. The combination that is tried will be passed as three input arguments to this method. This method will return true if the lock opens successfully and will return false if the lock is not opened successfully.
//The Locker class must include the following problem specific methods:
//
//A method named putBookInLocker that puts one additional book into the locker. This method does not take any input arguments and does not return a value.
//A method named removeBookFromLocker that tries to remove one book from the locker. This method does not take an input argument, but does return a value. The book returns true if the book is removed successfully and returns false if the book is not removed successfully.
//A method named openLocker that will try to open the locker. This method will prompt the user to input the three numbers in the combination to try. This method will print out the success or failure of opening the locker.
//The main method will be in a separate class from the Locker and the CombinationLock classes. This main method must complete the following:
//
//Creates locker number 100 for Mickey Mouse. The combination for this locker is 28, 17, 39. This locker will include 3 books.
//Create locker number 275 for Donald Duck. The combination for this locker is 35, 16, 27. This locker will include 0 books.
//Try to open the locker for Mickey Mouse using 15, 18, 18.
//Add three books to Mickey Mouse’s locker.
//Remove one book from Donald Duck’s locker.
//After all of these actions have been completed, print out the current state of both lockers to the console.
//Directions
//
//You may only use statements that are discussed in the book through Chapter8.
//Console input and output must be used to solve this problem.
//Save your complete console output to a text file to turn in with this assignment.
//Post your Java source code file in Blackboard
//Post your output text file in Blackboard.
//Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.
import java.util.Scanner;
public class Locker {
	private int numberOfBooks, lockerNumber;
	private String studentName;
	private CombinationLock comboLock = new CombinationLock();
	public Scanner keyboard = new Scanner(System.in);

	public Locker()//default constructor
	{
		lockerNumber=0;
		studentName="No name";
		numberOfBooks=0;
		comboLock.reset();
	}
	public Locker(int lockerNumber, String studentName, int numberOfBooks, CombinationLock comboLock)//constructor
	{
		this.lockerNumber=lockerNumber;
		this.studentName=studentName;
		this.numberOfBooks=numberOfBooks;
		this.comboLock=comboLock;
	}
	public void putBookInLocker()//adds book to locker
	{
		//openLocker();
		System.out.println("Input Combo to add book");
		if(openLocker())
		{
			numberOfBooks++;
		}
		else
			System.out.println("FAILED");
	}
	public void removeBookFromLocker()//removes book from locker
	{
		System.out.println("Input Combo to remove book");
		if(openLocker())
		{
			if(numberOfBooks>0)
				numberOfBooks--;
			else
				System.out.println("No books are in the locker \n");
		}
		else
			System.out.println("FAILED");
	}
	public boolean openLocker()//opens locker
	{
		//asks for combination
		comboLock.reset();
		System.out.println("Input the first combination number: ");
		int num1 = keyboard.nextInt();
		System.out.println("Input the second combination number: ");
		int num2 = keyboard.nextInt();
		System.out.println("Input the third combination number: ");
		int num3 = keyboard.nextInt();

		//comboLock.openLock(num1, num2, num3);//opens lock
		return comboLock.openLock(num1, num2, num3);
	}
	//getters and setters
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public int getLockerNumber() {
		return lockerNumber;
	}
	public void setLockerNumber(int lockerNumber) {
		this.lockerNumber = lockerNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getComboLock() {
		return comboLock.toString();
	}
	public void setComboLock(int number1, int number2,int number3) {
		this.comboLock.setNumber1(number1);
		this.comboLock.setNumber2(number2);
		this.comboLock.setNumber3(number3);
	}
	public String toString()
	{
		return "lockerNumber= "+lockerNumber+" studentName= "+studentName+" numberOfBooks= "+numberOfBooks+ "\n comboLock= "+comboLock+"\n";
	}
}
