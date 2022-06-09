package com.java;

public class Account {
	
	
		int account_no;
		String name;
		double balance;
		double req_amount=100;
		int deposit_amount= 1000;
		
		
		Account(int no, String nm, double bal)
		
		{
				account_no = no;
				name = nm;
				balance = bal;
		}
		void deposit()
		{
			balance = balance + deposit_amount;
			System.out.println(deposit_amount + "Rs deposited in your account your balance is " + balance);
		}
		void withdrawn()
		{	if(balance>req_amount)
			{
			 	balance = balance - req_amount;
			 	System.out.println(req_amount +"Rs withdrawn is in process wait!!!!!");
			 	System.out.print("Withdrawn is succesfully completed");
			 	System.out.print("  Your Update Balance is " + "" + balance);
			 	
			}
			else
			{
				System.out.println("Low Funds");
			}
			
		}
		
		
		void display()
		{
			System.out.println(balance);
		}
		

	public static void main(String[] args) {
		Account obj = new Account(1123,"Dheeraj", 354.54);
		obj.deposit();
		obj.withdrawn();
		//obj.display();
		
		

	}

}
