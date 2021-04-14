import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;

class priceFrame extends JFrame implements ActionListener{


    JLabel Items = new JLabel("Click on Item to update Price ");
    JRadioButton shirt = new JRadioButton("Shirt");
    JRadioButton T_shirt = new JRadioButton("T-Shirt");
    JRadioButton Panjabi = new JRadioButton("Panjabi");
    JRadioButton Kamiz = new JRadioButton("Kamiz");
    JRadioButton Shari = new JRadioButton("Shari");
    JButton done = new JButton("Done");

    ImageIcon priceUdt= new ImageIcon(getClass().getResource("updatePicePic.png"));
	JLabel udtPricePic = new JLabel(priceUdt);

    int checkProduct;

	public priceFrame(){
	    setContentPane(udtPricePic);
		setVisible(true);
		setSize(600,700);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Items.setFont(new Font("Items to Sale ",Font.ITALIC,22));

		ButtonGroup bg=new ButtonGroup();


        Items.setBounds(100,20,400,70);
		add(Items);

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
                priceUpdate f =new priceUpdate(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== T_shirt){
                checkProduct=2;
                priceUpdate f3 =new priceUpdate(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== Panjabi){
                checkProduct=3;
                priceUpdate f3 =new priceUpdate(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== Kamiz){
                checkProduct=4;
                priceUpdate f3 =new priceUpdate(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== Shari){
                checkProduct=5;
                priceUpdate f3 =new priceUpdate(checkProduct);
                this.setVisible(false);
        }
        else if(e.getSource()== done){
                adminPanel f3 =new adminPanel();
                this.setVisible(false);
        }

	}




}



