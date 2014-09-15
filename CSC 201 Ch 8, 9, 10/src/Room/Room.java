package Room;

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
