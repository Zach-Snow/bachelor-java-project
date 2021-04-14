import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.ImageIcon;

class addInventory extends JFrame implements ActionListener{
    JLabel leb = new JLabel("Enter Number of Items to add :");
    JButton add = new JButton("Add");
    JButton back = new JButton("Back");
    JTextField number = new JTextField();
    JTextField decoy = new JTextField();

    ImageIcon addInvPic = new ImageIcon(getClass().getResource("question.png"));
	JLabel addInv = new JLabel(addInvPic);

    int checkProduct;
    int newItemNumber;
    boolean flag = false;

    public addInventory(int checkProduct){
        setContentPane(addInv);
        this.checkProduct=checkProduct;
        setVisible(true);
		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		leb.setBounds(50,120,200,70);
		add(leb);

		number.setBounds(270,145,50,25);
		add (number);

		add.setBounds(170,200,100,50);
		add(add);

		back.setBounds(170,300,100,50);
		add(back);

        add.addActionListener(this);
        back.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==back){
               invetoryFrame f = new invetoryFrame();
               this.dispose();
           }
        else if(number.getText().equals("")){
           JOptionPane.showMessageDialog(this,"No input Given!");
        }
        else if(e.getSource()==add){
                    String url = "jdbc:mysql://localhost:3306/boutique";
                    String user = "root";
                    String pw   = "";

                    try{
                        decoy.setText(number.getText());
                        newItemNumber =Integer.parseInt(decoy.getText());
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection(url,user,pw);
                        Statement stmt=con.createStatement();
                        String sql = "Update Products " +" set in_shop=in_shop+"+newItemNumber+" WHERE sl_no="+checkProduct;
                        stmt.executeUpdate(sql);
                        flag = true;
                        this.setVisible(false);
                        if(flag){
                                JOptionPane.showMessageDialog(this,"Inventory Updated and Stored!");
                                invetoryFrame a2= new invetoryFrame();
                                this.setVisible(false);
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
