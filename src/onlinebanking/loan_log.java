package onlinebanking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loan_log {
    @SuppressWarnings("empty-statement")
    public void lo(final JFrame frame,final String user)
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
        p1.setBackground(Color.yellow);
        p1.setLayout(null);
        p1.setLocation(0,152 );
        p1.setSize(360,550);
    frame.add(p1);
    ImageIcon icon5=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\hmloan.jpg");
        JLabel pics5=new JLabel();
        pics5.setLocation(0,0);
        pics5.setSize(360,322);
        pics5.setIcon(icon5);
        p1.add(pics5);
    ImageIcon icon2=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\hmloan1.jpg");
        JLabel pics2=new JLabel();
        pics2.setLocation(20,330);
        pics2.setSize(316,140);
        pics2.setIcon(icon2);
        p1.add(pics2);
  
    JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setLayout(null);
        p2.setLocation(360,152 );
        p2.setSize(230,550);
    frame.add(p2);
    ImageIcon icon6=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\carloan.jpg");
        JLabel pics6=new JLabel();
        pics6.setLocation(0,0);
        pics6.setSize(229,220);
        pics6.setIcon(icon6);
        p2.add(pics6);
   ImageIcon icon3=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\carloan1.jpg");
        JLabel pics3=new JLabel();
        pics3.setLocation(0,230);
        pics3.setSize(229,90);
        pics3.setIcon(icon3);
        p2.add(pics3);
   
    
    JPanel p3 = new JPanel();
        p3.setBackground(Color.green);
        p3.setLayout(null);
        p3.setLocation(589,152 );
        p3.setSize(422,550);
    frame.add(p3);
    
    
    ImageIcon icon7=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\eduloan.png");
        JLabel pics7=new JLabel();
        pics7.setLocation(0,0);
        pics7.setSize(422,303);
        pics7.setIcon(icon7);
        p3.add(pics7);
        
         ImageIcon icon4=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\eduloan1.jpg");
        JLabel pics4=new JLabel();
        pics4.setLocation(0,310);
        pics4.setSize(281,96);
        pics4.setIcon(icon4);
        p3.add(pics4);
    }}