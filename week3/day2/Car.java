package week3.day2;

public class Car extends Vehicle {
	
	public void applyGear() {
		System.out.println("Gear is applied---->CarClass");
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		c.applyGear();
		c.applyBrake();
		c.soundHorn();
	}

}
