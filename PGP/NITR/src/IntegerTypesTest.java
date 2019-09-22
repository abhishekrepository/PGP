
public class IntegerTypesTest {

	public static void main(String[] args) {
		//byte b = 128; //Unresolved compilation problem:	Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		
		long pop = 8458745841L;
		System.out.println("World Population = " + pop);
		
		int n = (int)12L;
		System.out.println(n);
		
		n = 12;
		System.out.println(n);
		
		n = 012;
		System.out.println(n); //10
		n = 0x12;
		System.out.println(n); //18
		n = 0b11;
		System.out.println(n); //3
	}
}
