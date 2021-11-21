package com.section2;

public class Account {
	private Self user;
	protected double balance;
	public Account(String name, double balance) {
		if(this.user==null) {
			this.user = new Self(name);
		}
		this.balance = balance;
		user.getAccounts().add(this);
	}
	
	public Self getUser() {
		return user;
	}

	public void setUser(Self user) {
		this.user = user;
	}

	public void deposit(double amount) {
		this.balance = this.balance+amount;
	}
	public void withdraw(double amount) throws Exception {
		if(this.balance<amount) throw new Exception("Balance is not enough. ");
		this.balance = this.balance-amount;
	}
	
	public String toStr() {
		return "ID: " +user.getId()+" - "+ user.getName() + "'s account. Balance: "+ this.balance;
	}
	
}
