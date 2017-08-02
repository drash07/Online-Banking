

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
import javax.swing.table.TableColumn;


public class ATM_log {
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
  
    JLabel l1=new JLabel("ATM Location");
   // Font font1 = new Font("Arial Rounded MT Bold", Font.BOLD, 32);
    l1.setFont(font2);
    l1.setLocation(400,145);
    l1.setSize(1000,100);
    l1.setForeground(Color.white);
     String loc[]={"Mumbai","Kolkata","Delhi","Chennai"};
    final JComboBox c1=new JComboBox(loc);
    c1.setLocation(400,220);
    c1.setSize(75,30);
    
    
    final JPanel p1=new JPanel();
   // p1.setBackground(Color.blue);
    p1.setLayout(null);
    p1.setLocation(0, 0);
    p1.setSize(1000, 700);
    p1.add(l1);
    p1.add(c1);
    
    JButton jb1 = new JButton("Find");
    jb1.setLocation(500,220);
    jb1.setSize(75,30);
    p1.add(jb1);
    
   
    
     ImageIcon icon5=new ImageIcon("C:\\Users\\shubham1912\\Documents\\NetBeansProjects\\onlinebanking\\atm.jpg");
        JLabel pics5=new JLabel();
        pics5.setLocation(0,0);
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
                String loc = c1.getSelectedItem().toString();  
                data(loc);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
       
          
            
             
        }
    });
}
static void data(String loc) throws ClassNotFoundException, SQLException
   {   
    
            Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
                    String selectSQL = "SELECT atm_loc FROM atm WHERE city = ?";
                    PreparedStatement pst1 = con.prepareStatement(selectSQL);
                    pst1.setString(1,loc);
                 
                    ResultSet rs = pst1.executeQuery();
                    int count=0;
       String[] columnNames = {"SR NO.",
                        "ATM Location"};
       Object[][] data=new Object[51][2];
       data[0][0]="SR NO.";
       data[0][1]="ATM Location";
       int i=1;
     while (rs.next()) 
      {
	String atm_loc = rs.getString(1);
        data[i][0]=i;
        data[i][1]=atm_loc;
        i++;
      }
     JFrame frame = new JFrame("ATM");
       frame.setVisible(true);     
frame.setSize(1000, 700);

JPanel p1=new JPanel();
     p1.setBackground(Color.yellow);
     p1.setLocation(0, 0);
    p1.setSize(1000, 700);
      frame.add(p1);
      
       JTable table = new JTable(data,columnNames);
      
        TableColumn column = null;
for (i = 0; i < 2; i++) {
    column = table.getColumnModel().getColumn(i);
    if (i == 1) {
        column.setPreferredWidth(600); 
    } else {
        column.setPreferredWidth(50);
    }
}

   p1.add(table);
   frame.add(p1);
     }    
}
