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
