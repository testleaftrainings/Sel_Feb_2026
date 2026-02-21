package week4.day1;


public class Axis extends ICICI  implements RBI{

	@Override
	public void KYC() {
		System.out.println("AADHAR CARD");
		
	}
	public  void reportTransactions() {
		System.out.println("transactions should be >5Lakh");
	}
	public void housingLoan() {
		System.out.println("5%");
	}
	
	
}

