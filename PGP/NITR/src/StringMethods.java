
public class StringMethods {

	public static void main(String[] args) {
		String s1 = new String("edureka");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("Size = "+ s1.length());
		System.out.println("Char @ 0 = "+ s1.charAt(0));
		System.out.println("Index of \"e\" = "+s1.indexOf("e"));
		System.out.println("Last Index of e = "+ s1.lastIndexOf("e"));
		System.out.println(s1.replace('e', '*'));
		System.out.println(s1);
	}

}
