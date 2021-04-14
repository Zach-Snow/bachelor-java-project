import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;

class sellWork extends JFrame{

    int productCatch;
    int numSoldCatch;
    int checkProdNum;
    boolean flag = false;

    public sellWork(int productCatch,int numSoldCatch){
        System.out.print(500);
        this.productCatch=productCatch;
        this.numSoldCatch=numSoldCatch;

        check(this.productCatch,numSoldCatch);
    }

    public void check(int prodCatch,int soldCatch){
                String url = "jdbc:mysql://localhost:3306/boutique";
                String user = "root";
                String pw   = "";

                try{
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection(url,user,pw);
                       Statement stmt=con.createStatement();
                       //String sql1="Select in_shop from products WHERE sl_no="+prodCatch;
                       ResultSet rs = stmt.executeQuery("Select in_shop from products WHERE sl_no="+prodCatch);
                       while(rs.next())
                       {
                           checkProdNum = rs.getInt("in_shop");
                           if(numSoldCatch>checkProdNum)
                           {
                               JOptionPane.showMessageDialog(this,"Not Enough Product available!");
                               soldNumber ob = new soldNumber(productCatch);
                               this.dispose();
                           }
                           else
                           {
                               try{
                                   Class.forName("com.mysql.jdbc.Driver");
                                   Connection con2=DriverManager.getConnection(url,user,pw);
                                   Statement stmt2=con.createStatement();
                                   String sql = "UPDATE products, sells SET products.in_shop = in_shop-"+soldCatch+", sells.revenue=sells.revenue+("+soldCatch+"*products.price),sells.num_sold=num_sold+"+soldCatch+" WHERE products.sl_no = sells.sl_no and products.sl_no="+prodCatch;
                                   stmt2.executeUpdate(sql);
                                   flag = true;
                                   this.setVisible(false);
                                   if(flag){
                                        JOptionPane.showMessageDialog(this,"Product Sold!");
                                        sellConfirm n = new sellConfirm();
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


                  }
                  catch(SQLException g){
                      JOptionPane.showMessageDialog(this,"ERROR!");

                  }
                  catch(Exception eq){
                      JOptionPane.showMessageDialog(this,"ERROR!");

                  }
      }
}

