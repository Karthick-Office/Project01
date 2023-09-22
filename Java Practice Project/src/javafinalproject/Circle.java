package javafinalproject;

public class Circle extends Shape{
	 private int r;
	 
	    public Circle(int r) {
	        this.r= r;
	      
	    }

	    public void display() {
	        System.out.println("Area of the Circle: " + calculateArea());
	    }

	    public double calculateArea() {
	        return Math.PI*r*r;
	    }

}
