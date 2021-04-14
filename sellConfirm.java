import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;

class sellConfirm extends JFrame implements ActionListener{

    JLabel question = new JLabel("Any more items to sell?");
    JRadioButton yes = new JRadioButton("Yes");
    JRadioButton no = new JRadioButton("No");

    ImageIcon cnfPic = new ImageIcon(getClass().getResource("questionPartTwo.png"));
	JLabel confirmSells = new JLabel(cnfPic);

    public sellConfirm(){
        setContentPane(confirmSells);
        setVisible(true);
		setSize(600,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		question.setFont(new Font("Any more items to sell?",Font.ITALIC,22));

		ButtonGroup bg=new ButtonGroup();

		question.setBounds(100,20,600,70);
		add(question);

		yes.setBounds(100,200,250,70);
		bg.add(yes);
		add(yes);

		no.setBounds(100,300,150,70);
		bg.add(no);
		add(no);

		yes.addActionListener(this);
        no.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
	    if(e.getSource()== yes){
                sellsFrame f =new sellsFrame();
                this.setVisible(false);
        }
        else if(e.getSource()== no){
                adminPanel f3 =new adminPanel();
                this.setVisible(false);
        }
  }
}
