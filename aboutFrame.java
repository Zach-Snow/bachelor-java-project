import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

class aboutFrame extends JFrame implements ActionListener{

    JLabel Author =new JLabel("Software Authors:");
    JLabel Author1 =new JLabel("1. Bhuiyan, MD. Zakir Ayub ");
    JLabel Author2 =new JLabel("2. Jahan,Eshreat ");
    JLabel Author3 =new JLabel("3. Hossain,Sakhawath ");

    JButton Back = new JButton("Back");



	public aboutFrame(){
		setVisible(true);
		setSize(400,400);
		setLayout(null);

		Author.setFont(new Font("Software Authors: ",Font.ITALIC,22));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        Author.setBounds(110,20,200,70);
		add(Author);

		Author1.setBounds(130,100,250,70);
		add(Author1);

		Author2.setBounds(130,130,150,70);
		add(Author2);

		Author3.setBounds(130,160,150,70);
		add(Author3);


		Back.setBounds(300,300,70,50);
		add(Back);

        Back.addActionListener(this);



	}



public void actionPerformed(ActionEvent e){
	    if(e.getSource()==Back){
            adminPanel f3 =new adminPanel();
            this.setVisible(false);
        }
	}
}

