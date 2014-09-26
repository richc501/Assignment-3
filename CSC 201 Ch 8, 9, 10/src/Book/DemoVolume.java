package Book;

public class DemoVolume {
	public static void main(String[]args)
	{
		Book book= new Book("Book 1","BOOK AUTHOR",10);
		Book[] book1 = new Book[10];//creates book array
		Volume volume1=new Volume("Volume 1", 10, book1);//creates volume
		volume1.getBookArray();//gets book array
		System.out.println(volume1);
	}
}
