package tightCoupling;

public class Car 
{
	PetrolEngine engine;
	public Car() 
	{
		engine = new PetrolEngine();
	}
	public void move() 
	{
		System.out.print("Car is Move with ");
		engine.show();
	}
}
