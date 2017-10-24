package MyGui;


import java.util.Date;



/*
Class Name: Book
Class Author: Raelene Gomes
******************************************************
This class contains all of the methods for the Book item.
******************************************************
Sept 26, 2017
******************************************************
Oct  03, 2017 - Work on date format. Still getting an error
Oct  05, 2017 - Removed date with permission from Dr. Woodcock
Oct  10, 2017 - Changed printableString() to use super
****************************************************** 
*/
 

/**
 *
 * @author rg034
 */
public class Book extends StoreItem{
    static int bookCount;
    String title;
    String genre;
    
    //constructor
    public Book(String title, String author, 
                    int purchasePrice, int askingPrice, String genre)
    {
        super(title, author, purchasePrice, askingPrice);
        this.title = title;
        this.genre = genre;
        bookCount++;
    }
    //@Override
 /*
‘******************************************************
‘***  printableString()
‘***  Raelene Gomes
‘******************************************************
‘*** This method builds a string to display the information the user inputs
‘*** Method Inputs: none
‘*** Return value: String string
‘******************************************************
‘*** Sept 26, 2017
‘******************************************************
 */
    public String printableString()
    {
        String string = (super.printableString() + "\nGenre: " + getGenre());
        
        return string;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenry(String genre)
    {
        this.genre = genre;
    }
    
    public int getAskingPrice()
    {
        return askingPrice;
    }
    
    public void setAskingPrice(int askingPrice)
    {
        this.askingPrice = askingPrice;
    }
    
     public int getPurchasePrice()
    {
        return purchasePrice;
    }
    
    public void setPurchasePrice(int purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }
    
    public void remove()
    {
        if(bookCount > 0)
        {
            bookCount --;
        }
    }
}
