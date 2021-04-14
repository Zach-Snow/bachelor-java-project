import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

 class adminLogIn extends JFrame implements ActionListener{

	JLabel admnId =new JLabel("Admin Id : ");
    JLabel pass =new JLabel("Password : ");

	JTextField Txt1 = new JTextField();
	JTextField keepu = new JTextField();
	JPasswordField Txt2 = new JPasswordField();
	JPasswordField keepp = new JPasswordField();
	ImageIcon loginPic = new ImageIcon(getClass().getResource("adminLogInPic.png"));
	JLabel loginFrame = new JLabel(loginPic);

	String ust;
	String pst;
	String tk="1";

	JButton Prvs = new JButton("Previous");
	JButton cont = new JButton("Continue");

	public adminLogIn(){
	    setContentPane(loginFrame);
		setVisible(true);
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        admnId.setBounds(60,60,80,20);
		add (admnId);

		pass.setBounds(60,100,80,20);
		add (pass);

		Txt1.setBounds(150,60,400,25);
		add (Txt1);

		Txt2.setBounds(150,100,400,25);
		add (Txt2);

		Prvs.setBounds(200,300,100,30);
		add (Prvs);

		cont.setBounds(340,300,100,30);
		add (cont);

		cont.addActionListener(this);
		Prvs.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
	    if (e.getSource()==cont){
            keepu.setText(Txt1.getText());
            ust=keepu.getText();
            keepp.setText(Txt2.getText());
            pst=keepp.getText();
            passCheck a1 = new passCheck(tk,ust,pst);
            if(a1.flag){
                this.dispose();
            }
            else{
            }
        }
        else{
            secondFrame f2= new secondFrame();
            this.setVisible(false);
        }
	}
}
