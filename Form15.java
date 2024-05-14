import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Form15 extends JFrame implements ActionListener //INSULIN
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t2,t3,t4,t5;//4 infos+image
		Font f;
		JTextField w1,w2;//4 text fields
		JButton b1,b2,b11;//Calculate,home
		public Form15()
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
		  
		  //TEXTS
		  f=new Font("Arial",Font.BOLD,18);
		  t1=new JLabel("ENTER YOUR INSULIN LEVEL IN Mg/DL :");
		  t1.setBounds(10,50,600,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		
		  t2=new JLabel("HAVE YOU TAKEN FOOD WITHIN 2 HOURS?: ");
		  t2.setBounds(10,150,600,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  c.add(t2);
		  
		  
		  t5=new JLabel();
		  t5.setBounds(10,450,700,50);
		  t5.setFont(new Font("Arial",Font.BOLD,25));
		  t5.setForeground(Color.red);
		  c.add(t5);
		  
		  //TEXTFIELD
		  w1 = new JTextField();
		  w1.setBounds(10,90,270,50);  
		  c.add(w1);

		  
		  
		  
		  //BUTTON
		  b1 = new JButton("YES");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.green);
		  b1.setBounds(10,190,100,50);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b11 = new JButton("NO");
		  b11.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b11.setForeground(Color.white);
		  b11.setForeground(Color.red);
		  b11.setBounds(120,190,100,50);
		  b11.addActionListener(this);   
		  c.add(b11);
		  
		  b2 = new JButton("BACK");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.red);
		  b2.setBounds(0,0,150,30);
		  b2.addActionListener(this);   
		  c.add(b2);
		 
		 //IMAGE
		  img=new ImageIcon(getClass().getResource("sug.jpg"));
		  t4=new JLabel(img);
		  t4.setBounds(0,0,900,600);
		  c.add(t4);
		  
		  this.add(c);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
			 float a = Float.parseFloat(w1.getText());
			 if(a>170f&&a<200f)
			 {
				 t5.setText("INSULIN STATUS: NORMAL");
			 }
			 else if(a>190f&&a<300f)
			 {
				 t5.setText("INSULIN STATUS: IMPAIRED GLUCOSE");
			 }
			 else if(a>=300)
			 {
				 t5.setText("INSULIN STATUS: DIABETIC");
			 }
			 
			 else 
			 {
				 t5.setText("INSULIN STATUS:UNSTABLE CONDITION");
			 }
			}
			
			else if(ae.getSource()==b11)
			{
			 float a = Float.parseFloat(w1.getText());
			 if(a>120f&&a<140f)
			 {
				 t5.setText("INSULIN STATUS: NORMAL");
			 }
			 else if(a>140f&&a<200f)
			 {
				 t5.setText("INSULIN STATUS: IMPAIRED GLUCOSE");
			 }
			 else if(a>=200)
			 {
				 t5.setText("INSULIN STATUS: DIABETIC");
			 }
			 
			 else 
			 {
				 t5.setText("INSULIN STATUS:UNSTABLE CONDITION");
			 }
			}
			
			else if(ae.getSource()==b2)
			{
				Form3A f = new Form3A();
				this.setVisible(false);
				f.setVisible(true);
			}
		}
}