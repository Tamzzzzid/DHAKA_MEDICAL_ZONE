import javax.swing.*;    
import java.awt.*;       
import java.awt.event.*; 

public class Form9 extends JFrame implements ActionListener //ADMIN LOGIN
{
		
	ImageIcon icon,img;
	Container c;
    JLabel t,t1,t3;
	Font f;
	JTextField w1,w2;
	JButton b1,b2;
    String xx="admin",yy="1234";	
	
	public Form9()
	{
		//FUNDAMENTAL
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,600);
		//BG
		c=this.getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(null);
		//TEXTS
		f=new Font("Arial",Font.BOLD,18);
		t=new JLabel();
		t.setText("ENTER USER NAME : ");
		t.setBounds(40,90,320,30);
		t.setFont(f);
		t.setForeground(Color.white);
		c.add(t);
		
		t1=new JLabel("ENTER THE PIN : ");
		t1.setBounds(40,230,250,30);
		t1.setFont(f);
		t1.setForeground(Color.white);
		c.add(t1);
		
		//TITLE
		this.setTitle("HOSPITAL");
		this.setResizable(false);
		//ICON
		icon=new ImageIcon(getClass().getResource("img.jpg"));
		this.setIconImage(icon.getImage());
		
		//TEXTFIELD
		w1 = new JTextField();
		w1.setBounds(40,140,200,50);  //text field is positioned at (x=220, y=100) within the panel, with a width of 100 pixels and a height of 25 pixels
		c.add(w1);

		w2 = new JTextField();
		w2.setBounds(40,280,200,50);
		c.add(w2);
		
		//BUTTON
		b1 = new JButton("LOG IN");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setForeground(Color.green);
		b1.setBounds(40,350,150,30);
		b1.addActionListener(this);   
		c.add(b1);
		
		b2 = new JButton("BACK");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setForeground(Color.red);
		b2.setBounds(40,400,150,30);
		b2.addActionListener(this);  
		c.add(b2);
		
		//IMAGE
		img=new ImageIcon(getClass().getResource("adm.png"));
		t3=new JLabel(img);
		t3.setBounds(0,0,900,600);
		c.add(t3);
		
		
	  
	}
	
	//FUNCTION
	
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b1)
			{
			 String num = w1.getText();
			 String pin = w2.getText();
			 w1.setText("");
			 w2.setText("");
			 if(num.contains(xx)&&pin.contains(yy))
			 {
				Form12 fg = new Form12();
				this.setVisible(false);
				fg.setVisible(true); 
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null,"Wrong Name or Pin","Error",0);
			 }
			 
			}
		else if(ae.getSource()==b2)
			{
			    Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true); 
			}	
	}

		

}