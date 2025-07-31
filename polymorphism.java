class payment{
	void pay(double amount){
		System.out.println("Processing payment of amount "+amount);
	}
}
class CreditCardPayment extends payment{
	void pay(double amount){
		System.out.println("Paid "+amount+" using credit card.");
	}
}
class CashPayment extends payment{
	void pay(double amount){
		System.out.println("Paid "+amount+" using cash.");
	}
}
class polymorphism{
	public static void main(String args[]){
		payment obj1;
		obj1=new CreditCardPayment();
		obj1.pay(325.23);
		obj1=new CashPayment();
		obj1.pay(234.54);
	}
}
