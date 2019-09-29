package co.edureka.project1;

import java.io.Serializable;

public class CurrentAccount extends Account implements Serializable{
 int transCount;
 static final int ALLOWED_TRANS = 3;
 
public CurrentAccount(String acno, String name, float bal) {
	super(acno, name, bal);
	System.out.println("Current Account Created!");
}

@Override
public void deposit(float amt) {
	transCount++;
	super.deposit(amt);
}

@Override
public void withdraw(float amt) {
	transCount++;
	super.withdraw(amt);
}

@Override
public void getBalance() {
	transCount++;
	super.getBalance();
}

public void serviceCharge() {
 if(transCount > ALLOWED_TRANS) {
	 int additional = transCount-ALLOWED_TRANS;
	 transCount=0;
	 float charge = additional * 100;
	 System.out.println("Service Charge of Rs. "+charge+ " is debiting from A/C: "+this.acno);
	 super.withdraw(charge);
 }
 else
	 System.out.println("No Service Charge at this time!");
}
}
