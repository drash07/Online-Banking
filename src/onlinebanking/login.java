
package onlinebanking;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class login {
    private static String pwd;
    private static String uname;
public static void log_in(final JFrame frame)
{
    
    
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
  frame.add(p1);
  
        JPanel p2 = new JPanel();
        p2.setBackground(Color.black);
        p2.setLayout(null);
        p2.setLocation(0,101);
        p2.setSize(1000,50);
    frame.add(p2);
  
     
    JPanel p=new JPanel();
    p.setBackground(Color.white);
    p.setLayout(null);
    p.setLocation(0, 0);
    p.setSize(1000, 600);
    
     JLabel l1=new JLabel("Username :");

    l1.setFont(font1);
    l1.setLocation(250,200);
    l1.setSize(200,50);
    l1.setForeground(Color.white);
    p.add(l1);
    
    final JTextField t1 = new JTextField(25);
    t1.setLocation(500,210);
    t1.setSize(175,25);
    p.add(t1);

    JLabel l2=new JLabel("Password :");
 
    l2.setFont(font1);
    l2.setLocation(250,300);
    l2.setSize(200,50);
    p.add(l2);
    l2.setForeground(Color.white);
    final JPasswordField t2 = new JPasswordField(25);
    t2.setLocation(500,310);
    t2.setSize(175,25);
    p.add(t2);
        JButton jb = new JButton("Login");
    jb.setLocation(400,400);
    jb.setSize(100,30);
    p.add(jb);
    frame.add(p);

    JButton l3=new JButton("New?? Make an Account");
    
    l3.setFont(font1);
    l3.setLocation(50,450);
    l3.setSize(1000,50);
    p.add(l3);
    l3.setBorder(null);
    l3.setForeground(Color.black);
    l3.setContentAreaFilled(false);
    
    l3.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
            try {
                signup sp = new signup();
                frame.getContentPane().removeAll();
                frame.validate();
                frame.repaint();
                sp.sign_up(frame);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
                
               
        }  
         });
   
      ImageIcon icon3=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\login.jpg");
        JLabel pics3=new JLabel();
        pics3.setLocation(0,152);
        pics3.setSize(1000,548);
        pics3.setIcon(icon3);
        p.add(pics3);
     
    JButton jbb = new JButton("Home");
    jbb.setLocation(0,10);
    jbb.setSize(100,30);
    p2.add(jbb);
    
    jbb.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
           Mainproj t=new Mainproj();
           frame.getContentPane().removeAll();
           frame.validate();
           frame.repaint();
           frame.setVisible(false);
           t.gui(frame);
        }

           
    });
    
    jb.addActionListener(new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent e)
        {
                try {

                    String user = t1.getText();
                    String passwd = t2.getText();

                    data(user, passwd,frame);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                     
               
        }
    });
    
    
    
    
}    
static void data(String user,String passwd,JFrame frame) throws ClassNotFoundException, SQLException
   {   
    try
    {
   Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
                    String selectSQL = "SELECT uname, pwd FROM login WHERE uname = ? and pwd = ?";
                    PreparedStatement pst1 = con.prepareStatement(selectSQL);
                    pst1.setString(1,user);
                    pst1.setString(2,passwd);
                 
                    ResultSet rs = pst1.executeQuery();
                    int count=0;
    while (rs.next()) 
      {
	String userid = rs.getString(1);
	String pass = rs.getString(2);	
        
        System.out.println("uname : " + userid);
	System.out.println("pwd : " + pass);
        if(userid.equals(user) && pass.equals(passwd))
        {
           count++;
           Mainproj_log t=new Mainproj_log();
           frame.getContentPane().removeAll();
           frame.validate();
           frame.repaint();
           frame.setVisible(false);
           t.gui(frame,userid);
           
        }
        break;
        
      }
      if(count==0)
      {
             
      }
            pst1.close();
            con.close();      
            
    }
  catch (SQLException e){
  System.out.println("SQL statement is not executed!");
  }
   }
}

    
        

