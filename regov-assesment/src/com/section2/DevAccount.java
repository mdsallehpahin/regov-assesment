package com.section2;

public class DevAccount extends Account{
	
	public DevAccount(String name, double balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
	}
	public DevAccount(double balance) {
		super("", balance);
		// TODO Auto-generated constructor stub
	}
	public double getBalance() {
		return super.balance;
	}
	
	public void setBalance(double balance) {
		super.balance = balance;
	}
	
	public void transfer(Account receipientAccount, double amount) throws Exception{
		this.withdraw(amount);
		receipientAccount.deposit(amount);
	}
	
	
}