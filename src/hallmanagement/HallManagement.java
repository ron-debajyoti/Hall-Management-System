/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hallmanagement;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author ron_debajyoti
 */
public class HallManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            
            Main frame=new Main();
            frame.setVisible(true);
            File student = new File("student.txt");
            File admin = new File("admin.txt");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
        // TODO code application logic here
    }
    


