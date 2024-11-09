
package Jdialogue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputDialogueBoxDemo {
    public static void main(String[] args) {
        JOptionPane.showInputDialog(null,"ener your name ", "input box", 0);
       JOptionPane.showMessageDialog(null,"first name entered succesfully ");
        JFrame f=new JFrame();
         JOptionPane.showInputDialog(f,"ener your name ", "input box", 0);
        
    }
    
}
