package Book;

public class Volume {
	private String volumeName;
	StringBuilder output = new StringBuilder(" ");
	private int numberOfBooks;
	private Book[] book=new Book[0];

	public Volume()//default constructor
	{
		volumeName=null;
		numberOfBooks=0;
		book=new Book[0];
	}
	public Volume(String volumeName, int numberOfBooks, Book[] book)//constructor
	{
		this.volumeName=volumeName;
		this.numberOfBooks=numberOfBooks;
		this.book= new Book[numberOfBooks];
	}
	public Book[] getBookArray()//sets array of books
	{

		int version=1, numberOfPages=(int) ((Math.random()*100)+1);;
		for(int i=0;i<numberOfBooks;i++)
		{
			String title = "Title"+version;
			String author = "Author"+version;
			Book book1 = new Book(title, author, numberOfPages);
			book[i]=book1;
			output = output.append(book[i]);
			output = output.append("\n        ");
			version++;
			numberOfPages=(int) ((Math.random()*100)+1);
		}

	//}while(numberOfBooks!=book.length);
	return book;
}
//getters and setters
public String getVolumeName() {
	return volumeName;
}

public void setVolumeName(String volumeName) {
	this.volumeName = volumeName;
}

public int getNumberOfBooks() {
	return numberOfBooks;
}

public void setNumberOfBooks(int numberOfBooks) {
	this.numberOfBooks = numberOfBooks;
}

public Book[] getBook() {
	return book;
}

public void setBook(Book[] book) {
	this.book = book;
}
public String toString() {
	return "Volume volumeName=" + volumeName + ", numberOfBooks="
			+ numberOfBooks + "\n, book=" + output;
}

}
