package MyGui;




/*
Class Name: Movie
Class Author: Raelene Gomes
******************************************************
This class contains all of the methods for the Movie item.
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
public class Movie extends StoreItem{
    static int movieCount;
    String title; // if comment this out
    String actor;
    String actress;
    String director;
    
    public Movie(String title, String author, 
                    int purchasePrice, int askingPrice, String actor, 
                    String actress, String director)
    {
        super(title, author, purchasePrice, askingPrice);
        this.title = title;  // if comment this out
        this.actor = actor;
        this.actress = actress;
        this.director = director;
        movieCount++;
    }
    
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
        String string = (super.printableString() + "\nDirector: " + 
            getDirector() + "\nActor: " +
            getActor() +"\nActress: " + getActress());
        return string;
    }
    public String getTitle() // if comment this out
    {
        return title;
    }
    
    public void setTitle(String title) // if comment this out
    {
        this.title = title;
    }
    
    public String getDirector()
    {
        return director;
    }
    
    public void setDirector(String director)
    {
        this.director = director;
    }
    
//    public Date getDate()
//    {
//        return dateAquired;
//    }
//    
//    public void setDate(Date date)
//    {
//        this.dateAquired = date;
//    }
    
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
    
    public String getActor()
    {
        return actor;
    }
    
    public void setActor(String actor)
    {
        this.actor = actor;
    }
    
    public String getActress()
    {
        return actress;
    }
    
    public void setActress(String actress)
    {
        this.actress = actress;
    }
    

    
}
