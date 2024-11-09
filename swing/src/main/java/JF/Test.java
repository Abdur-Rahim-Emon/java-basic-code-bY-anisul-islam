
package JF;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Test  {
    
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        Container c=new Container();
        JLabel jl=new JLabel();
        jf.setVisible(true);
        jf.setBounds(110, 150,400,450);
        jf.setResizable(false);
        jf.setTitle("ARE");
        ImageIcon img=new ImageIcon("F:\\java basic code bY anisul islam\\swing\\src\\main\\java\\JF\\download.png");
        jf.setIconImage(img.getImage());
        c=jf.getContentPane();
        c.setBackground(Color.green);
        jl.setText("enter your country ");
        jl.setBounds(15,15,150,15);
        jl.setForeground(Color.red);
        jl.setOpaque(true);
        jl.setBackground(Color.white);
        c.add(jl);
        JLabel j=new JLabel("enter city : ");
        j.setBounds(15,40,150,15);
        c.add(j);
        JLabel j1=new JLabel(img);
        j1.setBounds(15,50,img.getIconWidth(),img.getIconHeight());
       // j1.setIcon(img);
        c.add(j1);
        
       
 
    }
    
}
