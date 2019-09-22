import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("How many natural numbers to be displayed: ");
		int n = sc.nextInt();
		
		System.out.print("Which Pattern[1-Multiline/2-Singleline: ");
		int pattern = sc.nextInt();
		if(pattern > 2) {
			System.out.println("Invalid Pattern");
		}
		else {
       	  System.out.println("First "+n + " Natural Numbers are:");	
		  if(pattern==1) {
			pattern1(n);
		  }
		  else {
			pattern2(n);
		  }
		}
		sc.close();
	}
	
	static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			if(i==1)
				System.out.print(i);
			else
				System.out.print(", "+i);
		}
	}
}
