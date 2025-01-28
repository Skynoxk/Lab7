package Ex5;

public class CreditcardPayment implements Payment{
	@Override 
	public void MakePayment() {
		System.out.println("Make payment via credit card : " + accountID);
	}

	@Override
	public void CancelPayment() {
		// TODO Auto-generated method stub
		System.out.println("Cancel payment in credit card : " + accountID);
	}
}
