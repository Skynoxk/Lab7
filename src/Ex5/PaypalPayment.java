package Ex5;

public class PaypalPayment implements Payment{
	@Override
	public void MakePayment() {
		System.out.println("Make payment via Paypal on accoun ID : " + accountID);
	}
	@Override
	public void CancelPayment() {
		System.out.println("Cancel payment : " + accountID);
	}
}
