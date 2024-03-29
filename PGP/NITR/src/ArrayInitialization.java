
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {98,96,97,85,76,94};
		
		System.out.println("No of Subjects = "+ marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Mark for Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		System.out.print("Marks Obtained :  ");
		/* array iteration using enhanced for loop*/
		for(int mark : marks) {
			System.out.print(mark+ " | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
