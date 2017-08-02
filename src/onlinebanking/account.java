

package onlinebanking;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class account {
public void mt(final JFrame frame,String fname,String lname,final String uname,String pwd,String email,String dob,String gender,int accno,int bal)
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
  
    Font font2 = new Font("Papyrus", Font.BOLD, 25);
  
    JLabel l1=new JLabel("Account Information");
   // Font font1 = new Font("Arial Rounded MT Bold", Font.BOLD, 32);
    l1.setFont(font2);
    l1.setLocation(400,145);
    l1.setSize(1000,100);
    
    JPanel p1=new JPanel();
   // p1.setBackground(Color.blue);
    p1.setLayout(null);
    p1.setLocation(0, 0);
    p1.setSize(1000, 700);
    p1.add(l1);
    p1.setBackground(new Color(176,237,50));
    
   String acc=Integer.toString(accno);
   String bl=Integer.toString(bal);
   String s="Fname:\t\t"+fname+"\t\t"+"Lname:\t"+lname+"\n"+
            "Username:\t\t"+uname+"\n"+
            "Email id:\t\t"+email+"\n"+
            "Date of birth:\t"+dob+"\n"+
            "Gender:\t\t"+gender+"\n"+
            "Account no.:\t"+(String)acc+"\n"+
            "Balance Ammount:\t"+bl;
    
    final JTextArea b11= new JTextArea(s, 24, 30);
    
 b11.setFont(font2);
    b11.setForeground(Color.black);
    b11.setLocation(10,205);
    b11.setSize(1000,550);
        b11.setEditable(false);
        b11.setLineWrap(true);
        b11.setWrapStyleWord(true);
   p1.add(b11);
 b11.setBackground(new Color(176,237,50));
 
    
    
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
           t.gui(frame,uname);
        }

           
    });
    
    frame.add(p1);

}   
}