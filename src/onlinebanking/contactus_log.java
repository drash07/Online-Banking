package onlinebanking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class contactus_log {
    public void co(final JFrame frame,final String user)
    {
        JLabel b=new JLabel("Welcome To Online Banking System");
    Font font1 = new Font("Papyrus", Font.BOLD ,32);

    b.setFont(font1);
    b.setForeground(Color.white);
    b.setLocation(200,0);
    b.setSize(1000,100);

    JPanel p11=new JPanel();
    p11.setBackground( new Color(0,102,204));
    p11.setLayout(null);
    p11.setLocation(0, 0);
    p11.setSize(1000, 100);
    p11.add(b);
  frame.add(p11);

        JPanel p22 = new JPanel();
        p22.setBackground(Color.black);
        p22.setLayout(null);
        p22.setLocation(0,101 );
        p22.setSize(1000,50);
    frame.add(p22);


   
        JButton jb2 = new JButton("Home");
    jb2.setLocation(0,10);
    jb2.setSize(100,30);
    p22.add(jb2);

    jb2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
           Mainproj_log t=new Mainproj_log();
           frame.getContentPane().removeAll();
           frame.validate();
           frame.repaint();
           frame.setVisible(false);
           t.gui(frame,user);
        }


    });


        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setLayout(null);
        p1.setLocation(0,0 );
        p1.setSize(1000,700);
    frame.add(p1);
   
    String con=" At our bank, we are committed to provide best internet banking services to our customers. Please feel free to share your Internet Banking experience with us over phone.\n"+
               "    We now provides your Account Balance and Transaction details over phone round the clock.Information on deposits & loan schemes and services also available.\n"+
"1)1800 11 22 11 (Toll free from BSNL / MTNL landlines)\n"+
"2)080 - 2659 9990 (other lines)\n"+
"3)1800 425 3800 (accessible from landlines and mobile phones)\n";
    final JTextArea b1= new JTextArea(con, 24, 30);
        Font font2 = new Font("Papyrus", Font.BOLD, 25);
 b1.setFont(font2);
    b1.setForeground(Color.black);
    b1.setLocation(10,155);
    b1.setSize(1000,550);
        b1.setEditable(false);
        b1.setLineWrap(true);
        b1.setWrapStyleWord(true);
   p1.add(b1);
 b1.setBackground(new Color(176,237,50));
    }    
}
