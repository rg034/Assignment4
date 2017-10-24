package MyGui;

/*
Class Name: StoreItem
Class Author: Raelene Gomes
******************************************************
This class is the head class. All of the other classes extend this class. 
I stores the Title, Author, Purchase Price, and Asking Price of an item. 
******************************************************
Sept 22, 2017
******************************************************
Oct  03, 2017 - Work on date format. Still getting an error
Oct  05, 2017 - Removed date with permission from Dr. Woodcock
****************************************************** 
*/
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rg034
 */
public class StoreItem {
    static int itemCount;
    String title;
    String author;
   // Date dateAquired;
    int purchasePrice;
    int askingPrice;
    
    //constructor
    public StoreItem(String title, String author, 
                    int purchasePrice, int askingPrice )
    {
        this.title = title;
        this.author = author;
        //this.dateAquired = dateAquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
        itemCount++;
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
‘*** Sept 22, 2017
‘******************************************************
 */
    public String printableString()
    {
        String string = ("Title: " + getTitle() + "\nAuthor: " + getAuthor() + 
                "\nPurchase Price: " + getPurchasePrice() + "\nAsking Price: " +
                getAskingPrice());
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
//    
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
    
    public Boolean deal(int custOffer)
    {
        return true;
    }
    
    public void remove()
    {
        if(itemCount > 0)
        {
            itemCount --;
        }
    }
    
    public int calculateCommission(int custOffer)
    {
        int commission = 0;
        return commission;
    }
    

    
    
}
