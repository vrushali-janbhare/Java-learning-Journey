// Create a Book class with title and author. Create two 
// objects using the new keyword and display their details

/**
 * Book
 */
 class Book {
   String Title ;
  String author; 
}
public class BookDemo {
    public static void main(String[] args) {
        Book B1 =new Book();
        B1.Title="Wings of Fire";
        B1.author="A. P. J. Abdul Kalam";
        System.out.println(" Book Title : "+B1.Title);
        System.out.println("Book Author : "+B1.author);
        Book B2=new Book();
        B2.Title=" The Alchemist";
        B2.author="Paulo Coelho ";
     System.out.println(" Book Title : "+B2.Title);
        System.out.println("Book Author : "+B2.author);

    }
}
