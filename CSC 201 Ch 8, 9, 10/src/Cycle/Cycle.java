package Cycle;
//Richard Cunningham
//The purpose of this assignment is illustrate the use of the “this” reference with constructors, instance variables and instance methods. 
//Problem Statement
//
//[A] Create a class called “Cycle” which has two instance integer variables as properties, “numberOfWheels” and “weight.”  Create a constructor with two parameters, using the same variable names in the parameter list.  Assign each variable to numberOfWheels” and “weight” respectively.  Write a separate application to test the class and display its properties. Note: Do not change the names of the instance variables or the variables listed in the constructor’s parameter list.
//[B] Edit your class Cycle by adding a default constructor which will assign the default values of 100 to represent the numberOfWheels, and 1000 to represent the weight, by invoking a call to the other constructor.  Modify your application created in [A] to test the class.
//
//
//Directions
//
//[A] Create a class called Cycle
//
//Declare integer instance variables numberOfWheels and weight as private.
//Include a toString() method in the Cycle class.  No set or get methods are included.
//Create a constructor with two parameters, using the same variable names numberOfWheels and weight in the parameter list. Complete the constructor as necessary.
//Create a separate application to test the class
//Create an object of the Cycle class
//Display the properties of the object
//[B] Add a default constructor
//
//Edit the default constructor such that the default constructor will invoke the existing constructor with the default values of 100 to represent the numberOfWheels, and 1000 to represent the weight. Invoke the constructor using the “this” reference.
//Create the second constructor which will receive the two arguments.
//Create a separate application to test the class
//Create an object of the Cycle class
//Display the properties of the object
//Document each statement concisely.
//Post your Java source code file and output text file in Blackboard.
public class Cycle {
	private int numberOfWheels, weight;
	public Cycle()//default constructor
	{
		this(100,1000);
	}
	public Cycle(int numberOfWheels, int weight)//constructor
	{
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	
	
	
	//getters and setters
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String toString()
	{
		return "numberOfWheels= "+numberOfWheels+" weight= "+weight;
	}
}
