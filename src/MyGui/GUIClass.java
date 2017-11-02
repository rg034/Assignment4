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
    StoreItem[] numStoreItems = new StoreItem[20];
       
    Book book = new Book(title, author,
            purchasePrice, askingPrice, genre);
    Movie movie = new Movie(title, author,
            purchasePrice, askingPrice, director, 
            actor, actress);
    Painting painting = new Painting(title, author,
            purchasePrice, askingPrice,height, width, media);
    
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
        jLabel1 = new JLabel("                          Title");
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
        
        jLabel5 = new JLabel("Purchase Price");
        add(jLabel5);
        
        JTextField5 = new JTextField(10);
        add(JTextField5);
        
        jLabel6 = new JLabel("Genre");
        add(jLabel6);
        
        JTextField6 = new JTextField(10);
        add(JTextField6);
        
        jLabel7 = new JLabel("Director");
        add(jLabel7);
        
        JTextField7 = new JTextField(10);
        add(JTextField7);
        
        jLabel8 = new JLabel("Media");
        add(jLabel8);
        
        JTextField8 = new JTextField(10);
        add(JTextField8);
        
        jLabel9 = new JLabel("Actress");
        add(jLabel9);
        
        JTextField9 = new JTextField(10);
        add(JTextField9);
        
        jLabel10 = new JLabel("\n                                       Width");
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
        
        JButton3 = new JButton(">");
        add(JButton3);

    }
    
    /*
    This is where all of the work of the button is done. User input is sent to 
    the various classes to make the program work.
    
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
            int index = jComboBox1.getSelectedIndex();
            title = JTextField2.getText();
            author = JTextField1.getText();

            purchasePrice = Integer.parseInt(JTextField5.getText());
            askingPrice = Integer.parseInt(JTextField4.getText());

        //book
        if(index == 0)
        {
            genre = JTextField6.getText(); 
            book = new Book(title, author, purchasePrice, askingPrice, genre);
            JTextArea1.setText(book.printableString());
        }
        //movie
        else if(index == 1)
        {
            director = JTextField7.getText();
            actor = JTextField9.getText();
            actress = JTextField10.getText();

            movie = new Movie(title, author,
                purchasePrice, askingPrice, director, actor, actress);
            JTextArea1.setText(movie.printableString());           
            
        }
        //painting
        else
        {
            media = JTextField8.getText();
            width = Integer.parseInt(JTextField3.getText());
            height = Integer.parseInt(JTextField11.getText());
            painting = new Painting(title, author,
            purchasePrice, askingPrice,height, width, media);
            JTextArea1.setText(painting.printableString());

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
        int index = jComboBox1.getSelectedIndex();
        //book
        if(index == 0)
        {
            JTextField6.enable(true);
            JTextField7.enable(false);
            JTextField8.enable(false);
            JTextField9.enable(true);
            JTextField10.enable(false);
            JTextField3.enable(false);
            JTextField11.enable(false);
        }
        //movie
        else if(index == 1)
        {
            JTextField6.enable(false);
            JTextField7.enable(true);
            JTextField8.enable(false);
            JTextField9.enable(true);
            JTextField10.enable(true);
            JTextField3.enable(false);
            JTextField11.enable(false);
            
        }
        //painting
        else
        {
            JTextField6.enable(false);
            JTextField7.enable(false);
            JTextField8.enable(true);
            JTextField9.enable(false);
            JTextField10.enable(true);
            JTextField3.enable(true);
            JTextField11.enable(true);
        }
            
    }
      
    private void JButton2(java.awt.event.ActionEvent evt) 
    {   
        //clear text area
        JTextArea1.setText("");
        
        //left arrow
        count--;
        if(count < 0)
        {
            count = numStoreItems.length - 1;   
        }
        JTextArea1.setText(numStoreItems[count].printableString());
        
    }
    
    private void JButton3(java.awt.event.ActionEvent evt)
    {
        //clear text area
        JTextArea1.setText("");

        // right arrow
        count++;
        if(count >= numStoreItems.length)
        {
            count=0;
        }    
        JTextArea1.setText(numStoreItems[count].printableString());
    }
   
    
}
