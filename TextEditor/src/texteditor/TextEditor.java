/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;
import javax.swing.JFrame;
/**
 *
 * @author user
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    gui obj=new gui();
    obj.setBounds(0,0,600,600);
    obj.setTitle("Notepad");
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
