abstract class Shape{
 String color;
 /*constructor*/
 Shape(String color){
	 this.color = color;
 }
 String getColor(){
	 return this.color;
 }
 void setColor(String color){
	 this.color = color;
 }
 abstract void area();
}


class Rectangle extends Shape{
  int length, breadth;
  Rectangle(String color, int length, int breadth){
	super(color);
	this.length = length;
	this.breadth = breadth;
  }
  @Override
  public void area(){
	  System.out.println("Area of Rectangle = "+ (length*breadth));
  }
}

class AbsTest 
{
	public static void main(String[] args) 
	{
		Shape shape = null;
		shape = new Rectangle("Red",5,3);

		System.out.println("Color = "+ shape.getColor());
		shape.setColor("Yellow");
		System.out.println("Changed Color = "+ shape.getColor());

		shape.area();

		System.out.println(shape instanceof Shape); //true
		System.out.println(shape instanceof Rectangle); //true
	}
}
