import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.ImageIcon;

class soldNumber extends JFrame implements ActionListener{
    JLabel leb = new JLabel("Enter Number of the Product that has been sold :");
    JButton add = new JButton("Sell");
    JButton back = new JButton("Back");
    JTextField number = new JTextField();
    JTextField decoy = new JTextField();

    ImageIcon numPic = new ImageIcon(getClass().getResource("question.png"));
	JLabel numSells = new JLabel(numPic);

    int checkProduct;
    int numItem;
    boolean flag = false;

    public soldNumber(int checkProduct){
        setContentPane(numSells);
        this.checkProduct=checkProduct;
        setVisible(true);
		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		leb.setBounds(30,120,400,70);
		add(leb);

		number.setBounds(350,145,50,25);
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
               sellsFrame f = new sellsFrame();
               this.dispose();
           }
        else if(number.getText().equals("")){
           JOptionPane.showMessageDialog(this,"No input Given!");
        }
        else{
                decoy.setText(number.getText());
                numItem =Integer.parseInt(decoy.getText());
                sellWork ob = new sellWork(checkProduct,numItem);
                this.dispose();
        }
    }
}
