package PS1;
import java.util.Scanner;

public class TestRectangle {
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
		Rectangle[] rectangles = new Rectangle[5];

		 for (int i = 0; i < 5; i++) {
		     System.out.println("Enter length for Rectangle " + (i + 1) + ": ");
		     double length = scanner.nextDouble();
		     System.out.println("Enter breadth for Rectangle " + (i + 1) + ": ");
		     double breadth = scanner.nextDouble();

		     rectangles[i] = new Rectangle(length, breadth);
		 }

		 for (Rectangle rectangle : rectangles) {
		     rectangle.displayInfo();
		     System.out.println("----------");
		 }
	}
 }
}
