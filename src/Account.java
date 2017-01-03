import java.util.*;

public class Account {
//creating field variables
	static private int id;
	static private double balance;
	static private double annualInterestRate;
	static private Date dateCreated;
	
//argument-free constructor 
	public Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = new Date();
	}
//constructor with arguments
	public Account(int _id, double _balance, double _annualInterestRate){
		id=_id;
		balance=_balance;
		annualInterestRate=_annualInterestRate;
		dateCreated = new Date();
	}
//-----------------------------------------------Setters and Getters
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
//------------------------------------------------------------------
	
//monthly interest rate methods
	public double getMonthlyInterestRate(){
		double monthlyInterestRate=annualInterestRate/12;
		return monthlyInterestRate;
	}
	public double getMonthlyInterest(){
		double monthlyInterest= (balance*getMonthlyInterestRate()/100);
		return monthlyInterest;
	}

//depositing/withdrawing methods
	public void withdraw(double withdrawl) {
		balance -=withdrawl;
	}
	public void deposit(double deposit){
		balance +=deposit;
	}
	
	
//*****************************************************Main Method
	
	public static void main(String[] args) {
		Account account = new Account();
		account.setId(1122);
		account.setBalance(20000.00);
		account.setAnnualInterestRate(4.5);
		System.out.println("ID: " + id);
		System.out.println("Balance: $" + balance);
		System.out.println("Annual Interest Rate: " + annualInterestRate +"%");
		System.out.println("Date Created: " + dateCreated);
		account.withdraw(2500);
		System.out.println("WITHDRAWING $2500:\n");
		System.out.println("ID: " + id);
		System.out.println("Balance: $" + balance);
		System.out.println("Annual Interest Rate: " + annualInterestRate +"%");
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Date Created: " + dateCreated);
		account.deposit(3000);
		System.out.println("DEPOSITING $3000:\n");
		System.out.println("ID: " + id);
		System.out.println("Balance: $" + balance);
		System.out.println("Annual Interest Rate: " + annualInterestRate +"%");
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Date Created: " + dateCreated);
		
		
	}
}
