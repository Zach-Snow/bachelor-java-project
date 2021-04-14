import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

 class adminLogInCheck extends JFrame implements ActionListener{

	JLabel AdmnId =new JLabel("Old Admin Id : ");
    JLabel Pass =new JLabel("Old Password : ");

	JTextField Txt1 = new JTextField();
	JTextField keepu = new JTextField();
	JPasswordField Txt2 = new JPasswordField();
	JPasswordField keepp = new JPasswordField();

	ImageIcon loginCheck= new ImageIcon(getClass().getResource("loginCheck.png"));
	JLabel loginChk = new JLabel(loginCheck);


	String ust;
	String pst;
	String tk="1";

	JButton Prvs = new JButton("Previous");
	JButton cont = new JButton("Continue");

	public adminLogInCheck(){
	    setContentPane(loginChk);
		setVisible(true);
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AdmnId.setBounds(50,60,140,20);
		add (AdmnId);

		Pass.setBounds(50,100,140,20);
		add (Pass);

		Txt1.setBounds(150,60,350,25);
		add (Txt1);

		Txt2.setBounds(150,100,350,25);
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
            secondPassCheck a1 = new secondPassCheck(tk,ust,pst);
            if(a1.flag){
                this.dispose();
            }
            else{
            }
        }
        else{
            adminPanel f2= new adminPanel();
            this.setVisible(false);

        }

	}


}
