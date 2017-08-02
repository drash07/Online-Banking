package onlinebanking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class mainpg{
final JFrame frame=new JFrame("[=]Project[=]");
final JFrame frame1=new JFrame("[=]Project[=]");
public mainpg()
{
	gui1(frame1);
}
    /**
     *
     * @param frame1
     */
    public void gui1(final JFrame frame1)
{
frame1.setVisible(false);
frame.setVisible(true);
frame.setSize(1000,700);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 JLabel b=new JLabel("Welcome");
    Font font1 = new Font("Jokerman", Font.BOLD ,50);
    b.setFont(font1);
    b.setForeground(new Color(220,12,69));
    b.setLocation(0,0);
    b.setSize(500,200);
    
JLabel b1=new JLabel("Banking was never so easy...!!Come join us.");
    Font font2 = new Font("Jokerman", Font.BOLD ,20);
    b1.setFont(font2);
    b1.setForeground(Color.white);
    b1.setLocation(0,75);
    b1.setSize(1000,200);

    JLabel b2=new JLabel("Just a click away.....");
  //  Font font2 = new Font("Jokerman", Font.BOLD ,20);
    b2.setFont(font2);
    b2.setForeground(Color.white);
    b2.setLocation(0,100);
    b2.setSize(1000,200);

    
    JPanel p=new JPanel();
    p.setBackground(Color.white);
    p.setLayout(null);
    p.setLocation(0,0);
    p.setSize(1000,700);
    p.add(b);
p.add(b1);
   p.add(b2);
    JButton b11 = new JButton("click here to enter");
    Font font3 = new Font("Jokerman", Font.BOLD ,12);
    b11.setFont(font3);
     b11.setLocation(590,55);
        b11.setSize(225,525 );
        b11.setForeground(Color.blue);
        p.add(b11);
      //  b11.setBorder(null);
        b11.setContentAreaFilled(false);
        
        b11.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
        Mainproj mpg = new Mainproj();
        frame.getContentPane().removeAll();
        frame.validate();
        frame.repaint();
        mpg.gui(frame);
        }
        });
         
ImageIcon icon2=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\gate.jpg");
        JLabel pics2=new JLabel();
        pics2.setLocation(0,0);
        pics2.setSize(1000,700);
        pics2.setIcon(icon2);
        p.add(pics2);

       
        
        frame.add(p);
}
 public static void main(String[] args) {
        
                mainpg mainpg;
        mainpg = new mainpg();
   
}
}
