package co.edureka.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeSave {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empno : ");
		int eno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter employee name: ");
		String name = sc.nextLine();
		
		System.out.println("enter salary: ");
		float sal = sc.nextFloat();
		
		Employee emp = new Employee(eno,name,sal);
		System.out.println(emp); //toString()
		
		/* to save the employee object*/
		FileOutputStream fout = new FileOutputStream("src/employee.txt");
		
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(emp);
		
		oout.close();
		fout.close();
		System.out.println("employee saved!");
	}
}
