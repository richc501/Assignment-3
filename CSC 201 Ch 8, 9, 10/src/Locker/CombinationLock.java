package Locker;
import java.util.Scanner;
public class CombinationLock {
	public Scanner keyboard = new Scanner(System.in);
	//Array for dial
	private int[] lock = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39};
	private int number1, number2, number3, lockIndex=0;

	public CombinationLock()//default constructor
	{
		this.number1=0;
		this.number2=0;
		this.number3=0;
	}
	public CombinationLock(int number1, int number2, int number3)//constructor
	{
		this.number1=number1;
		this.number2=number2;
		this.number3=number3;
	}
	public void reset()//resets array index for dial
	{
		lockIndex=0;
		//this.number1=0;
		//this.number2=0;
		//this.number3=0;
	}
	public boolean openLock(int number1, int number2, int number3)//opens locker
	{
		int testNumber1=0,testNumber2=0,testNumber3=0;//temporary numbers to check if lock is correct
		int numberOfTicks;
		
		
		numberOfTicks=(lock.length)-number1;//find number of ticks need to turn right
		//System.out.println("tick "+numberOfTicks);
		turnRight(numberOfTicks);
		
		if(this.number1==number1)//checks if inputed number is correct
			testNumber1=lock[lockIndex];
		
		numberOfTicks=(number2+lock.length)-lock[lockIndex];//find number of ticks need to turn left
		//System.out.println("tick "+numberOfTicks);
		turnLeft(numberOfTicks);
		
		if (this.number2==number2)//checks if inputed number is correct
			testNumber2=lock[lockIndex];
		
		numberOfTicks=(lock[lockIndex]+lock.length)-number3;//find number of ticks need to turn left
		//System.out.println("tick "+numberOfTicks);
		turnRight(numberOfTicks);
		
		if (this.number3==number3)//checks if inputed number is correct
			testNumber3=lock[lockIndex];
		if(testNumber1==number1&&testNumber2==number2&&testNumber3==number3)//checks if all numbers equal the correct numbers 
		{
			System.out.println("Lock open.");
			return true;
		}
		else
		{
			System.out.println("Incorrect combination.");
			return false;
		}
	}
	public int turnRight(int numberOfTicks)
	{
			for(int i=0;i<numberOfTicks;i++)
			{
				if(lockIndex==0)//resets to 0 so array doesn't break
					lockIndex=39;
				else if(lockIndex!=0)//decreases array index
					lockIndex--;
			}
			System.out.println(lock[lockIndex]);
		return lockIndex;
	}
	public int turnLeft(int numberOfTicks)//turns dial left
	{
			for (int i=0;i<numberOfTicks;i++)
			{
				if(lockIndex==39)//resets to 0 so array doesn't break
					lockIndex=0;
				else if(lockIndex!=39)//increases array index
					lockIndex++;
			}
			System.out.println(lock[lockIndex]);
		return lockIndex;
	}
	//getters and setters
	public int[] getLock() {
		return lock;
	}
	public void setLock(int[] lock) {
		this.lock = lock;
	}
	public int getNubmer1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	public String toString()
	{
		return "Number 1= "+number1+" Number 2= "+number2+" Number 3= "+number3;
	}
}
