import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;

class privacyFrame extends JFrame implements ActionListener{

    JButton Uupd = new JButton("Update info");
    JButton back = new JButton("Back");

    ImageIcon privacyPic = new ImageIcon(getClass().getResource("privacyPic.png"));
	JLabel privacyPicPanel = new JLabel(privacyPic);

	public privacyFrame(){
	    setContentPane(privacyPicPanel);
		setVisible(true);
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Uupd.setBounds(100,120,150,50);
		add(Uupd);

		back.setBounds(120,250,100,50);
		add(back);

        Uupd.addActionListener(this);
        back.addActionListener(this);
}
	public void actionPerformed(ActionEvent e){
        if(e.getSource()==Uupd){
            adminLogInCheck n = new adminLogInCheck();
            this.setVisible(false);
        }

        else{
            adminPanel n= new adminPanel();
            this.setVisible(false);
        }
	}
}



