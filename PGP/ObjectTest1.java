class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		empno = 102;
		name = "Nitin";
		sal = 36500.5f;
	}

	void displayDetails(){
      System.out.println(empno+" | "+name+" | "+sal);
	}
	
} //class

class ObjectTest1
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);

		/*assigning the state using reference*/
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);
		emp.displayDetails();

		/* change the state of object using method*/
		emp.setDetails();
		emp.displayDetails();
	}
}
