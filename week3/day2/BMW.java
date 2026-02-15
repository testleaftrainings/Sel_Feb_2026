package week3.day2;

public class BMW extends Car {
	
	public void voiceCommand() {
		System.out.println("voice cmd is enabled---->BMW CLASS");
	}
	public void turnOnAc() {
		System.out.println("AC is turned on--->BMW class");
	}
	
	public static void main(String[] args) {
		BMW b=new BMW();
		b.applyBrake();
		b.applyGear();
	}
}
