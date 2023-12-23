package PS1;

public class Book {
 private String bookTitle;
 private double bookPrice;

 public String getBookTitle() {
     return bookTitle;
 }

 public void setBookTitle(String bookTitle) {
     this.bookTitle = bookTitle;
 }

 public double getBookPrice() {
     return bookPrice;
 }

 public void setBookPrice(double bookPrice) {
     this.bookPrice = bookPrice;
 }

 public static void main(String[] args) {
     Book book = new Book();
     book.setBookTitle("Java Programming");
     book.setBookPrice(350.50);

     System.out.println("Book Title: " + book.getBookTitle());
     System.out.println("Book Price: Rs. " + book.getBookPrice());
 }
}
