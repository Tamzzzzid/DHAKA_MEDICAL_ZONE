import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form10M extends JFrame implements ActionListener //6MENU
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t4;//4 infos+image
		Font f;
		JButton b1,b2,b3,b4;//Calculate,home
		public Form10M()
		{
			//FUNDAMENTAL
		   this.setVisible(true);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   this.setSize(900,600);
		  //BG
		   c=this.getContentPane();
		   c.setBackground(Color.pink);
		   c.setLayout(null);
		   //TITLE
		  this.setTitle(" CHOOSING HOSPITAL");
		  this.setResizable(false);
		  
		  //TEXTS
		  /*f=new Font("Arial",Font.BOLD,25);
		  t1=new JLabel("CHOOSE YOUR HOSPITAL ");
		  t1.setBounds(350,20,200,50);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1); */
		  
		  
		  //BUTTON
		  b1 = new JButton("SELECT");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.BLUE);
		  b1.setBounds(70,450,160,50);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b2 = new JButton("SELECT");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.BLUE);
		  b2.setBounds(370,450,160,50);
		  b2.addActionListener(this);   
		  c.add(b2);
		  
		  b3 = new JButton("SELECT");
		  b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b3.setForeground(Color.white);
		  b3.setForeground(Color.BLUE);
		  b3.setBounds(650,450,160,50);
		  b3.addActionListener(this);   
		  c.add(b3);
		  
		  b4 = new JButton("X");
		  b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b4.setForeground(Color.white);
		  b4.setForeground(Color.red);
		  b4.setBounds(0,0,80,30);
		  b4.addActionListener(this);   
		  c.add(b4);
		 
		 //IMAGE
		  img=new ImageIcon(getClass().getResource("chs.jpg"));
		  t4=new JLabel(img);
		  t4.setBounds(0,0,900,600);
		  c.add(t4);
		  
		  this.add(c);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    Form10 f = new Form10();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				Form10A f = new Form10A();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				Form10B f = new Form10B();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b4)
			{
				Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			}
		}
}