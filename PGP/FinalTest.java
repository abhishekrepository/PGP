final class A
{
	final void display(){}
}
class B extends A
{
	void display(){}
}
class FinalTest 
{
	final FinalTest(){}
	public static void main(String[] args) 
	{
		final int age = 34;
		System.out.println(age);
		//age=35; //CE
		System.out.println(age);
	}
}
