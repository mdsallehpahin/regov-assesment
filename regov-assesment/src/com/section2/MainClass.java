package com.section2;

public class MainClass {
	public static void main(String[] args) throws Exception {
		/*Some Explanation to Data Structure
		 * 
		 * A user can have multiple account
		 * Balance is stored in account
		 * 
		 * */
		//Section 2 Initiate 3 instance 
		Account acc1 = new Account("Freddy Mercury", 1000);
		Account acc2 = new Account("John McAfee", 2000);
		Account acc3 = new Account("Elon Musk", 3000);
		System.out.println(acc3.toStr());
		System.out.println(acc2.toStr());
		System.out.println(acc1.toStr());
		///deposit 2000 to acc1
		acc1.deposit(2000);
		System.out.println(acc1.toStr());
		
		///withdraw 500 to acc1
		acc1.withdraw(500);
		System.out.println(acc1.toStr());
		
		//instantiate child class DevAccount acc4
		DevAccount acc4 = new DevAccount("Johnny Depp", 2032);
		
		//getBalance acc4
		System.out.println("Get Balance : " + acc4.getBalance());
		
		//setBalance acc4
		acc4.setBalance(100000);
		System.out.println(acc4.toStr());
		
		//transfer 5040 from acc4 to acc4
		acc4.transfer(acc2, 5040);
		System.out.println(acc2.toStr());
		System.out.println(acc4.toStr());
		
		//add new account to user
		DevAccount otherAcc = new DevAccount(500);
		otherAcc.setUser(acc4.getUser());
		acc4.getUser().getAccounts().add(otherAcc);
		System.out.println(acc4.getUser().getAccounts().get(0).toStr());
		System.out.println(acc4.getUser().getAccounts().get(1).toStr());
		
		//same user different account transfer
		acc4.transfer(otherAcc, 7000);
		System.out.println(acc4.getUser().getAccounts().get(0).toStr());
		System.out.println(acc4.getUser().getAccounts().get(1).toStr());


	}
}
