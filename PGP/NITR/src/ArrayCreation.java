
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 95;
		marks[1] = 78;
		System.out.println("Size of Array = "+ marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"  ");
		}
		System.out.println();
		
		double data[] =new double[5];
		for(double d : data) {
			System.out.print(d+"  ");
		}
		System.out.println();
		
		boolean []status = new boolean[6];
		for(boolean stat : status) {
			System.out.print(stat+"  ");
		}
		System.out.println();
		
		String[] names = new String[8];
		for(String name : names) {
			System.out.print(name+" | ");
		}
	}
}
