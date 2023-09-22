package javafinalproject;

import java.util.ArrayList;

public class Calculator{

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		
		
		 try {
	           
	            shapes.add(new Rectangle(4, 6));
	            shapes.add(new Square(4));
	            shapes.add(new Circle(4));

	            for (Shape shape : shapes) {
	                shape.display();
	            }
	        } catch (Exception e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Program execution completed.");
	        }

		

	}

}
