
public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		
		System.out.println("Size of Array = "+ n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		/* display array contents in a matrix form*/
		
		for(int i=0;i<n.length;i++) {
			for(int x : n[i]) {
				System.out.print(x+"   ");
			}
			System.out.println();
		}
		
	}
}
