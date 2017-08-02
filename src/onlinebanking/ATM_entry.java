
package onlinebanking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ATM_entry {
    public static void main(String args[])
    {
         JFrame frame = new JFrame("[=] Project[=]");
        frame.setVisible(true);     
   frame.setSize(1000, 700);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
  JPanel p1=new JPanel();
     p1.setBackground(Color.yellow);
     p1.setLocation(100, 200);
    p1.setSize(1000, 300);
      frame.add(p1);

    JPanel p2=new JPanel();
     p2.setBackground(Color.blue);
     p2.setLocation(100, 200);
    p2.setSize(1000, 300);
      frame.add(p2);
      
        final JTextField t1 = new JTextField(50);
    t1.setLocation(0,0);
    t1.setSize(300,100);
    p1.add(t1);
    
    final JTextField t2 = new JTextField(75);
    t2.setLocation(0,200);
    t2.setSize(300,100);
    p1.add(t2);
    
    
    JButton b1 = new JButton("add");
        b1.setLocation(0,400);
        b1.setSize(300,100 );
        p1.add(b1);
    
        
        b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
                try {
                    String city = t1.getText();
                    String atm_loc = t2.getText();
                    
                    data(city,atm_loc);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ATM_entry.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ATM_entry.class.getName()).log(Level.SEVERE, null, ex);
                }
             
        }
    });
       }  
        static void data(String city,String atm_loc) throws ClassNotFoundException, SQLException
   {       
   Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
                    PreparedStatement pst = con.prepareStatement("insert into atm values(?,?)");
                    pst.setString(1,city);
                    pst.setString(2,atm_loc);
                    
                    int rowcount = pst.executeUpdate();
                    System.out.println(rowcount + " row has been inserted ");
                    
                    pst.close();
                    con.close();
   }
   
}
