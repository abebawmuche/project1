
package encapsulation;


public class BOOK 
{
    private String authorName;
    private String title;
    private String isbn;
    public BOOK(String a,String t,String isbn)
    {
        this.authorName=a;
        this.title=t;
        this.isbn=isbn;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName)
    {
        
            this.authorName=authorName;
        }
      
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String t ){
        this.title=t;
    }
    public String getisbn()
    {
  
        return isbn;
    }
    public void setIsbN(String isbn){
        if(isbn.length()==10){
            this.isbn=isbn;
        }
        else{
            System.out.println("the size of the isb number is not more than 10");
        }
    }
   
    
    
}
