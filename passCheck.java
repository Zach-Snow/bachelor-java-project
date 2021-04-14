import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class passCheck extends JFrame{
    String tk;
    String ust;
    String pst;
    boolean flag = false;

    public passCheck(String tk,String ust, String pst){
        this.tk=tk;
        this.ust=ust;
        this.pst=pst;
        check(this.tk,this.ust, this.pst);
    }

    public void check(String get,String get1, String get2){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique","root","");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("SELECT * FROM `login`");

                while(rs.next()){
                        String str = rs.getString("track");
                        String str1 = rs.getString("user_id");
                        String str2 = rs.getString("user_pw");

                        if ( get.equals(str) && get1.equals(str1) && get2.equals(str2) ){
                            adminPanel q = new adminPanel();
                            JOptionPane.showMessageDialog(this,"Welcome to Admin Panel");
                            flag = true;
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"Admin Id or Password is Wrong!!");
                        }

			        }
          }
          catch(SQLException g){
              JOptionPane.showMessageDialog(this,"ERROR!");
          }
          catch(Exception eq){
              JOptionPane.showMessageDialog(this,"ERROR!");
          }

     }
}
