import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

class sellsTableView extends JFrame implements ActionListener{
    JTable sellsTable;
    JScrollPane sellsTablePanel;
    JButton back;
    String str,str3,str4,str5,str6;
    int in1,in2,in3,in4,in5,in6,in7,in8,in9,in10;

 public sellsTableView(){
        check();
        Object[][] data = {{str, in1,in2},{str3, in3,in4},{str4, in5,in6},{str5, in7,in8},{str6, in9,in10}};
        Object[] columns = {"Products", "Number of Items sold", "Revenue of product"};
        sellsTable = new JTable(data, columns);
        sellsTablePanel = new JScrollPane(sellsTable);

        back = new JButton("Back");
        back.addActionListener(this);

        this.getContentPane().add(sellsTablePanel);
        this.getContentPane().add(back);

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(700, 700);
        this.setVisible(true);
    }

    public void check(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique","root","");
                Statement stmt=con.createStatement();
                Statement stmt2=con.createStatement();
                Statement stmt3=con.createStatement();
                Statement stmt4=con.createStatement();
                Statement stmt5=con.createStatement();
                ResultSet rs=stmt.executeQuery ("SELECT * FROM `sells` where sl_no=1");
                ResultSet rb=stmt2.executeQuery("SELECT * FROM `sells` where sl_no=2");
                ResultSet rc=stmt3.executeQuery("SELECT * FROM `sells` where sl_no=3");
                ResultSet rd=stmt4.executeQuery("SELECT * FROM `sells` where sl_no=4");
                ResultSet rf=stmt5.executeQuery("SELECT * FROM `sells` where sl_no=5");

                while(rs.next()){
                        str = rs.getString("products");
                        in1 = rs.getInt("num_sold");
                        in2 = rs.getInt("revenue");
                        }
              while(rb.next()){
                        str3 = rb.getString("products");
                        in3 = rb.getInt("num_sold");
                        in4 = rb.getInt("revenue");
                        }
                while(rc.next()){
                        str4 = rc.getString("products");
                        in5 = rc.getInt("num_sold");
                        in6 = rc.getInt("revenue");
                        }
                while(rd.next()){
                        str5 = rd.getString("products");
                        in7 = rd.getInt("num_sold");
                        in8 = rd.getInt("revenue");
                        }
                while(rf.next()){
                        str6 = rf.getString("products");
                        in9 = rf.getInt("num_sold");
                        in10 = rf.getInt("revenue");
                        }
          }
        catch(SQLException g){}
        catch(Exception eq){}

     }

     public void actionPerformed(ActionEvent e) {
                if(sellsTable.getSelectedRowCount()==5){
                    int selectedRow = sellsTable.getSelectedRow();
                    int selectedColumn = sellsTable.getSelectedColumn();
                    String selectedValue = sellsTable.getValueAt(selectedRow, selectedColumn).toString();

                    JOptionPane.showMessageDialog(null, selectedValue);
                }
                else{
                   calculationFrame f2 =new calculationFrame();
                   this.setVisible(false);
                }
            }


}


