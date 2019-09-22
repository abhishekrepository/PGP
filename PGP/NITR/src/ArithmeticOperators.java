
public class ArithmeticOperators {

	public static void main(String[] args) {
		System.out.println(10/3); //3
		System.out.println(10%3); //1
		System.out.println(-10%3); //-1
		System.out.println(10%-3); //1
		System.out.println(-10%-3); //-1
		System.out.println(625.0%10); //5.0
		//System.out.println(10/0); //java.lang.ArithmeticException
		System.out.println(10.0/0); //Infinity
		System.out.println(-10.0/0); //-Infinity
		System.out.println(0/10); //0
		System.out.println(0.0/0); //NaN
	}
}
