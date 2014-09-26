package Book;
//Richard Cunningham
//The purpose of this assignment is demonstrate the use of composition in OOP.
//
//
//Problem Statement
//
//A Book has such properties as title, author, and numberOfPages. A Volume will have properties such as volumeName, numberOfBooks, and an array of book objects (Book [ ]). You are required to develop the Book and Volume classes, then write an application (DemoVolume) to test your classes. The directions below will give assistance.
//
//Create a class called Book with the following properties using appropriate data types: Title, Author, numberOfPages, Create a second class called Volume with the following properties using appropriate data types: volumeName, numberOfBooks and Book [ ]. The Book [ ] contains an array of book objects.
//
//
//Directions
//
//Create a class called Book with the following properties using appropriate data types: Title, Author, numberOfPages,
//The only methods necessary in the Book class, for this exercise, are the constructor and a toString().
//Create a second class called Volume with the following properties using appropriate data types: volumeName, numberOfBooks and Book [ ]. Book [ ] will contain an array of book objects.
//The only methods necessary in the Volume class, for this exercise, are the constructor, toString() and getBookArray(). The getBookArray returns a string of book properties for each book.
//Create an application called DemoVolume
//In the main method,
//Create an array of book objects to be added to the volume
//Create a volume object called volume1
//Display the properties of volume1
//Document each statement concisely.
//Save your complete console output to a text file to turn in with this assignment.
//Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.
public class Book {
	private String title, author;
	private int numberOfPages;
	public Book()//default constructor
	{
		title="";
		author="";
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
