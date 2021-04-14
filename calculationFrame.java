import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


 class calculationFrame extends JFrame implements ActionListener{

	JButton totalSells = new JButton("Total Sells");
	JButton viewSell = new JButton("View All sells");
	JButton profitCal = new JButton("Revenue calculation");
	JButton back = new JButton("Back");

	ImageIcon caclPic = new ImageIcon(getClass().getResource("caculationlPanelpic.png"));
	JLabel caclPanelFrame = new JLabel(caclPic);

	public calculationFrame(){
	    setContentPane(caclPanelFrame);
		setVisible(true);
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		totalSells.setBounds(180,20,200,30);
		add (totalSells);

		viewSell.setBounds(180,60,200,30);
		add (viewSell);

		profitCal.setBounds(180,100,200,30);
		add (profitCal);


		back.setBounds(80,300,100,30);
		add (back);

		totalSells.addActionListener(this);
        viewSell.addActionListener(this);
        profitCal.addActionListener(this);
        back.addActionListener(this);

	}


	public void actionPerformed(ActionEvent e){
	    if (e.getSource()== totalSells){
               seeRevenue f4 =new seeRevenue();
               this.setVisible(false);
           }

        else if (e.getSource()==viewSell ){
               sellsTableView f5=new sellsTableView();
               this.setVisible(false);
           }

        else if (e.getSource()== profitCal){
               revenueCalculationFrame f6=new revenueCalculationFrame();
               this.setVisible(false);
           }

        else if (e.getSource()== back ){
               adminPanel f6=new adminPanel();
               this.setVisible(false);
           }
	}

}

