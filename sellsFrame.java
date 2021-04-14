import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;

class sellsFrame extends JFrame implements ActionListener{


    JLabel items = new JLabel("Click on Item to Sell ");
    JRadioButton shirt = new JRadioButton("Shirt");
    JRadioButton T_shirt = new JRadioButton("T-Shirt");
    JRadioButton Panjabi = new JRadioButton("Panjabi");
    JRadioButton Kamiz = new JRadioButton("Kamiz");
    JRadioButton Shari = new JRadioButton("Shari");

    ImageIcon sellsPic = new ImageIcon(getClass().getResource("sellsPanelPic.png"));
	JLabel sellsFramePic = new JLabel(sellsPic);


    JButton done = new JButton("Done");

    int checkProduct;



	public sellsFrame(){
	    setContentPane(sellsFramePic);
		setVisible(true);
		setSize(600,700);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		items.setFont(new Font("Items to Sale ",Font.ITALIC,22));

		ButtonGroup bg=new ButtonGroup();


        items.setBounds(170,20,200,70);
		add(items);

		shirt.setBounds(100,200,250,70);
		bg.add(shirt);
		add(shirt);

		T_shirt.setBounds(100,300,150,70);
		bg.add(T_shirt);
		add(T_shirt);

		Panjabi.setBounds(100,400,150,70);
		bg.add(Panjabi);
		add(Panjabi);


		Kamiz.setBounds(300,300,70,50);
		bg.add(Kamiz);
		add(Kamiz);

		Shari.setBounds(300,400,70,50);
		bg.add(Shari);
		add(Shari);

		done.setBounds(200,580,100,50);
		add(done);

        done.addActionListener(this);
        shirt.addActionListener(this);
        T_shirt.addActionListener(this);
        Panjabi.addActionListener(this);
        Kamiz.addActionListener(this);
        Shari.addActionListener(this);

	}



	public void actionPerformed(ActionEvent e){
	    if(e.getSource()== shirt){
                checkProduct=1;
                soldNumber f =new soldNumber(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== T_shirt){
                checkProduct=2;
                soldNumber f3 =new soldNumber(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== Panjabi){
                checkProduct=3;
                soldNumber f3 =new soldNumber(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== Kamiz){
                checkProduct=4;
                soldNumber f3 =new soldNumber(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== Shari){
                checkProduct=5;
                soldNumber f3 =new soldNumber(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== done){
                adminPanel f3 =new adminPanel();
                this.setVisible(false);
        }

	}




}



