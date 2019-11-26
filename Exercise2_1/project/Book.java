/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String beschreibung;
    private String refNumber;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPage)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPage;
        beschreibung = "";
        refNumber = "";
    }

    // Add the methods here ...
    public String getAuthor () {
        return author;
    }
    
    public String getTitle () {
        return title;
    }
    
    public int getPages () {
        return pages;
    }
    
    public String getRefNumber () {
        return refNumber;
    }
    
    public void printTitle (){
        System.out.println (title);
    }
    
    public void printAuthor (){
        System.out.println (author);
    }
    
    public void printDetails () {
       System.out.println ("Author: "+ author + "\n" + "Title: " + title);
       System.out.println ("Pages: " + pages);
       if (beschreibung != "") {
       System.out.println ("Description: " + beschreibung);
       }
       if (refNumber != "") {
       System.out.println ("RefNumber: " + refNumber);
       }
    }
    
    public void addBeschreibung (String beschreibung) {
         this.beschreibung = beschreibung;
    }
        
    public void setRefNumber (String ref) {
        int länge = ref.length();
        if (länge >= 3) {
        refNumber = ref;
        }
        else {
        System.out.println("Error! \nPlease enter a new ref. number with at least a length of 3 numbers");
        }
}
}
