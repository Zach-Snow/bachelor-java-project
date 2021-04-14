import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class seeRevenue extends JFrame{
    boolean flag = false;
    public seeRevenue(){
        setVisible(true);
		setSize(300,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        check();
    }

    public void check(){
                String url = "jdbc:mysql://localhost:3306/boutique";
                String user = "root";
                String pw   = "";

                try{
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection(url,user,pw);
                       PreparedStatement statement =  con.prepareStatement("SELECT sum(revenue) FROM `sells`");
                       ResultSet result = statement.executeQuery();
                       result.next();
                       String sum = result.getString(1);
                       System.out.println(sum);
                       int value = Integer.parseInt(sum);
                        flag = true;
                        this.setVisible(false);
                        if(flag){
                              JOptionPane.showMessageDialog(this,value+"/- taka");
                              calculationFrame a2= new calculationFrame();
                              this.setVisible(false);
                           }
                       }



          catch(SQLException g){}
          catch(Exception eq){}

          }
}
