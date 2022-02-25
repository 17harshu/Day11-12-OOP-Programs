package com.account.balance;

import java.util.Scanner;

public class Account {
	Scanner scanner = new Scanner(System.in);
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void debit(double balance) {
		System.out.println("Enter amount to withdraw");
		double withdraw = scanner.nextDouble();
		if (withdraw > balance)
			System.out.println("Withdraw exceeds the balance please enter correct ammount");
		else
			balance = balance - withdraw;
		System.out.println("Remaining balance is " + balance);

	}

}
