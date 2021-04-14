import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class secondPassCheck extends JFrame
{
    String tk;
    String ust;
    String pst;
    boolean flag = false;

    public secondPassCheck(String tk,String ust, String pst){
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
                            updateInfo a1=new updateInfo();
                            flag = true;
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"Admin Id or Password is Wrong!!");
                        }
			        }
          }
          catch(SQLException g){}
          catch(Exception eq){}

     }
}
