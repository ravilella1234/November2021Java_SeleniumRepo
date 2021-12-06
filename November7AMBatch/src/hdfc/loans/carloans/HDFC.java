package hdfc.loans.carloans;

public class HDFC implements Rbi, Rbi1
{

	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden desopit in HDFC");
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in HDFC");
	}

	@Override
	public void miniStatement() {
		// TODO Auto-generated method stub
		
	}

}
