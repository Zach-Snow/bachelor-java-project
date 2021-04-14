import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;

class secondFrame extends JFrame implements ActionListener{


	JButton browse = new JButton("Browse");
	JButton admn = new JButton("Admin Log In ");
	ImageIcon secondFramePic = new ImageIcon(getClass().getResource("secondFramePic.png"));
	JLabel secFrame = new JLabel(secondFramePic);

	public secondFrame(){
		setVisible(true);
		setSize(700,394);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(secFrame);

		browse.setBounds(200,150,100,70);
		add(browse);

		admn.setBounds(400,150,150,70);
		add(admn);

        browse.addActionListener(this);
        admn.addActionListener(this);


	}

	public void actionPerformed(ActionEvent e){
	    if(e.getSource()==browse){
            thirdFrame f3 =new thirdFrame();
            this.setVisible(false);
        }
         else{
            adminLogIn ad =new adminLogIn();
            this.setVisible(false);

        }
	}
}
