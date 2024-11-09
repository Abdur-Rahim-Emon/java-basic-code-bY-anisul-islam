
package Jdialogue;

import javax.swing.JOptionPane;

public class ShowConformDialogueDemo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"enter your name ","ARE",3);
       String s=JOptionPane.showInputDialog(null,"Name : ","are",3);
       JOptionPane.showMessageDialog(null,"your name ; "+s);
       int c=JOptionPane.showConfirmDialog(null,"enter your choice ","are",JOptionPane.YES_NO_CANCEL_OPTION );
      if(c==JOptionPane.YES_OPTION) 
      {
          JOptionPane.showMessageDialog(null,"enter correct name");
      }
      else
          JOptionPane.showMessageDialog(null,"not correct name");
    }
}
