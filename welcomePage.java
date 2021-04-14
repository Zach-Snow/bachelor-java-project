import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.ImageIcon;

class welcomePage extends JFrame implements ActionListener {

	JLabel welcomeLabel =new JLabel("Welcome to ABC Boutique Shop!");
	JButton con = new JButton("Continue");
	ImageIcon welcomePic = new ImageIcon(getClass().getResource("welcomePage.png"));
	JLabel welBck = new JLabel(welcomePic);
	public welcomePage(){
		setVisible(true);
		setSize(1024,768);
		setLayout(null);
		welcomeLabel.setFont(new Font("Welcome to ABC Boutique Shop!",Font.ITALIC,35));
		welcomeLabel.setForeground(Color.BLACK);

		setContentPane(welBck);

        welcomeLabel.setBounds(280,100,800,500);
		add (welcomeLabel);

		con.setBounds(400,600,200,70);
		add(con);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		con.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){
	    if(e.getSource()==con){
            secondFrame f2 =new secondFrame();
            this.setVisible(false);
        }
	}
}

