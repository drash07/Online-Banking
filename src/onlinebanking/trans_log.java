

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


public class trans_log {
public void mt(final JFrame frame,final String user)
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
  
    JLabel l1=new JLabel("Money Transaction");
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
    
    JButton jb1 = new JButton("Ok");
    jb1.setLocation(500,463);
    jb1.setSize(100,30);
    p1.add(jb1);
    
   JLabel b1=new JLabel("Enter your Account No.");
    //Font font2 = new Font("Arial", Font.BOLD,15);
    b1.setFont(font2);
    b1.setLocation(300,200);
    b1.setSize(300,50);
    p1.add(b1);
    
    final JTextField t1 = new JTextField(25);
    t1.setLocation(600,213);
    t1.setSize(175,25);
    p1.add(t1);
    
    JLabel b2=new JLabel("Enter User ID");
    b2.setFont(font2);
    b2.setLocation(300,250);
    b2.setSize(300,50);
    p1.add(b2);
    
    final JTextField t2 = new JTextField(25);
    t2.setLocation(600,263);
    t2.setSize(175,25);
    p1.add(t2);
    
    JLabel b3=new JLabel("Enter Password");
    b3.setFont(font2);
    b3.setLocation(300,300);
    b3.setSize(300,50);
    p1.add(b3);
    
    final JPasswordField t3 = new JPasswordField(25);
    t3.setLocation(600,313);
    t3.setSize(175,25);
    p1.add(t3);
    
    JLabel b4=new JLabel("Enter Recepient Account no.");
    b4.setFont(font2);
    b4.setLocation(300,350);
    b4.setSize(300,50);
    p1.add(b4);
    
    final JTextField t4 = new JTextField(25);
    t4.setLocation(600,363);
    t4.setSize(175,25);
    p1.add(t4);
    
    JLabel b5=new JLabel("Enter Ammount to be transeferred");
    b5.setFont(font2);
    b5.setLocation(300,400);
    b5.setSize(300,50);
    p1.add(b5);
    
    final JTextField t5 = new JTextField(25);
    t5.setLocation(600,413);
    t5.setSize(175,25);
    p1.add(t5);
    
     ImageIcon icon5=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\trans.jpg");
        JLabel pics5=new JLabel();
        pics5.setLocation(0,152);
        pics5.setSize(1000,548);
        pics5.setIcon(icon5);
        p1.add(pics5);
   
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
    
    frame.add(p1);

    jb1.addActionListener(new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try {                       
                String user_accno= t1.getText();
                String uname = t2.getText();
                String pwd = t3.getText();
                String rec_accno = t4.getText();
                String amt =t5.getText();
                int amnt=Integer.parseInt(amt);
                System.out.println(amnt);
                
          data(user_accno,uname,pwd,rec_accno,amnt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(trans.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(trans.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             
        }
    });
}

static void data(String user_accno,String uname,String pwd,String rec_accno,int amnt) throws ClassNotFoundException, SQLException
   {   
      int temp;
    try
    {
                     Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
                    String selectSQL1 = "SELECT bal FROM login WHERE accno=?";
                    PreparedStatement pst1 = con.prepareStatement(selectSQL1);
                    pst1.setString(1,user_accno);
                    
                    
                 
                    ResultSet rs1 = pst1.executeQuery();
                   
    
       while(rs1.next())
       {
	int ubalamt;
        ubalamt = rs1.getInt(1);
        
	System.out.println(ubalamt);
       int user_new_balamt = 0;
       temp=ubalamt;
       if(temp>=amnt)
       {
           data1(user_accno,uname,pwd,rec_accno,amnt);
       user_new_balamt=ubalamt-amnt;
       temp=ubalamt+amnt;
       PreparedStatement pst3 = con.prepareStatement("update login set bal=? where accno=?");
                    pst3.setInt(1,user_new_balamt);
                    pst3.setString(2,user_accno);
                    
                    
                   pst3.executeUpdate();
                    
              
                    pst3.close();
                    pst1.close();
                    con.close();
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Insuffictient balance");
       }
       }
       }
    
  catch (SQLException e){
  }
   }
static void data1(String user_accno,String uname,String pwd,String rec_accno,int amnt) throws ClassNotFoundException, SQLException
{
    
 
try{
    
       Class.forName("com.mysql.jdbc.Driver");
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
       
       String selectSQL2 = "SELECT bal FROM login WHERE accno=?";
                    PreparedStatement pst2 = con1.prepareStatement(selectSQL2);
                    pst2.setString(1,rec_accno);
                    
                     ResultSet rs2 = pst2.executeQuery();
     while(rs2.next())
     {
        int rbalamt;
        rbalamt = rs2.getInt(1);
        System.out.println(rbalamt);
        int rec_new_balamt = 0;
       rec_new_balamt=rbalamt+amnt;
       
       PreparedStatement pst4 = con1.prepareStatement("update login set bal=? where accno=?");
                    pst4.setInt(1,rec_new_balamt);
                    pst4.setString(2,rec_accno);
                   int rowcount=pst4.executeUpdate();
                   System.out.println((rowcount+1) + " row has been updated ");
        pst4.close();
        pst2.close();
        con1.close();
     }  
}

     catch (SQLException e){
  }
           
           
       
     }    
}
