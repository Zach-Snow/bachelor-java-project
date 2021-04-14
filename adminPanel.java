import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


 class adminPanel extends JFrame implements ActionListener{

	JButton sells = new JButton("Sells");
	JButton invUp = new JButton("Inventory Update");
	JButton priceUp = new JButton("Price Update");
	JButton prvSet = new JButton("Privacy Settings");
	JButton about = new JButton("About");
	JButton calculation = new JButton("Calculation Tools");
	JButton logOut = new JButton("Log Out");

	ImageIcon adminPic = new ImageIcon(getClass().getResource("adminPanelPic.png"));
	JLabel adminPanelFrame = new JLabel(adminPic);


	public adminPanel(){
	    setContentPane(adminPanelFrame);
		setVisible(true);
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sells.setBounds(180,20,200,30);
		add (sells);

		invUp.setBounds(180,60,200,30);
		add (invUp);

		priceUp.setBounds(180,100,200,30);
		add (priceUp);

		prvSet.setBounds(180,140,200,30);
		add (prvSet);

		calculation.setBounds(180,180,200,30);
		add (calculation);

		about.setBounds(430,300,100,30);
		add (about);

		logOut.setBounds(80,300,100,30);
		add (logOut);

		about.addActionListener(this);
        sells.addActionListener(this);
        invUp.addActionListener(this);
        logOut.addActionListener(this);
        priceUp.addActionListener(this);
        prvSet.addActionListener(this);
        calculation.addActionListener(this);

	}


	public void actionPerformed(ActionEvent e){
	    if (e.getSource()== about){
               aboutFrame f4 =new aboutFrame();
               this.setVisible(false);
           }

        else if (e.getSource()==sells ){
               sellsFrame f5=new sellsFrame();
               this.setVisible(false);
           }

        else if (e.getSource()== invUp){
               invetoryFrame f6=new invetoryFrame();
               this.setVisible(false);
           }

        else if (e.getSource()== logOut ){
               adminLogIn f6=new adminLogIn();
               this.setVisible(false);
           }
        else if (e.getSource()== priceUp ){
               priceFrame f6=new priceFrame();
               this.setVisible(false);
           }
        else if (e.getSource()== prvSet ){
               privacyFrame f6=new privacyFrame();
               this.setVisible(false);
           }

        else if (e.getSource()== calculation ){
               calculationFrame f6=new calculationFrame();
               this.setVisible(false);
           }


	}

}

