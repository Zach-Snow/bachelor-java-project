import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.ImageIcon;

class priceUpdate extends JFrame implements ActionListener{
    JLabel leb = new JLabel("Enter new price of product :");
    JButton Add = new JButton("Update");
    JButton back = new JButton("Back");
    JTextField number = new JTextField();
    JTextField decoy = new JTextField();

    ImageIcon priceUdt= new ImageIcon(getClass().getResource("questionPartTwo.png"));
	JLabel udtPricePic = new JLabel(priceUdt);

    int checkProduct;
    int newPrice;
    boolean flag = false;

    public priceUpdate(int checkProduct){
        setContentPane(udtPricePic);
        this.checkProduct=checkProduct;
        setVisible(true);
		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		leb.setBounds(50,120,200,70);
		add(leb);

		number.setBounds(270,145,50,25);
		add (number);

		back.setBounds(170,300,100,50);
		add(back);

		Add.setBounds(170,200,100,50);
		add(Add);

        Add.addActionListener(this);
        back.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==back){
            priceFrame a2 = new priceFrame();
            this.setVisible(false);
          }
        else if(number.getText().equals("")){
           JOptionPane.showMessageDialog(this,"No input Given!");
        }
	    else if(e.getSource()==Add){

                decoy.setText(number.getText());
                newPrice =Integer.parseInt(decoy.getText());

                String url = "jdbc:mysql://localhost:3306/boutique";
                String user = "root";
                String pw   = "";

                try{
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection(url,user,pw);
                       Statement stmt=con.createStatement();
                       String sql = "Update Products set price="+newPrice+" WHERE sl_no="+checkProduct;
                       stmt.executeUpdate(sql);
                       flag = true;
                       this.setVisible(false);
                       if(flag){
                          JOptionPane.showMessageDialog(this,"Price Updated and Stored!");
                          priceFrame a2= new priceFrame();
                          this.setVisible(false);
                  }

                  }
                  catch(SQLException g){}
                  catch(Exception eq){}

          }
    }
}
