package MyGui;


import java.util.Date;




/*
Class Name: Painting
Class Author: Raelene Gomes
******************************************************
This class contains all of the methods for the Painting item.
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
public class Painting extends StoreItem{
    static int paintCount;
    String title;
    int height;
    int width;
    String media;
    
    public Painting(String title, String author, 
        int purchasePrice, int askingPrice, int height, int width, String media)
    {
        super(title, author, purchasePrice, askingPrice);
        this.height = height;
        this.width = width;
        this.media = media;
        paintCount++;
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
        String string = (super.printableString()+ "\nMedia: " +
            getMedia() + "\nHeight: " + getHeight() + "\nWidth: " +
            getWidth());
        return string;
    }
    
    public void remove()
    {
        if(paintCount > 0)
        {
            paintCount --;
        }
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
    
    public int getHeight()
    {
        return height;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public String getMedia()
    {
        return media;
    }
    
    public void setMedia(String media)
    {
        this.media = media;
    }
    
}
