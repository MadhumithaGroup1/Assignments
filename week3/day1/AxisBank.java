package week3.day1.assignment;

public class AxisBank {
	
	//overriding the method deposit
	public void deposit() {
		System.out.println("Deposit options available: FD and RD");
	}
	
	public static void main(String[] args) {
		
		BankInfo bi=new BankInfo();
		AxisBank ab=new AxisBank();
		
		//calling the methods of both BankInfoand AxisBank using respective objects
		bi.saving();
		bi.fixed();
		bi.deposit();
		ab.deposit();
		
	}

}
