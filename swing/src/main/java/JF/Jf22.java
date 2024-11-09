
package JF;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Jf22 extends JFrame{
    Container c;
    JTextField jf;
    JLabel jl;
    Jf22(){
        addComponent();
    }
    void addComponent(){
         c=new Container();
        jf=new JTextField();
        jl=new JLabel();
       
        c=this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        jl.setText("enter ");
        jl.setBounds(50,25,50,30);
        c.add(jl);
       
       jf.setBounds(50,50,260,25);
    jf.setForeground(Color.red);
    jf.setHorizontalAlignment(JTextField.CENTER);
    c.add(jf);
        
    }
    public static void main(String[] args) {
        Jf22 jf=new Jf22();
         jf.setVisible(true);
        jf.setBounds(100,200,500,550);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }
    
    
}
