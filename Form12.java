import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form12 extends JFrame implements ActionListener //HUMAN VERIFY
{
	ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t2,t3;
		Font f,f1;
		JButton b1,b2;//6 see buttons+1 back 
		public Form12()
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
		  this.setTitle("HOSPITAL");
		  this.setResizable(false);
		  
		  //text
		  f=new Font("Arial",Font.BOLD,24);
		  t1=new JLabel("HUMAN VERIFICATION");
		  t1.setBounds(340,65,300,60);
		  t1.setFont(f);
		  t1.setForeground(Color.blue);
		  c.add(t1);
		  
		  f1=new Font("Arial",Font.BOLD,18);
		  t2=new JLabel("*select the image containing bus");
		  t2.setBounds(259,140,300,30);
		  t2.setFont(f1);
		  t2.setForeground(Color.red);
		  c.add(t2);
		  
		  //BUTTON
		  b1 = new JButton("SELECT");//bus
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.green);
		  b1.setBounds(317,180,100,30);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b2 = new JButton("SELECT");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.green);
		  b2.setBounds(521,180,100,30);
		  b2.addActionListener(this);
		  c.add(b2);
		  
		  
		  //IMAGE
		  img=new ImageIcon(getClass().getResource("hmn.jpg"));
		  t3=new JLabel(img);
		  t3.setBounds(0,0,900,600);
		  c.add(t3);
		  
		  
		}
		public void actionPerformed(ActionEvent ae)
		{
			
			
			if(ae.getSource()==b1) //bus
			{
			    Form10M f = new Form10M();
				this.setVisible(false);
				f.setVisible(true);
			 
			 
			}
			
			else if(ae.getSource()==b2) //wrong
			{
			    Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			 
			 
			}
			
			
			
			
		}
}