package Cycle;

public class Cycle {
	private int numberOfWheels, weight;
	public Cycle()
	{
		numberOfWheels=100;
		weight=1000;
	}
	public Cycle(int numberOfWheels, int weight)
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
