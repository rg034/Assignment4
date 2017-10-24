/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author rg034
 */
public class MyGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        GUIClass newGUI = new GUIClass();
        newGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newGUI.setSize(650, 550);
        newGUI.setVisible(true);
    }
    
}
