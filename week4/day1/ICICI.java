package week4.day1;

public class ICICI extends SingaporeBank{

	@Override
	public void convertCurrency() {
		System.out.println("in Dollars");
		
	}
	public static void main(String[] args) {
		ICICI IC=new ICICI();
		IC.convertCurrency();
	}
	@Override
	public void KYC() {
		System.out.println("License");
		
	}

}
