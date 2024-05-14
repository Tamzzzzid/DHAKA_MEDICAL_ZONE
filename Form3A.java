import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form3A extends JFrame implements ActionListener //MENU
{
	ImageIcon icon,img;
	Container c;
	JButton b1,b2,b3,b4;
	JLabel t;
	public Form3A()
	{
		//FUNDAMENTAL
		 this.setVisible(true);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setSize(900,600);
		 //BG
		 c=this.getContentPane();
		 c.setBackground(Color.pink);
		 c.setLayout(null);
		 
		 //BUTTON
		  b1 = new JButton("<=");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.red);
		  b1.setBounds(0,0,80,30);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b2 = new JButton("SELECT");//HELPCENTER
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.green);
		  b2.setBounds(125,220,150,30);
		  b2.addActionListener(this);
		  c.add(b2);
		  
		  b3 = new JButton("SELECT");//PRESSURE
		  b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b3.setForeground(Color.white);
		  b3.setForeground(Color.green);
		  b3.setBounds(375,220,150,30);
		  b3.addActionListener(this);
		  c.add(b3);
		  
		  b4 = new JButton("SELECT");//INSULINE
		  b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b4.setForeground(Color.white);
		  b4.setForeground(Color.green);
		  b4.setBounds(605,220,150,30);
		  b4.addActionListener(this);
		  c.add(b4);
		  
		//IMAGE
		img=new ImageIcon(getClass().getResource("menuu.jpg"));
		t=new JLabel(img);
		t.setBounds(0,0,900,600);
		c.add(t);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		   {
			   Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b2)
		   {
			    Form16 f = new Form16();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b3)
		   {
			   Form14 f = new Form14();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b4)
		   {
			   Form15 f = new Form15();
				this.setVisible(false);
				f.setVisible(true); 
		   }
	}
}