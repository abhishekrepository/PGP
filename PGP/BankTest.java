class BankTest 
{
	public static void main(String[] args) 
	{
		RBI bank = null;
		bank = new SBI();
		System.out.println(bank.a+" | "+bank.b);
		System.out.println(RBI.a+" | "+RBI.b);
		//bank.a=20; //CE
		bank.deposit(1000);
		bank.withdraw(2000);

		bank = new ICICI();
		bank.deposit(1000);
		bank.withdraw(2000);
		System.out.println(bank instanceof RBI); //true
		System.out.println(bank instanceof SBI); //false
		System.out.println(bank instanceof ICICI); //true
	}
}
