package week4.day1;

public class SBI implements Inter {

	@Override
	public void KYC() {
		System.out.println("Pan Card");
		
	}
	public void goldLoan() {
		System.out.println("the interest rate is 5%");
	}
	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.KYC();
		//sbi.housingLoan();
		//sbi.reportTransactions();
		sbi.systemDesign();
		System.out.println(RBI.reportTransactions());
	}
	@Override
	public void systemDesign() {
		System.out.println("Design is in process");
		
	}

}
