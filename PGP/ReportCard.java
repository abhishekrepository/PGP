import java.util.Scanner;
class ReportCard 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter student name: ");
		String name = sc.nextLine();

		System.out.print("enter the no of subjects: ");
		int no = sc.nextInt();

		/*create marks array*/
		int[] marks = new int[no];

		marksEntry(marks);

		generateReportCard(name, marks);
		sc.close();
	}//main

	static void marksEntry(int[] marks)
	{
      Scanner sc = new Scanner(System.in);
	  for(int i=0;i<marks.length;i++){
		  System.out.print("Mark for Subject-"+(i+1)+": ");
		  marks[i] = sc.nextInt();
	  }
	  sc.close();
	} //marksEntry

	static void generateReportCard(String name, int[] marks){
	  System.out.println("--------------------------------");
	  System.out.println("\t\tREPORT CARD");
	  System.out.println("NAME: "+name);
	  System.out.println("--------------------------------");
	  System.out.println("  SUBJECT\t\tMARKS");	  	
	  System.out.println("--------------------------------");
	  int total = 0;
	  for(int i=0;i<marks.length;i++){
		  System.out.println("Subject-"+(i+1)+"\t\t   "+marks[i]);
		  total = total+marks[i];
	  }
	  System.out.println("--------------------------------");
	  float avg = ((float)total)/marks.length;
	  System.out.printf("TOTAL: %d \t  AVERAGE: %.2f \n",total, avg);
	  System.out.println("--------------------------------");
	}
}
