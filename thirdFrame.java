import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.ImageIcon;

class thirdFrame extends JFrame implements ActionListener{
    JTable productsTable;
    JScrollPane productsTablePanel;
    ImageIcon thirdFramePic = new ImageIcon(getClass().getResource("thirdFramePic.png"));
    JLabel trdFrame = new JLabel(thirdFramePic);
    JButton back;
    String str,str3,str4,str5,str6;
    int in1,in2,in3,in4,in5,in6,in7,in8,in9,in10;

 public thirdFrame(){
        setContentPane(trdFrame);
        check();
        Object[][] data = {{str, in1,in2},{str3, in3,in4},{str4, in5,in6},{str5, in7,in8},{str6, in9,in10}};
        Object[] columns = {"Products", "Price", "Available Number of the product in shop"};
        productsTable = new JTable(data, columns);
        productsTablePanel = new JScrollPane(productsTable);

        back = new JButton("Back");
        back.addActionListener(this);

        this.getContentPane().add(productsTablePanel);
        this.getContentPane().add(back);

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(700, 400);
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
                ResultSet rs=stmt.executeQuery("SELECT * FROM `Products` where sl_no=1");
                ResultSet rb=stmt2.executeQuery("SELECT * FROM `Products` where sl_no=2");
                ResultSet rc=stmt3.executeQuery("SELECT * FROM `Products` where sl_no=3");
                ResultSet rd=stmt4.executeQuery("SELECT * FROM `Products` where sl_no=4");
                ResultSet rf=stmt5.executeQuery("SELECT * FROM `Products` where sl_no=5");

                while(rs.next()){
                        str = rs.getString("items");
                        in1 = rs.getInt("price");
                        in2 = rs.getInt("in_shop");
                        }
              while(rb.next()){
                        str3 = rb.getString("items");
                        in3 = rb.getInt("price");
                        in4 = rb.getInt("in_shop");
                        }
                while(rc.next()){
                        str4 = rc.getString("items");
                        in5 = rc.getInt("price");
                        in6 = rc.getInt("in_shop");
                        }
                while(rd.next()){
                        str5 = rd.getString("items");
                        in7 = rd.getInt("price");
                        in8 = rd.getInt("in_shop");
                        }
                while(rf.next()){
                        str6 = rf.getString("items");
                        in9 = rf.getInt("price");
                        in10 = rf.getInt("in_shop");
                        }
          }
        catch(SQLException g){}
        catch(Exception eq){}

     }

     public void actionPerformed(ActionEvent e) {
                if(productsTable.getSelectedRowCount()==5){
                    int selectedRow = productsTable.getSelectedRow();
                    int selectedColumn = productsTable.getSelectedColumn();
                    String selectedValue = productsTable.getValueAt(selectedRow, selectedColumn).toString();

                    JOptionPane.showMessageDialog(null, selectedValue);
                }
                else{
                   secondFrame f2 =new secondFrame();
                   this.setVisible(false);
                }
            }


}


