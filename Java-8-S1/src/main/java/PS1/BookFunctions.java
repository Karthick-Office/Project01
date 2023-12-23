package PS1;

public class BookFunctions {
 public static Book[] createBooks(String[] titles, double[] prices) {
     Book[] books = new Book[titles.length];

     for (int i = 0; i < titles.length; i++) {
         Book book = new Book();
         book.setBookTitle(titles[i]);
         book.setBookPrice(prices[i]);
         books[i] = book;
     }

     return books;
 }

 public static void showBooks(Book[] books) {
     for (Book book : books) {
         System.out.println(book.getBookTitle());
         System.out.println("Rs. " + book.getBookPrice());
         System.out.println();
     }
 }
}
