
public class ConditionalOperator {

	public static void main(String[] args) {
		int x=100, y=20, lar=0 ;
		/*
		if(x>y) {
			lar = x;
		}
		else {
			lar = y;
		}
		*/
		
		 lar = (x>y)?x:y;
		
		System.out.println("Largest among("+x+", "+y+") = "+ lar);
				
	}
}
