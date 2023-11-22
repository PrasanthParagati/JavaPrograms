package encapsulation;

public class Bank {
	
	private String bankname;
	private int accnum;
	
	public void setbankname(String bankname) {
		this.bankname=bankname;
	}
	 
	public String getbankname() {
		return bankname;
	}
	
	public void setaccnum(int accnum) {
		this.accnum=accnum;
	
	}
	public double getaccnum() {
		return accnum;
	}
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		b.setbankname("SBI");
		b.setaccnum(123456);
		
		System.out.println(b.getbankname());
		System.out.println(b.getaccnum());
		
	}

}
