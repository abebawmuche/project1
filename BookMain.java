
package encapsulation;
import java.util.Scanner;
public class BookMain
{
    public static void main(String a[]){
      
    Scanner s=new Scanner(System.in);
    System.out.println("enter author name");
    String n=s.next();
     System.out.println("enter author title");
    String t=s.next();
    
     System.out.println("enter isbn");
    String isbn=s.next();
    BOOK b=new BOOK(n,t,isbn);
    System.out.println("the author name="+b.getAuthorName());
    System.out.println("the title="+b.getTitle());
    b.setIsbN(isbn);
    System.out.println("the isbn="+b.getisbn());
    
    
}
}
