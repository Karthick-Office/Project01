package PS3;

public class TestCalculator {
 public static void main(String[] args) {
     IntegerMath addition = (a, b) -> {
         System.out.println("Addition is: " + (a + b));
         return a + b;
     };

     IntegerMath subtraction = (a, b) -> {
         System.out.println("Subtraction is: " + (a - b));
         return a - b;
     };

     IntegerMath multiplication = (a, b) -> {
         System.out.println("Multiplication is: " + (a * b));
         return a * b;
     };

     IntegerMath division = (a, b) -> {
         System.out.println("Division is: " + (a / b));
         return a / b;
     };

     Calculator calculator = new Calculator();

     calculator.operationBinary(20, 10, addition);
     calculator.operationBinary(20, 10, subtraction);
     calculator.operationBinary(20, 10, multiplication);
     calculator.operationBinary(20, 10, division);
 }
}
