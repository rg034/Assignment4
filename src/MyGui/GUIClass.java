/*
Class name: GUIClass
Author: Raelene Gomes
***************************************************
This class contains my GUI. It includes JLabels, a JTextArea, a JComboBox, 
JTextFields, and a JButton. It also includes the user interface, that makes the
calls to the various classes. 
****************************************************
Oct 17, 2017
Oct 24, 2017  - fix combo box
              - add action listeners
              - debug issues with layout
Nov 01, 2017  - attempt to fix output of StoreItem array
Nov 07, 2017  - fixed output of StoreItem array!!
******************************************************
 */
package MyGui;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author rg034
 */
public class GUIClass extends JFrame 
{
    SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
    
    String title = "";
    String author = "";
    //Date dateAquired = new Date();
    int purchasePrice = 0;
    int askingPrice = 0;
    int height = 0;
    int width = 0;
    String media = "";
    String actor = "";
    String actress = "";
    String director = "";
    String genre = "";
    int count = 0;
    int pointer = 0;
    int index = 0; //set as book for default
    
    StoreItem[] numStoreItems = new StoreItem[5];
       
    Book book = new Book(title, author,
            purchasePrice, askingPrice, genre);
    Movie movie = new Movie(title, author,
            purchasePrice, askingPrice, director, 
            actor, actress);
    Painting painting = new Painting(title, author,
            purchasePrice, askingPrice, media, height, width);
    
    private final JLabel jLabel1;    
    private final JLabel jLabel2;    
    private final JLabel jLabel3;
    private final JLabel jLabel4;    
    private final JLabel jLabel5;    
    private final JLabel jLabel6; 
    private final JLabel jLabel7;    
    private final JLabel jLabel8;    
    private final JLabel jLabel9; 
    private final JLabel jLabel10;    
    private final JLabel jLabel11;    
    private final JLabel jLabel12; 
    private final JLabel jLabel13;

    private final JTextField JTextField1;
    private final JTextField JTextField2;
    private final JTextField JTextField3;
    private final JTextField JTextField4;
    private final JTextField JTextField5;
    private final JTextField JTextField6;
    private final JTextField JTextField7;
    private final JTextField JTextField8;
    private final JTextField JTextField9;
    private final JTextField JTextField10;
    private final JTextField JTextField11;
        
    private final JButton JButton1;
    private final JButton JButton2;
    private final JButton JButton3;
    
    private final JTextArea JTextArea1;
    
    private final JComboBox jComboBox1 =  new javax.swing.JComboBox<>();;



    public GUIClass()
    {
        super("JLabel Test");   //calls up to constructor of super class (will be on blue bar of jFrame)
        setLayout(new FlowLayout()); //easiest layout possible; just puts stuff in as you add it
        
        jLabel12 = new JLabel("Enter item information and then press ENTER.");
        add(jLabel12);
        
        jLabel13 = new JLabel(" Only fields related to selected item are active");
        add(jLabel13);
        //will need to fix this because it doesn't appear
        JTextArea1 = new JTextArea();
        JTextArea1.setColumns(50);
        JTextArea1.setRows(5);
        //JScrollPane1.setViewportView(JTextArea1);
        add(JTextArea1);
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book", "Movie", "Painting" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        
        
        //large space so that title falls where it needs to 
        jLabel1 = new JLabel("                  Title");
        add(jLabel1);
        
        JTextField1 = new JTextField(10);
        add(JTextField1);
        
        jLabel2 = new JLabel("Author");
        add(jLabel2);
        
        JTextField2 = new JTextField(10);
        add(JTextField2);
        
        jLabel3 = new JLabel("Purchase Price");
        add(jLabel3);
        
         JTextField3 = new JTextField(10);
        add(JTextField3);
        
        jLabel4 = new JLabel("\n               Asking Price");
        add(jLabel4);
        
        JTextField4 = new JTextField(10);
        add(JTextField4);
        
        jLabel5 = new JLabel("Genre");
        add(jLabel5);
        
        JTextField5 = new JTextField(10);
        add(JTextField5);
        
        jLabel6 = new JLabel("Director");
        add(jLabel6);
        
        JTextField6 = new JTextField(10);
        add(JTextField6);
        
        jLabel7 = new JLabel("                    Actor");
        add(jLabel7);
        
        JTextField7 = new JTextField(10);
        add(JTextField7);
        
        jLabel8 = new JLabel("Actress");
        add(jLabel8);
        
        JTextField8 = new JTextField(10);
        add(JTextField8);
        
        jLabel9 = new JLabel("Media");
        add(jLabel9);
        
        JTextField9 = new JTextField(10);
        add(JTextField9);
        
        jLabel10 = new JLabel("\n                     Width");
        add(jLabel10);
        
        JTextField10 = new JTextField(10);
        add(JTextField10);
        
        jLabel11 = new JLabel("Height");
        add(jLabel11);
        
        JTextField11 = new JTextField(10);
        add(JTextField11);
        
        add(jComboBox1);
        
        JButton1 = new JButton("ENTER");
        add(JButton1);
        //create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        JButton1.addActionListener(handler);
        
        JButton2 = new JButton("<");
        add(JButton2);
        //create new ButtonHandler
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton2ActionPerformed(evt);
            }
        });
        
        JButton3 = new JButton(">");
        add(JButton3);
        //create new ButtonHandler
        JButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton3ActionPerformed(evt);
            }
        });

    }
    
    /*
    This is where all of the work of the ENTER button is done. User input is 
    sent to the various classes to make the program work. 
    */
     private class ButtonHandler implements ActionListener
    {
        //handle button event
        @Override
        public void actionPerformed(ActionEvent event)
        {
            // get inputs from GUI
        try
        {
            index = jComboBox1.getSelectedIndex();
            title = JTextField1.getText();
            author = JTextField2.getText();
            purchasePrice = Integer.parseInt(JTextField3.getText());
            askingPrice = Integer.parseInt(JTextField4.getText());

        //book
        if(index == 0)
        {
            genre = JTextField5.getText(); 
            book = new Book(title, author, purchasePrice, askingPrice, genre);
            JTextArea1.setText(book.printableString());
            
            //This is polymorphism!! You can add a book to the StoreItem array
            numStoreItems[count]= book;
        }
        //movie
        else if(index == 1)
        {
            director = JTextField6.getText();
            actor = JTextField7.getText();
            actress = JTextField8.getText();

            movie = new Movie(title, author,
                purchasePrice, askingPrice, director, actor, actress);
            JTextArea1.setText(movie.printableString());
            
            //This is polymorphism!! You can add a movie to the StoreItem array
            numStoreItems[count]= movie;
            
        }
        //painting
        else
        {
            media = JTextField9.getText();
            width = Integer.parseInt(JTextField10.getText());
            height = Integer.parseInt(JTextField11.getText());
            painting = new Painting(title, author,
            purchasePrice, askingPrice,media, height, width);
            JTextArea1.setText(painting.printableString());
            
            //This is polymorphism!! You can add a painting to the StoreItem array
            numStoreItems[count]= painting;

        }
        
        //clear text fields after entering data
        JTextField1.setText("");
        JTextField2.setText("");
        JTextField3.setText("");
        JTextField4.setText("");
        JTextField5.setText("");
        JTextField6.setText("");
        JTextField7.setText("");
        JTextField8.setText("");
        JTextField9.setText("");
        JTextField10.setText("");
        JTextField11.setText("");    
        
        //don't forget to increment count
        count++;
        

        }
        catch(NumberFormatException e)
        {
            JTextArea1.setText("An error occured. Please check your input fields.");   
        }

        }
    }
     
