package co.edureka.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EMS {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emps = null;
		File file = new File("src/employees.txt");
		
		if(file.exists()) {
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream oin = new ObjectInputStream(fin);
			Object obj = oin.readObject();
			if(obj != null && obj instanceof ArrayList)
				emps = (ArrayList)obj;
		}
		else {
			emps = new ArrayList<Employee>();
		}
		while(true) {
			System.out.println("1.Add New Employee");
			System.out.println("2.Search an Employee");
			System.out.println("3.Save All Details");
			System.out.println("4.List Employees");
			System.out.println("5.Exit");
			System.out.print("enter an option: ");
			int opt =  sc.nextInt();
			switch(opt) {
			 case 1:
				System.out.print("enter empno: ");
				int eno = sc.nextInt();
				sc.nextLine();
				System.out.print("enter name: ");
				String name = sc.nextLine();
				System.out.print("enter salary: ");
				float sal = sc.nextFloat();
				Employee emp = new Employee(eno,name,sal);
				System.out.println(emp);
				emps.add(emp);
				break;
			 case 2:
				 System.out.print("enter an empno to search: ");
				 int empno = sc.nextInt();
				 int flag=0;
				 for(int i=0;i<emps.size();i++) {
					 Employee e = emps.get(i); 
					 if(e.getEmpno() == empno) {
						System.out.println(e);
						flag=1;
						break;
					 }
				 }
				 if(flag==0) {
					 System.out.println("No matching employee found!");
				 }
				 
				 break;
			 case 3:
				 FileOutputStream fout = new FileOutputStream(file);
				 ObjectOutputStream oout = new ObjectOutputStream(fout);
				 oout.writeObject(emps);
				 System.out.println("Employee Details Saved");
				 break;
			 case 4:
				 for(Employee emp1 : emps) {
					 System.out.println(emp1);
					 Thread.sleep(1000);
				 }
				 break;
			}
		}
	}

}
