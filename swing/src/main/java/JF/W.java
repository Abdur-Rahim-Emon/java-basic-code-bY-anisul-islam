
package JF;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class W extends JFrame {
    Container c;
    JLabel us,as,imglabel,y;
    Color cl;
    Font f;
    ImageIcon img;
    JTextField jf;
    W(){
        c();
    }
    void c(){
       c=new Container();
       us=new JLabel();
       as=new JLabel();
       f=new Font("Arail",Font.ITALIC,20);
       c=this.getContentPane();
       c.setBackground(Color.PINK);
       c.setLayout(null);
       us.setText("enter user name ");
       us.setBounds(9,20,200,20);
       us.setForeground(Color.YELLOW);
       us.setOpaque(true);
       us.setBackground(Color.red);
      
       us.setFont(f);
       c.add(us);
       as.setText("enter admin name ");
       as.setBounds(10,40,200,20);
       as.setFont(f);
        us.setToolTipText("name ");
       c.add(as);
      
    
       img=new ImageIcon("F:\\java basic code bY anisul islam\\swing\\src\\main\\java\\JF\\download.png");
       imglabel =new JLabel(img);
       imglabel.setBounds(10,70,img.getIconWidth(),img.getIconHeight());
       c.add(imglabel);
     // for changing icon 
     this.setIconImage(img.getImage());
     imglabel =new JLabel(img);
     imglabel.setBounds(50+img.getIconWidth(),70,img.getIconWidth(),img.getIconHeight());
     c.add(imglabel);
     jf=new JTextField();
     jf.setBounds(225,20,260,25);
     jf.setFont(f);
    c.add(jf);
  
    jf=new JTextField();
    jf.setText("ARE ");
    jf.setBounds(225,45,260,25);
    c.add(jf);
    //adding image lable 
    
    
       
    }
    public static void main(String[] args) {
        W f=new W();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(400,40,500,550);
        f.setResizable(false);
        
    }
    
}