/*
‘******************************************************
‘***  jComboBox1ActionPerformed
‘***  Raelene Gomes
‘******************************************************
‘*** This method is the action event that is called when the user uses the 
     comboBox. It enables and diables the jTextFields so that only the ones
     that correspond to the chosen object are active.
‘*** Method Inputs: action event
‘*** Return value: void
‘******************************************************
‘*** Oct 24, 2017
‘******************************************************
 */
      private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //change input accessibility based on selection
        
        index = jComboBox1.getSelectedIndex();
        //book
        if(index == 0)
        {
            JTextField5.enable(true);
            JTextField6.enable(false);
            JTextField7.enable(false);
            JTextField8.enable(false);
            JTextField9.enable(false);
            JTextField10.enable(false);
            //JTextField3.enable(false);
            JTextField11.enable(false);
        }
        //movie
        else if(index == 1)
        {
            JTextField5.enable(false);
            JTextField6.enable(true);
            JTextField7.enable(true);
            JTextField8.enable(true);
            JTextField9.enable(false);
            JTextField10.enable(false);
            //JTextField3.enable(false);
            JTextField11.enable(false);
            
        }
        //painting
        else
        {
            JTextField5.enable(false);
            JTextField6.enable(false);
            JTextField7.enable(false);
            JTextField8.enable(false);
            JTextField9.enable(true);
            JTextField10.enable(true);
           // JTextField3.enable(true);
            JTextField11.enable(true);
        }
            
    }
    
/*
‘******************************************************
‘***  JButton2ActionPerformed
‘***  Raelene Gomes
‘******************************************************
‘*** This method is the action event that is called when the user clicks the 
     left arrow. It parses through the numStoreItems array
‘*** Method Inputs: action event
‘*** Return value: void
‘******************************************************
‘*** Oct 28, 2017
     Nov 01, 2017 - attempt to fix output using technique Dr Woodcock showed me
     Nov 07, 2017 - finally got output to work!
‘******************************************************
 */
      
    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) 
    {   
        try
        {    
            //left arrow
            
            //clear text area           
            JTextArea1.setText("");
            
            //only print if not null
            if(numStoreItems[pointer]!= null)
            {    
                if(pointer < count)
                {
                    pointer = count - 1;   
                }
                JTextArea1.setText(numStoreItems[pointer].printableString());
                //System.out.println(numStoreItems[pointer].printableString());
                pointer--;
            }
            else
            {
                pointer = count - 1;
            }
            
        }
        catch(Exception e)
        {
            JTextArea1.setText("Error. Nothing in this spot in array. ");
        }
    }
    
/*
‘******************************************************
‘***  JButton3ActionPerformed
‘***  Raelene Gomes
‘******************************************************
‘*** This method is the action event that is called when the user clicks the 
     right arrow. It parses through the numStoreItems array
‘*** Method Inputs: action event
‘*** Return value: void
‘******************************************************
‘*** Oct 28, 2017
     Nov 01, 2017 - attempt to fix output using technique Dr Woodcock showed me
     Nov 07, 2017 - finally got output to work!
‘******************************************************
 */

    private void JButton3ActionPerformed(java.awt.event.ActionEvent evt)
    {
        try
        {
            // right arrow  
            
            //clear text area
            JTextArea1.setText("");
            
            //only print if not null
            if(numStoreItems[pointer]!= null)
            {    
                if(pointer >= count)
                {
                    pointer = 0;
                }    
                JTextArea1.setText(numStoreItems[pointer].printableString());
                //System.out.println(numStoreItems[pointer].printableString());
                pointer++;
            }
            else
            {
                pointer = 0;
            }
            
        }
        catch(Exception e)
        {
            JTextArea1.setText("Error. Nothing in this spot in array. ");
      
        }
    }
   
    
}
