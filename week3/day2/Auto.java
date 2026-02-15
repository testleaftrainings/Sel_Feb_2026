package week3.day2;

public class Auto extends Vehicle {
	public void applyMeter() {
		System.out.println("meter is applied");
	}
	public static void main(String[] args) {
		Auto a=new Auto();
		a.applyBrake();
		a.applyMeter();
	}

}
