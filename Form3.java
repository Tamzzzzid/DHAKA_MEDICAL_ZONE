import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form3 extends JFrame implements ActionListener //MENU
{
	   ImageIcon icon,img;
	   Container c;
       JLabel t,t1,t3;
	   Font f;
	   JTextField w1,w2;
	   JButton b1,b2,b3,b4,b5,b6,b7,b8;
	   public Form3()
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
		  b1 = new JButton("BACK");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.green);
		  b1.setBounds(0,0,100,30);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b2 = new JButton("X");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.red);
		  b2.setBounds(110,0,100,30);
		  b2.addActionListener(this);
		  c.add(b2);
		  
		  b3 = new JButton("SELECT");//APPOINMENT
		  b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b3.setForeground(Color.white);
		  b3.setForeground(Color.green);
		  b3.setBounds(70,60,150,30);
		  b3.addActionListener(this);
		  c.add(b3);
		  
		  b4 = new JButton("SELECT");//DOCTOR
		  b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b4.setForeground(Color.white);
		  b4.setForeground(Color.green);
		  b4.setBounds(365,60,150,30);
		  b4.addActionListener(this);
		  c.add(b4);
		  
		  b5 = new JButton("ADMIN");//admin
		  b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b5.setForeground(Color.white);
		  b5.setForeground(Color.green);
		  b5.setBounds(670,60,150,30);
		  b5.addActionListener(this);
		  c.add(b5);
		  
		  b6 = new JButton("SELECT");//logout
		  b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b6.setForeground(Color.white);
		  b6.setForeground(Color.green);
		  b6.setBounds(70,335,150,30);
		  b6.addActionListener(this);
		  c.add(b6);
		  
		  b7 = new JButton("SELECT");//bmi
		  b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b7.setForeground(Color.white);
		  b7.setForeground(Color.green);
		  b7.setBounds(365,335,150,30);
		  b7.addActionListener(this);
		  c.add(b7);
		  
		  b8 = new JButton("=>");//next page
		  b8.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b8.setForeground(Color.white);
		  b8.setForeground(Color.BLUE);
		  b8.setBounds(820,0,80,30);
		  b8.addActionListener(this);
		  c.add(b8);
		 
		 //IMAGE
		img=new ImageIcon(getClass().getResource("menu.jpg"));
		t3=new JLabel(img);
		t3.setBounds(0,0,900,600);
		c.add(t3);
		
		this.add(c);
	   }
	   
	   public void actionPerformed(ActionEvent ae)
	   {
		   if(ae.getSource()==b1)
		   {
			   Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b2)
		   {
			   System.exit(0); 
		   }
		   else if(ae.getSource()==b3)
		   {
			   Form6M f = new Form6M();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b4)
		   {
			   Form7M f = new Form7M();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b5)
		   {
			   Form9 f = new Form9();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b6)
		   {
			   Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true); 
		   }
		   else if(ae.getSource()==b7)
		   {
			   Form4 fk = new Form4();
				this.setVisible(false);
				fk.setVisible(true); 
		   }
		   else if(ae.getSource()==b8)
		   {
			   Form3A fk = new Form3A();
				this.setVisible(false);
				fk.setVisible(true); 
		   }
	   }
	   
}