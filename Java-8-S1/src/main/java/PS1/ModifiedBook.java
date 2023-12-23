package PS1;

public class ModifiedBook {
 private double length = 1.0;
 private double width = 1.0;

 public double getLength() {
     return length;
 }

 public void setLength(double length) {
     if (length > 0.0 && length < 20.0) {
         this.length = length;
     } else {
         System.out.println("Invalid length. Setting to default value.");
     }
 }

 public double getWidth() {
     return width;
 }

 public void setWidth(double width) {
     if (width > 0.0 && width < 20.0) {
         this.width = width;
     } else {
         System.out.println("Invalid width. Setting to default value.");
     }
 }

 public double calculatePerimeter() {
     return 2 * (length + width);
 }

 public double calculateArea() {
     return length * width;
 }
}
