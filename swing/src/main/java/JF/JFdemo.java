
package JF;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class JFdemo extends JFrame{
       Container c;
       JLabel uL,cl;
       Font f;
    JFdemo(){
        ic();
        
    
    }
    void ic(){
       c=this.getContentPane();
       f=new Font("Arial",Font.ITALIC,20);
       c.setBackground(Color.pink);
      c.setLayout(null);
       uL=new JLabel();
       cl=new JLabel();
       cl.setText("enter your age : ");
       cl.setBounds(10, 10,250,20);
        cl.setFont(f);
        cl.setForeground(Color.red);
        cl.setOpaque(true);
        cl.setBackground(Color.BLACK);
       c.add(cl);
      
       uL.setText("enter your halls  name : ");
       uL.setBounds(10,25,250,20);
        uL.setFont(f);
       c.add(uL);
      
       
    }
    
    
    public static void main(String[] args) {
        JFdemo f=new JFdemo();
        f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setBounds(400,40,500, 550);
       f.setResizable(false);
        
      
      
        
         
    }
    
}
