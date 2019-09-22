class Divide 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x/y;
		System.out.println(x+" / "+y+" = "+z);
	  }
	  catch(ArithmeticException ex){
		  System.out.println("ERROR: Cannot divide a number by zero");
	  }
	  finally{
		System.out.println("Application designed & developed by");
	    System.out.println("Team @ edureka & NITR");
	  }
	  System.out.println("== done ==");
	}
}
