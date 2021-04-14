import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;

class invetoryFrame extends JFrame implements ActionListener{


    JLabel Items = new JLabel("Click on Item to add ");
    JRadioButton shirt = new JRadioButton("Shirt");
    JRadioButton t_shirt = new JRadioButton("T-Shirt");
    JRadioButton panjabi = new JRadioButton("Panjabi");
    JRadioButton kamiz = new JRadioButton("Kamiz");
    JRadioButton shari = new JRadioButton("Shari");

    ImageIcon inventoryPic = new ImageIcon(getClass().getResource("newInventory.png"));
	JLabel invPic = new JLabel(inventoryPic);

    JButton done = new JButton("Done");

    int checkProduct;

	public invetoryFrame(){
	    setContentPane(invPic);
		setVisible(true);
		setSize(600,700);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Items.setFont(new Font("Items to Sale ",Font.ITALIC,22));

		ButtonGroup bg=new ButtonGroup();


        Items.setBounds(170,20,200,70);
		add(Items);

		shirt.setBounds(100,200,250,70);
		bg.add(shirt);
		add(shirt);

		t_shirt.setBounds(100,300,150,70);
		bg.add(t_shirt);
		add(t_shirt);

		panjabi.setBounds(100,400,150,70);
		bg.add(panjabi);
		add(panjabi);


		kamiz.setBounds(300,300,70,50);
		bg.add(kamiz);
		add(kamiz);

		shari.setBounds(300,400,70,50);
		bg.add(shari);
		add(shari);

		done.setBounds(200,580,100,50);
		add(done);

        done.addActionListener(this);
        shirt.addActionListener(this);
        t_shirt.addActionListener(this);
        panjabi.addActionListener(this);
        kamiz.addActionListener(this);
        shari.addActionListener(this);

	}



	public void actionPerformed(ActionEvent e){
	    if(e.getSource()== shirt){
                checkProduct=1;
                addInventory f =new addInventory(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== t_shirt){
                checkProduct=2;
                addInventory f3 =new addInventory(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== panjabi){
                checkProduct=3;
                addInventory f3 =new addInventory(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== kamiz){
                checkProduct=4;
                addInventory f3 =new addInventory(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== shari){
                checkProduct=5;
                addInventory f3 =new addInventory(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== done){
                adminPanel f3 =new adminPanel();
                this.setVisible(false);
        }

	}




}



