//import java.util.Scanner;
public class LockerDemo {

	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		CombinationLock comboForLocker1 = new CombinationLock(28, 17, 39);//creates combination for Mickey
		CombinationLock comboForLocker2 = new CombinationLock(35, 16, 27);//creates combination for Donald
		Locker locker1 = new Locker(100, "Mickey Mouse", 3, comboForLocker1);//creates locker for Mickey
		Locker locker2 = new Locker(275, "Donald Duck", 0, comboForLocker2);//creates locker for Donald
/*		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int num3 = keyboard.nextInt();*/
		locker1.openLocker();
		//locker1.openLocker(15, 18, 18);
		//locker2.openLocker(38, 14, 38);
		for(int i=0;i<3;i++)//adds three books to mickey's locker
		{
			locker1.putBookInLocker();
		}
		locker2.removeBookFromLocker();//removes a book from donald's locker
		System.out.println(locker1);
		System.out.println(locker2);
	}

}
