import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Form14 extends JFrame implements ActionListener //pressure
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t2,t3,t4,t5;//4 infos+image
		Font f;
		JTextField w1,w2;//4 text fields
		JButton b1,b2;//Calculate,home
		public Form14()
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
		  t1=new JLabel("ENTER SYSTOLIC PRESSURE IN MM :");
		  t1.setBounds(10,50,600,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		
		  t2=new JLabel("ENTER DIASTOLIC PRESSURE IN MM: ");
		  t2.setBounds(10,150,600,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  c.add(t2);
		  
		  
		  t5=new JLabel();
		  t5.setBounds(10,450,700,50);
		  t5.setFont(new Font("Arial",Font.BOLD,25));
		  t5.setForeground(Color.white);
		  c.add(t5);
		  
		  //TEXTFIELD
		  w1 = new JTextField();
		  w1.setBounds(10,90,270,50);  
		  c.add(w1);

		  w2 = new JTextField();
		  w2.setBounds(10,190,270,50);
		  c.add(w2);
		  
		  
		  
		  //BUTTON
		  b1 = new JButton("CALCULATE");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.green);
		  b1.setBounds(10,280,200,50);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b2 = new JButton("BACK");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.red);
		  b2.setBounds(0,0,150,30);
		  b2.addActionListener(this);   
		  c.add(b2);
		 
		 //IMAGE
		  img=new ImageIcon(getClass().getResource("blood.jpg"));
		  t4=new JLabel(img);
		  t4.setBounds(0,0,900,600);
		  c.add(t4);
		  
		  this.add(c);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			float s;
			if(ae.getSource()==b1)
			{
			 float a = Float.parseFloat(w1.getText());
			 float b = Float.parseFloat(w2.getText());
			 if(a<90f&&b<60f)
			 {
				 t5.setText("PRESSURE STATUS: LOW PRESSURE");
			 }
			 else if(a<120f&&b<80f)
			 {
				 t5.setText("PRESSURE STATUS: NORMAL");
			 }
			 else if(a<129f&&b<80f)
			 {
				 t5.setText("PRESSURE STATUS: ELEVATED");
			 }
			 else if(a<=139f&&b<=89f)
			 {
				 t5.setText("PRESSURE STATUS: HIGH PRESSURE STAGE 1");
			 }
			 else if(a>180f&&b>=120f)
			 {
				 t5.setText("PRESSURE STATUS: HYPERTENSIVE CRISIS");
			 }
			 else if(a>139f&&b>=90f)
			 {
				 t5.setText("PRESSURE STATUS: HIGH PRESSURE STAGE 2");
			 }
			 else 
			 {
				 t5.setText("PRESSURE STATUS:UNSTABLE CONDITION");
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