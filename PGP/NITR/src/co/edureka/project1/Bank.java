package co.edureka.project1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Bank 
{
 public static void main(String[] args) 
 {
  Account acc = null;	 
  Scanner sc = new Scanner(System.in);
  while(true) 
  {
	System.out.println("1.Create/Load A/C");
	System.out.println("2.Deposit");
	System.out.println("3.Withdraw");
	System.out.println("4.Balance");
	System.out.println("5.Interest");
	System.out.println("6.Service Charge");
	System.out.println("7.Exit");
	System.out.print("enter an option: ");
	int opt = sc.nextInt();
	
	switch(opt) {
	 case 1:
		 System.out.print("enter a/c no: ");
		 String acno = sc.next();		
		 try {
			 File file = new File("src/account/"+acno+".txt");
			 if(file.exists()) {
				 FileInputStream fin = new FileInputStream(file);
				 ObjectInputStream oin = new ObjectInputStream(fin);
				 acc = (Account)oin.readObject();
			 }
		 }
		 catch(Exception ex) {System.out.println(ex.toString());}
	     if(acc == null) {
		 System.out.print("enter a/c type [1-SA / 2.CA]: ");
		 int type = sc.nextInt();		 
		 sc.nextLine();
		 System.out.print("enter name: ");
		 String name = sc.nextLine();
		 System.out.print("enter initial deposit: ");
		 float amt = sc.nextFloat();
		 
		 if(type>2) {
			 System.out.println("INVALID A/C TYPE");
		 }
		 else if(type==1) {
			System.out.print("enter interest rate: ");
			float intrst = sc.nextFloat();
			acc = new SavingsAccount(acno, name, amt, intrst);
		 }
		 else if(type==2) {
			acc = new CurrentAccount(acno,name,amt);
		 }		
	   }
	   else {
		   System.out.println("FYI: A/C is already created");
	   }
	   break;
	 case 2: //deposit
		 if(acc != null) {
		   System.out.print("enter amount to deposit: ");
		   float amt = sc.nextFloat();
		   acc.deposit(amt);
		 }
		 else {
			 System.out.println("FYI: Create A/C First");
		 }
		 break;
	 case 3: //withdraw
		 if(acc != null) {
			   System.out.print("enter amount to withdraw: ");
			   float amt = sc.nextFloat();
			   acc.withdraw(amt);			 
		 }
		 else {
			 System.out.println("FYI: Create A/C First");
		 }
		 break;	
	 case 4: //balance
		 if(acc != null) {
			 acc.getBalance();
		 }
		 else {
			 System.out.println("FYI: Create A/C First");
		 }
		 break;
	  case 5: //interest
		 if(acc instanceof SavingsAccount) {
			 ((SavingsAccount) acc).calculateInterest();
		 }
		 else {
			 System.out.println("FYI: Interest is not available for this A/c");
		 }
		 break;
	  case 6:
		  if(acc instanceof CurrentAccount) {
			  ((CurrentAccount)acc).serviceCharge();	
		  }
		  else {
			  System.out.println("FYI: Service charge is not applicable for this type of A/C");
		  }
		  break;
		  
		 default:
			 if(acc != null) {
				 try {
				  FileOutputStream fout = new FileOutputStream("src/account/"+acc.acno+".txt");
				  ObjectOutputStream out = new ObjectOutputStream(fout);
				  out.writeObject(acc);
				 }
				 catch(Exception ex) {System.out.println(ex.toString());}
			 }
			 System.out.println("** BYE BYE **");
			 sc.close();
			 System.exit(0); //to terminate the execution
	}//switch
	System.out.println("=============================\n");
  }//while
 }//main
}//class
