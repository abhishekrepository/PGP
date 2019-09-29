package co.edureka.project1;

import java.io.Serializable;

public class SavingsAccount extends Account implements Serializable{
 float interest;
 public SavingsAccount(String acno, String name, float amt, float intrst) {
	 super(acno,name,amt);
	 this.interest = intrst;
	 System.out.println("Savings Account is created");
 }
 public void calculateInterest() {
	 float intrst = this.bal*this.interest/100;
	 System.out.println("Interest of Rs. "+ intrst+" is crediting to a/c:"+this.acno);
	 super.deposit(intrst);
 }
}
