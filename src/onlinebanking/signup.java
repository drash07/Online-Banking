package onlinebanking;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class signup 
{
static void sign_up(final JFrame frame) throws ClassNotFoundException, SQLException
{
 
   frame.setVisible(true);     
   frame.setSize(1000, 700);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
   
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
  
  /* 
    JLabel b1=new JLabel("Please fill up necessary Details");
    Font font1 = new Font("Arial Rounded MT Bold", Font.BOLD, 32);
    b1.setFont(font1);
    b1.setLocation(100,153);
    b1.setSize(1000,100);
    */
    Font font2 = new Font("Papyrus", Font.BOLD, 25);
    JPanel p1=new JPanel();
    p1.setBackground(Color.white);
    p1.setLayout(null);
    p1.setLocation(0, 0);
    p1.setSize(1000, 700);
//    p1.add(b1);
    frame.add(p1);
    
    JButton jb = new JButton("Sign Up");
    jb.setLocation(300,600);
    jb.setSize(100,30);
    p1.add(jb);
    
    JLabel b2=new JLabel("FName");
    //Font font2 = new Font("Arial", Font.BOLD,20);
    b2.setFont(font2);
    b2.setLocation(50,200);
    b2.setSize(200,50);
    p1.add(b2);
    
    final JTextField t1 = new JTextField(25);
    t1.setLocation(300,210);
    t1.setSize(175,25);
    p1.add(t1);
    
    JLabel b3=new JLabel("LName");
    b3.setFont(font2);
    b3.setLocation(500,200);
    b3.setSize(200,50);
    p1.add(b3);
    
    final JTextField t2 = new JTextField(25);
    t2.setLocation(700,210);
    t2.setSize(175,25);
    p1.add(t2);
  
    
    JLabel b4=new JLabel("UserName");
    b4.setFont(font2);
    b4.setLocation(50,250);
    b4.setSize(200,50);
    p1.add(b4);
    
    final JTextField t3 = new JTextField(25);
    t3.setLocation(300,260);
    t3.setSize(175,25);
    p1.add(t3);
    
    JLabel b5=new JLabel("Passsword");
    b5.setFont(font2);
    b5.setLocation(50,300);
    b5.setSize(200,50);
    p1.add(b5);
    
    final JPasswordField t4 = new JPasswordField(25);
    t4.setLocation(300,310);
    t4.setSize(175,25);
    p1.add(t4);
    
     JLabel b6=new JLabel("Re-Enter Passsword");
    b6.setFont(font2);
    b6.setLocation(50,350);
    b6.setSize(500,50);
    p1.add(b6);
    
    final JPasswordField t5 = new JPasswordField(25);
    t5.setLocation(300,360);
    t5.setSize(175,25);
    p1.add(t5);
    
     JLabel b7=new JLabel("Email");
    b7.setFont(font2);
    b7.setLocation(50,400);
    b7.setSize(200,50);
    p1.add(b7);
    
    final JTextField t6 = new JTextField(25);
    t6.setLocation(300,410);
    t6.setSize(175,25);
    p1.add(t6);
    
    JLabel b8=new JLabel("DOB");
    b8.setFont(font2);
    b8.setLocation(50,450);
    b8.setSize(200,50);
    p1.add(b8);
    
    String date[]={"1","2","3","4","5","6","7","8","9","10","11","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String month[]={"Jan","Feb","Mar","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
    String year[]={"1991","1992","1993","1994","1995","1996"};
    
    final JComboBox c1=new JComboBox(date);
    c1.setLocation(300,463);
    c1.setSize(50,25);
    p1.add(c1);
    
    final JComboBox c2=new JComboBox(month);
    c2.setLocation(350,463);
    c2.setSize(75,25);
    p1.add(c2);
    
    final JComboBox c3=new JComboBox(year);
    c3.setLocation(425,463);
    c3.setSize(75,25);
    p1.add(c3);
    
      JLabel b9=new JLabel("Gender");
    b9.setFont(font2);
    b9.setLocation(50,500);
    b9.setSize(200,50);
    p1.add(b9);
    
    String Gender[]={"male","Female"};
    final JComboBox c4=new JComboBox(Gender);
    c4.setLocation(300,513);
    c4.setSize(75,25);
    p1.add(c4);
    
     ImageIcon icon4=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\signup1.jpg");
        JLabel pics4=new JLabel();
        pics4.setLocation(0,152);
        pics4.setSize(1000,548);
        pics4.setIcon(icon4);
        p1.add(pics4);
   
    
    JButton jbb = new JButton("Home");
    jbb.setLocation(0,10);
    jbb.setSize(100,30);
    p22.add(jbb);
    
    
    
    
    jbb.addActionListener(new ActionListener(){
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
        public void actionPerformed(ActionEvent e)
        {
            try {            
              
                String fname = t1.getText();
                String lname = t2.getText();
                String uname = t3.getText();
                String pwd = t4.getText();
                String repwd=t5.getText();
                String email = t6.getText();
                String dob = c1.getSelectedItem().toString() + c2.getSelectedItem().toString() + c3.getSelectedItem().toString();
                String gender = c4.getSelectedItem().toString();
                Random randomGenerator = new Random();
                int accno = randomGenerator.nextInt(10000);
                int bal=10000;
                
                    data(fname, lname, uname, pwd, email, dob, gender,accno,bal,frame);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }

               
            
               
                     
               
        }
    });
}    
static void data(String fname,String lname,String uname,String pwd,String email,String dob,String gender,int accno,int bal,JFrame frame) throws ClassNotFoundException, SQLException
   {       
      
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
                    
                    PreparedStatement pst = con.prepareStatement("insert into login values(?,?,?,?,?,?,?,?,?)");
                    pst.setString(1,fname);
                    pst.setString(2,lname);
                    pst.setString(3,uname);
                    pst.setString(4,pwd);
                    pst.setString(5,email);
                    pst.setString(6,dob);
                    pst.setString(7,gender);
                    pst.setInt(8,accno);
                    pst.setInt(9,bal);
                    int rowcount = pst.executeUpdate();
                    System.out.println(rowcount + " row has been inserted ");
                    
                    account t=new account();
                    frame.getContentPane().removeAll();
                    frame.validate();
                    frame.repaint();
                    t.mt(frame,fname,lname,uname,email,pwd,dob,gender,accno,bal);
                     pst.close();
                     con.close();
  
                    
   }
  




}

