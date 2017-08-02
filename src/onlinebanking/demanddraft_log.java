

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


public class demanddraft_log {
public void dd(final JFrame frame,final String user)
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

    JPanel p1=new JPanel();
    p1.setBackground(new Color(176,237,50));
    p1.setLayout(null);
    p1.setLocation(0, 0);
    p1.setSize(1000, 700);
  
String l11="Want a demand draft easily and quickly?please fill in the details and get your \n"+
        "demand draft at your door step";
    JTextArea l1=new JTextArea(l11,2,20);
   // Font font1 = new Font("Arial Rounded MT Bold", Font.BOLD, 32);
    l1.setFont(font2);
    l1.setLocation(10,152);
    l1.setSize(1000,100);
    l1.setForeground(Color.black);
  p1.add(l1);
  l1.setBackground(new Color(176,237,50));
    JButton jb1 = new JButton("Ok");
    jb1.setLocation(500,613);
    jb1.setSize(100,30);
    p1.add(jb1);

   JLabel b1=new JLabel("Enter Account No.");
    //Font font2 = new Font("Arial", Font.BOLD,15);
    b1.setFont(font2);
    b1.setLocation(10,250);
    b1.setSize(300,50);
    p1.add(b1);
    b1.setForeground(Color.black);

    final JTextField t1 = new JTextField(25);
    t1.setLocation(10,300);
    t1.setSize(175,25);
    p1.add(t1);

    JLabel b2=new JLabel("Enter the details(as in to whom,amount,date etc)");
    b2.setFont(font2);
    b2.setLocation(100,325);
    b2.setSize(1000,50);
    p1.add(b2);
    b2.setForeground(Color.black);

    JLabel b3=new JLabel("In name of");
    b3.setFont(font2);
    b3.setLocation(200,400);
    b3.setSize(300,50);
    p1.add(b3);
    b3.setForeground(Color.black);

    final JTextField t3 = new JTextField(25);
    t3.setLocation(500,411);
    t3.setSize(175,25);
    p1.add(t3);

    JLabel b4=new JLabel("Amount");
    b4.setFont(font2);
    b4.setLocation(200,450);
    b4.setSize(300,50);
    p1.add(b4);
    b4.setForeground(Color.black);

    final JTextField t4 = new JTextField(25);
    t4.setLocation(500,461);
    t4.setSize(175,25);
    p1.add(t4);

    JLabel b8=new JLabel("Date");
    b8.setFont(font2);
    b8.setLocation(200,500);
    b8.setSize(200,50);
    p1.add(b8);
b8.setForeground(Color.black);    
    final JTextField c1=new JTextField("dd");
    c1.setLocation(500,511);
    c1.setSize(25,25);
    p1.add(c1);
    final JTextField c2=new JTextField("mm");
    c2.setLocation(550,511);
    c2.setSize(25,25);
    p1.add(c2);
    final JTextField c3=new JTextField("yy");
    c3.setLocation(600,511);
    c3.setSize(75,25);
    p1.add(c3);
    
    JLabel b7=new JLabel("Enter User ID");
    b7.setFont(font2);
    b7.setLocation(300,250);
    b7.setSize(300,50);
    p1.add(b7);
    b7.setForeground(Color.black);

    final JTextField t7 = new JTextField(25);
    t7.setLocation(300,300);
    t7.setSize(175,25);
    p1.add(t7);

    JLabel b9=new JLabel("Enter Password");
    b9.setFont(font2);
    b9.setLocation(600,250);
    b9.setSize(300,50);
    p1.add(b9);
    b9.setForeground(Color.black);

    final JPasswordField t9 = new JPasswordField(25);
    t9.setLocation(600,300);
    t9.setSize(175,25);
    p1.add(t9);

    JLabel b5=new JLabel("Your Address");
    b5.setFont(font2);
    b5.setLocation(200,550);
    b5.setSize(300,50);
    p1.add(b5);
    b5.setForeground(Color.black);

    final JTextField t5 = new JTextField(25);
    t5.setLocation(500,561);
    t5.setSize(175,45);
    p1.add(t5);

     
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
                String uname = t7.getText();
                String pwd = t9.getText();
                String amt =t4.getText();
                int amnt=Integer.parseInt(amt);
                System.out.println(amnt);

          data(user_accno,uname,pwd,amnt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(trans.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(trans.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    });
}

static void data(String user_accno,String uname,String pwd,int amnt) throws ClassNotFoundException, SQLException
   {
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

       if(ubalamt>amnt)
       {
       user_new_balamt=ubalamt-amnt;
       }
        PreparedStatement pst3 = con.prepareStatement("update login set bal=? where accno=?");
                    pst3.setInt(1,user_new_balamt);
                    pst3.setString(2,user_accno);


                   pst3.executeUpdate();


                    pst3.close();
                    pst1.close();
                    con.close();
       }
       }

  catch (SQLException e){
  }


     }
}
