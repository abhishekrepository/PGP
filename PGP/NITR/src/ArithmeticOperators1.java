
public class ArithmeticOperators1 {

	public static void main(String[] args) {
		byte b1=12;
		byte b2=23;
		//byte b3 = b1+b2; //Type mismatch - cannot convert from int to byte
		int b3 = b1+b2;
		System.out.println(b3);	
		System.out.println(b1+b2);
		
		long data = 845745812L*10;
		System.out.println(data);
		
		long n1 = 45;
		float f = 12;
		float n2 = n1+f;
	}
}
