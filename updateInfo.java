import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;

class updateInfo extends JFrame implements ActionListener{

    JButton Uupd = new JButton("Update Credentials");
    JButton back = new JButton("Back");

    ImageIcon updatePic = new ImageIcon(getClass().getResource("privacyPic.png"));
	JLabel udtPic = new JLabel(updatePic);

	public updateInfo(){
	    setContentPane(udtPic);
		setVisible(true);
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Uupd.setBounds(100,60,200,50);
		add(Uupd);

		back.setBounds(140,180,100,50);
		add(back);

        Uupd.addActionListener(this);
        back.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
        if(e.getSource()==Uupd){
            updateCredential a1 = new updateCredential();
            this.setVisible(false);
        }

        else if (e.getSource()==back){
            adminPanel q = new adminPanel();
            this.setVisible(false);
        }
	}
}



