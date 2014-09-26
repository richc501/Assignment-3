package Room;
//Richard Cunningham
//The purpose of this assignment is to create a class that includes attributes 
//and the methods that are included in a class to support object oriented programming such as constructors, sets, gets, and a method to print out all attributes.
//Problem Statement

//Create a class that describes one room in a house. The room will have walls that are painted a color. 
//The floor will either be hard wood, carpeting, or tiled. The room may or may not have windows, 
//but it is possible to have multiple windows in the room. This class must include a constructor 
//that takes no input arguments and also an overloaded constructor that takes an input argument for each attribute. 
//The class must include a set and get method for each attribute. The class must also include a method that will print out the current values of all attributes to the console. Create a main method that is in a separate class.
//The main method will create one room that is painted yellow with hard wood flooring, and 1 window. 
//The main method must create a second room that is painted purple, has tiled floors, and has no windows. 
//The main method must also create a room that is carpeted and painted white with 3 windows. 
//Each of these rooms must be created and printed out in the main method.

//Directions

//Create a class in Java that meets the requirements of the previous problem statement.
//Run the program and save the console output to a text file.
//Upload your Java source code file and your output text file in Blackboard using the Assignment Upload area below.
public class Room {
	private String wall, floor;
	private int windows;
	
	public Room()//default constructor
	{
		wall="";
	}
	public Room(String colorOfWall, String typeOfFloor,int numberOfWindows)//constructor
	{
		this.wall=colorOfWall;
		this.floor=typeOfFloor;
		this.windows=numberOfWindows;
	}
	public String toString()
	{
		return "Room: Wall= "+ wall + " getwall= "+getWall()+"\n"
			+  "      Floor= "+ floor + " getFloor= "+getFloor()+"\n"
			+  "      # of Windows= "+ windows + " getWindows= "+getWindows();
	}
	//getters and setters
	public String getWall() {
		return wall;
	}
	public void setWall(String colorOfWall) {
		this.wall = colorOfWall;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String typeOfFloor) {
		this.floor = typeOfFloor;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int numberOfWindows) {
		this.windows = numberOfWindows;
	}
	
}
