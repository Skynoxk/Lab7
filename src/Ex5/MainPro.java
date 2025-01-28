package Ex5;

import java.util.ArrayList;
import java.util.List;

public class MainPro {
	public static void main(String[] args) {
		PaypalPayment p1 = new PaypalPayment();
		Payment p2 = new CreditcardPayment();
		List<Payment> list = new ArrayList<>();
		list.add(p2);
		list.add(p1);
		for (Payment pay : list) {
			pay.MakePayment();
			pay.CancelPayment(); 
		}
	}
}
