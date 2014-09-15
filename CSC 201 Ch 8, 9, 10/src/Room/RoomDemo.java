package Room;


public class RoomDemo {
	public static void main(String[]args)
	{		
		Room room1 = new Room("Yellow", "Hard Wood", 1);//creates room1
		System.out.println(room1);
		Room room2 = new Room("Purple", "Tiles Floor", 0);//creates room2
		System.out.println(room2);
		Room room3 = new Room("White", "Carpeted", 3);//creates room3
		System.out.println(room3);
	}
}
