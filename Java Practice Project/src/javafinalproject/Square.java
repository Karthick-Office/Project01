package javafinalproject;

public class Square extends Shape {
	 private int length;
	  

	    public Square(int length) {
	        this.length = length;
	      
	    }

	    public void display() {
	        System.out.println("Area of the Square: " + calculateArea());
	    }

	    public double calculateArea() {
	        return length * length;
	    }
}
