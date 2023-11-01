package studio7;

public class Rectangle {
	
	// instance variables:
	private  double length;
	private double width;
	
	// constructor:
	
	public Rectangle(double givenLength, double givenWidth)
	{
		this.length = givenLength;
		this.width = givenWidth;
	}
	
	
	// setter methods/ mutator methods:
	public void setLength(double length) {
		this.length = length;
	}


	public void setWidth(double width) {
		this.width = width;
	}
	
	// getter methods/ acessor methods:

	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{  
		return length;
	}
	
	// random method:
	public double getArea()
	{
		return length * width;
	}
	
	public boolean isSquare()
	{
		if( width == length) {
			return true;
		}
		else return false;
	}
	
	// to check if R1 is bigger than R2
	// static because 
	public boolean isSmaller(Rectangle R2)
	{
		if( this.getArea() > R2.getArea()) {
			return false;
		}
		else if( this.getArea()< R2.getArea()) {
			return true;
		}
		else return false; // if the two are ==
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle myRec = new Rectangle(2.0, 3.0);
		Rectangle bigRec = new Rectangle (10, 10);
		System.out.println(myRec.getArea());
		System.out.println(myRec.isSquare());
		System.out.println( myRec.isSmaller(bigRec));
		
		
	}    

}
