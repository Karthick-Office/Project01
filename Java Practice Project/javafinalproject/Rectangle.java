package javafinalproject;

public class Rectangle extends Shape{
	  private int length;
	    private int width;

	    public Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }

	    public void display() {
	        System.out.println("Area of the Rectangle: " + calculateArea());
	    }

	    public double calculateArea() {
	        return length * width;
	    }

}
