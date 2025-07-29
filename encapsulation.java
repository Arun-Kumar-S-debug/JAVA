class bank_details{
	String name;
	private double balance=0;
	bank_details(String name){
		this.name=name;
	}
	void deposit(double amount){
		if (0<=amount){
			balance=balance+amount;
			System.out.println("Your amount "+amount+" was deposited");
		} else {
			System.out.println("Cannot deposit negative amount.");
		}
	}
	void withdraw(double W_amount){
		if(balance>=W_amount){
			balance=balance-W_amount;
			System.out.println("Your amount "+W_amount+" was withdrawed and your current balance is "+balance);
		} else{
			System.out.println("Ineffucient balance.Your balance is "+balance+",you cannot withdraw "+W_amount);
		}
	}
}

class encapsulation{
	public static void main(String args[]){
		bank_details obj1=new bank_details("Arun");
		System.out.println(obj1.name);
		obj1.deposit(-10.0);
		obj1.deposit(800.0);
		obj1.withdraw(800.0);
		obj1.withdraw(700.0);
	}
}