import java.util.Scanner;

public class Sum 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("enter first no: ");
		int n1 = sc.nextInt();
		System.out.println("enter second no: ");
		int n2 = sc.nextInt();
		
		int n3 = n1+n2;
		System.out.println(n1+" + "+n2+" = "+n3);
		
		sc.close();
	}
}
