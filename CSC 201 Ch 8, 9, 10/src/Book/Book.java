package Book;

public class Book {
	private String title, author;
	private int numberOfPages;
	public Book()//default constructor
	{
		title=null;
		author=null;
		numberOfPages=0;
	}
	public Book(String title, String author, int numberOfPages)//constructor
	{
		this.title=title;
		this.author=author;
		this.numberOfPages=numberOfPages;
	}
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String toString() {
		return "Book title=" + title + ", author=" + author
				+ ", numberOfPages=" + numberOfPages;
	}
	
	
}
