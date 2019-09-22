import java.util.Scanner;

public class Bank 
{
 public static void main(String[] args) 
 {
  Account acc = null;	 
  Scanner sc = new Scanner(System.in);
  while(true) 
  {
	System.out.println("1.Create A/C");
	System.out.println("2.Deposit");
	System.out.println("3.Withdraw");
	System.out.println("4.Balance");
	System.out.println("5.Exit");
	System.out.print("enter an option: ");
	int opt = sc.nextInt();
	
	switch(opt) {
	 case 1:
	   if(acc == null) {
		 System.out.print("enter a/c no: ");
		 String acno = sc.next();
		 sc.nextLine();
		 System.out.print("enter name: ");
		 String name = sc.nextLine();
		 System.out.print("enter initial deposit: ");
		 float amt = sc.nextFloat();
		 acc = new Account(acno,name,amt);
		 System.out.println("A/C Created!");
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
		 default:
			 System.out.println("** BYE BYE **");
			 sc.close();
			 System.exit(0); //to terminate the execution
	}//switch
	System.out.println("=============================\n");
  }//while
 }//main
}//class
