package Collection;

class pay{
	double amount;
	public pay(double amount){
		this.amount = amount;
	}
	public void pay() {
		System.out.println("paid amount : "+ amount+ " using UPI");
	}
}

class debitcard extends pay{
	public debitcard(double amount) {
		super(amount);
	}
	@Override
	public void pay() {
		System.out.println("paid amount : "+amount+" using debitcard");
	}
}
class Credit_card extends pay{
	public Credit_card(double amount) {
		super(amount);
	}
	@Override
	public void pay() {
		System.out.println("paid amount : "+amount+" using Credit_card");
	}
}

class payment_process{
	public static<t extends pay> void payment_process(t pay){
		pay.pay();
	}
}


public class payment {

	public static void main(String[] args) {
		Credit_card c = new Credit_card(2345.00);
		payment_process.payment_process(c);
	}

}
