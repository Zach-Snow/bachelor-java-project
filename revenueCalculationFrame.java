import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class revenueCalculationFrame extends JFrame implements ActionListener{
    JLabel cost = new JLabel("Enter cost to run the shop till now :");
    JTextField screen = new JTextField();
    JButton done = new JButton("Done");
    JButton back = new JButton("Back");

    ImageIcon revCalPic = new ImageIcon(getClass().getResource("revCalPic.png"));
	JLabel revCalPicFrame = new JLabel(revCalPic);

    int costInput;
    String decoy;

    public revenueCalculationFrame(){
        setContentPane(revCalPicFrame);
        setVisible(true);
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		screen.setBounds(230,20,200,30);
		add (screen);

		cost.setBounds(30,20,200,30);
		add (cost);

		done.setBounds(180,150,100,30);
		add (done);

		back.setBounds(180,200,100,50);
		add(back);

        done.addActionListener(this);
        back.addActionListener(this);


    }

    public void check(){

        if(screen.getText().equals("")){
                               JOptionPane.showMessageDialog(this,"No input Given!");
                            }
        else{
                decoy=screen.getText();
                int getValue=Integer.parseInt(decoy);
                costInput=Integer.parseInt(screen.getText());
                String url = "jdbc:mysql://localhost:3306/boutique";
                String user = "root";
                String pw   = "";

                try{
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection(url,user,pw);
                           PreparedStatement statement =  con.prepareStatement("SELECT sum(revenue) FROM `sells`");
                           ResultSet result = statement.executeQuery();
                           result.next();
                           String sum = result.getString(1);
                           System.out.println(sum);
                           int value = Integer.parseInt(sum);
                           this.setVisible(false);

                           if(costInput>value){
                                        int res=costInput-value;
                                        JOptionPane.showMessageDialog(this,"You have suffered a loss of "+res+"/- taka");
                                        calculationFrame f2 =new calculationFrame();
                                        this.setVisible(false);
                               }
                           else if(value>costInput){
                                        int resTwo=value-costInput;
                                        JOptionPane.showMessageDialog(this,"You have a profit of "+resTwo+"/- taka");
                                        calculationFrame f2 =new calculationFrame();
                                        this.setVisible(false);
                               }
                           else if(value==costInput){
                                        int resTwo=value-costInput;
                                        JOptionPane.showMessageDialog(this,"You have got no profit, nor loss!!");
                                        calculationFrame f2 =new calculationFrame();
                                        this.setVisible(false);
                             }
                    }



          catch(SQLException g){}
          catch(Exception eq){}

        }

    }

    public void actionPerformed(ActionEvent e){
	    if(e.getSource()== done){
                check();
        }
        else if(e.getSource()== back){
                calculationFrame ob = new calculationFrame();
                this.dispose();
        }
  }
}
