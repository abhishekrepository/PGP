package co.edureka.project1;

import java.io.Serializable;

public abstract class Account implements Serializable {
 String acno;
 String name;
 float bal;
 
public Account() {
}
public Account(String acno, String name, float bal) {
	this.acno = acno;
	this.name = name;
	this.bal = bal;
}
public void deposit(float amt) {
	this.bal += amt;
	System.out.println("Rs."+amt+" deposited || Balance: "+this.bal);
}

public void withdraw(float amt) {
	if(amt <= this.bal) {
		this.bal -= amt;
		System.out.println("Rs."+amt+" debited || Balance: "+this.bal);
	}
	else {
		System.out.println("ERROR: Insufficient Balance");
	}
}

public void getBalance() {
	System.out.println("A/C No:"+this.acno+" | Name:"+this.name+" | Balance:"+this.bal);
}
}
