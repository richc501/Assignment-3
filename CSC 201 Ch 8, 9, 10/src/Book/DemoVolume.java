package Book;

public class DemoVolume {
	public static void main(String[]args)
	{
		Book[] book1 = new Book[10];
		Volume volume1=new Volume("Volume 1", 10, book1);
		volume1.getBookArray();
		System.out.println(volume1);
	}
}
