import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


 class updateCredential extends JFrame implements ActionListener{

    JLabel Pass =new JLabel("New Password : ");
    JLabel Pass2 =new JLabel("Re-Type Password : ");

    ImageIcon updateCredPic = new ImageIcon(getClass().getResource("updateCredPic.png"));
	JLabel udtCrdPic = new JLabel(updateCredPic);

	JTextField Txt2 = new JTextField();
	JTextField keepp = new JTextField();
	JTextField Txt3 = new JTextField();
	JTextField keepp2 = new JTextField();

	String pst;
	String pst2;
    String ctch = "1";
    boolean flag = false;

	JButton Prvs = new JButton("Previous");
	JButton cont = new JButton("Continue");

	public updateCredential(){
	    setContentPane(udtCrdPic);
	    this.ctch=ctch;;
		setVisible(true);
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		Pass.setBounds(40,100,140,20);
		add (Pass);

		Pass2.setBounds(40,140,140,20);
		add (Pass2);


		Txt2.setBounds(180,100,350,25);
		add (Txt2);

		Txt3.setBounds(180,140,350,25);
		add (Txt3);

		Prvs.setBounds(200,300,100,30);
		add (Prvs);

		cont.setBounds(340,300,100,30);
		add (cont);

		cont.addActionListener(this);
		Prvs.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
	    if (e.getSource()==cont){
            keepp.setText(Txt2.getText());
            pst=keepp.getText();
            keepp2.setText(Txt3.getText());
            pst2=keepp2.getText();

            if (pst.equals(pst2)){
                String url = "jdbc:mysql://localhost:3306/boutique";
                String user = "root";
                String pw   = "";

                try{
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection(url,user,pw);
                       Statement stmt=con.createStatement();
                       String sql = "Update login " +" set user_pw='"+pst+"' WHERE track=1";
                       stmt.executeUpdate(sql);
                       flag = true;
                       this.setVisible(false);
                   if(flag){
                              JOptionPane.showMessageDialog(this,"Credential Updated and Stored!");
                              adminPanel a2= new adminPanel();
                              this.setVisible(false);
                           }

                  }
          catch(SQLException g){
              JOptionPane.showMessageDialog(this,"ERROR!!");
          }
          catch(Exception eq){
              JOptionPane.showMessageDialog(this,"ERROR!!");
          }

          }
          else{
              JOptionPane.showMessageDialog(this,"Passwords don't match!");
          }
        }

    else{
            adminPanel f2= new adminPanel();
            this.setVisible(false);

        }
	}
}
