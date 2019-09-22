package co.edureka.pack2;

public class CmdTest {

	public static void main(String[] args) {
		System.out.println("No of cmd args = "+ args.length);
		for(String name : args) {
			System.out.println(name);
		}
		
		String data = "625";
		System.out.println(data+25); //62525
		
		int n = Integer.parseInt(data);
		System.out.println(n+25); //650
		n = Integer.parseInt("A"); //java.lang.NumberFormatException
		System.out.println(n);
		n = (int)'A';		
	}
}
