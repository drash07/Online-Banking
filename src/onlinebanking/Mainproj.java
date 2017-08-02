package onlinebanking;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public final class Mainproj {
     final JFrame frame = new JFrame("[=] Project [=]");
     final JFrame frame1 = new JFrame("[=] Project [=]");
public Mainproj()
{
       gui(frame1);
}

    public void gui(final JFrame frame1)
{
     frame1.setVisible(false);
     frame.setVisible(true);     
     frame.setSize(1000, 700);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel b=new JLabel("Welcome To Online Banking System");
    Font font1 = new Font("Papyrus", Font.BOLD ,32);
    b.setFont(font1);
    b.setForeground(Color.white);
    b.setLocation(200,0);
    b.setSize(1000,100);
  
    JPanel p1=new JPanel();
    p1.setBackground( new Color(0,102,204));
    p1.setLayout(null);
    
    p1.setLocation(0, 0);
    p1.setSize(1000, 100);
    p1.add(b);
  
        JPanel p2 = new JPanel();
        p2.setBackground(Color.black);
        p2.setLayout(null);
        p2.setLocation(0,100 );
        p2.setSize(1000,50);
        
        JButton b11 = new JButton("login");
    b11.setFont(font1);
        b11.setLocation(800,0);
        b11.setSize(200,50 );
        b11.setForeground(Color.white);
        p2.add(b11);
        b11.setBorder(null);
        b11.setContentAreaFilled(false);
 
        b11.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
                    login lg = new login();
                    frame.getContentPane().removeAll();
                    frame.validate();
                    frame.repaint();
                    login.log_in(frame);
                
        }  
         });
        
         JButton b22 = new JButton("sign-up");
        b22.setLocation(600, 0);
        b22.setSize(200,50 );
        p2.add(b22);
        b22.setBorder(null);
        b22.setContentAreaFilled(false);
 b22.setForeground(Color.white);
        b22.setFont(font1);
        
        b22.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
                try {                

                    signup sp = new signup();
                    frame.getContentPane().removeAll();
                    frame.validate();
                    frame.repaint();
                    signup.sign_up(frame);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Mainproj.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Mainproj.class.getName()).log(Level.SEVERE, null, ex);
                }
               
               
        }  
         });
        
         JPanel p3=new JPanel();
         p3.setBackground(new Color(243,131,118));
         p3.setLayout(null);
         p3.setLocation(0,150);
         p3.setSize(300,585);
    
         
        
        
        JButton b2 = new JButton("Money Transaction");
        b2.setLocation(0,0);
        b2.setSize(300,50 );
        p3.add(b2);
        //b2.setBorder(null);
        b2.setContentAreaFilled(false);
        b2.setForeground(Color.black);
        b2.setFont(font1);
        
        b2.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           trans t=new trans();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            t.mt(frame);
        }  
         });
        
        JButton b3 = new JButton("ATM");
        b3.setLocation(0,90);
        b3.setSize(300,50 );
        p3.add(b3);
        //b3.setBorder(null);
        b3.setContentAreaFilled(false);
        b3.setForeground(Color.black);
        b3.setFont(font1);
        
         b3.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           ATM t=new ATM();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            t.mt(frame);
        }  
         });
        
        JButton b4 = new JButton("Demand Draft");
        b4.setLocation(0, 180);
        b4.setSize(300,50 );
        p3.add(b4);
        //b4.setBorder(null);
        b4.setContentAreaFilled(false);
        b4.setForeground(Color.black);
        b4.setFont(font1);
        
         b4.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           demanddraft d=new demanddraft();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            d.dd(frame);
        }  
         });
        
        JButton b5 = new JButton("E-pay");
        b5.setLocation(0,270);
        b5.setSize(300,50 );
        p3.add(b5);
        //b5.setBorder(null);
        b5.setContentAreaFilled(false);
        b5.setForeground(Color.black);
        b5.setFont(font1);
        
         b5.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           epay t=new epay();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            t.mt(frame);
        }
         });
        
        JButton b6 = new JButton("Contact us");
        b6.setLocation(0,360);
        b6.setSize(300,50 );
        p3.add(b6);
        //b6.setBorder(null);
        b6.setContentAreaFilled(false);
        b6.setForeground(Color.black);
        b6.setFont(font1);
        b6.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           contactus q=new contactus();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            q.co(frame);
        }
         });
        
        JButton b7 = new JButton("About us");
        b7.setLocation(0, 450);
        b7.setSize(300,50 );
        p3.add(b7);
       // b7.setBorder(null);
        b7.setContentAreaFilled(false);
        b7.setForeground(Color.black);
        b7.setFont(font1);
        
         b7.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           aboutus tau=new aboutus();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            tau.ab(frame);
        }
         });
        
            
        JPanel p4 = new JPanel();
        p4.setBackground(new Color(184,243,124));
        p4.setLocation(300,150 );
        p4.setSize(700,585);
  
        
        ImageIcon icon2=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\general.jpg");
        JLabel pics2=new JLabel();
        pics2.setLocation(300,152);
        pics2.setSize(700,250);
        pics2.setIcon(icon2);
        p4.add(pics2);
   
                 
        JPanel p5 = new JPanel();
        p5.setBackground(Color.white);
        p5.setLayout(null);
        p5.setLocation(300,400);
        p5.setSize(700,510);
  
        //loan
        JButton b9 = new JButton();
        b9.setLocation(300,400);
        b9.setSize(350,510);
        p5.add(b9);
        //b9.setBorder(null);
        b9.setContentAreaFilled(false);
        ImageIcon icon;
        icon = new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\loan.jpg");
        JLabel pics=new JLabel();
        pics.setLocation(300,400);
        pics.setSize(350,264);
        pics.setIcon(icon);
        p5.add(pics);
     
        JButton b10 = new JButton();
        b10.setLocation(650,400);
        b10.setSize(350,510);
        p5.add(b10);
      b10.setBorder(null);
        b10.setContentAreaFilled(false);

        ImageIcon icon1;
        icon1 = new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\mobile1.jpg");
        JLabel pics1=new JLabel();
        pics1.setLocation(650,400);
        pics1.setSize(350,260);
        pics1.setIcon(icon1);
        p5.add(pics1);
     
        

        b9.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           loan l=new loan();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            l.lo(frame);
        }
         });
        
       
         b10.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           e_recharge t=new e_recharge();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            t.mt(frame);
        }
         });
        
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        
        
      
}

    
    public static void main(String[] args) {
        
                Mainproj Mainproj;
        Mainproj = new Mainproj();
        
    }

}
