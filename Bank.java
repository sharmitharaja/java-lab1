package withdraw;

public class Bank {
	double Amount;
	//constructor to initialize the amount with 10000//
	int WithdrawlAmount;
	 Bank(double Amount){
		this.Amount=Amount;
	}
	 //method to withdraw amount//
	 void Withdraw(double WithdrawlAmount)
			  {
		  
		 String Message=Amount>=WithdrawlAmount?"Withdraw Succeful": "Insufficient funds";
		 System.out.println(Message);
		 if(Amount>=WithdrawlAmount) {
			 Amount=Amount-WithdrawlAmount; //update balance//
			 
		 }
	 }
	// method to display the total balance//
	void deposit(double DepositAmount) {
		
		Amount+=DepositAmount;
		System.out.println("DEPOSIT SUCCEFUL");
		}
	
	void Display() {
		System.out.println("THE TOTAL AMOUNT IS : "+Amount);
	}

	public static void main(String[] args) {
		//create bank object with initial amount//
		Bank account=new Bank(10000);
		//deposit 5000 to the account//
		account.deposit(4500);
		//withdraw 3000 from the account//
		account.Withdraw(2599);
		//display total balance//
		account.Display();
		

	}

}
