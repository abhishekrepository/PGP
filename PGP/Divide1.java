class Divide1 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x/y;
		System.out.println(x+" / "+y+" = "+z);
	  }
	  catch(Exception ex){
		  System.out.println("Message: "+ex.getMessage());
		  System.out.println(ex.toString()); //objecttype with msg
		  ex.printStackTrace();//toString() + call stack

		  System.out.println();
		  if(ex instanceof ArrayIndexOutOfBoundsException){
			  System.out.println("Invalid Array Index : "+ ex.getMessage());
		  }
	  }
	  finally{
		System.out.println("Application designed & developed by");
	    System.out.println("Team @ edureka & NITR");
	  }
	  System.out.println("== done ==");
	}
}
