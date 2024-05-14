import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Form16 extends JFrame implements ActionListener //BMI
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t2,t3,t4,t5,t6;//4 infos+image
		Font f;
		JTextField w1,w2;//4 text fields
		JButton b1,b2,b3,b4,b5,b6,b11;//Calculate,home
		public Form16()
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
		  t1=new JLabel("WHAT TYPE OF DOCTOR ARE YOU LOOKING FOR?");
		  t1.setBounds(10,10,600,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		
		  t2=new JLabel("YOU MAY CHHOSE : ");
		  t2.setBounds(10,200,600,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  c.add(t2);
		  
		  
		  t3=new JLabel();
		  t3.setBounds(10,250,800,50);
		  t3.setFont(new Font("Arial",Font.BOLD,20));
		  t3.setForeground(Color.white);
		  c.add(t3);
		  
		  t5=new JLabel();
		  t5.setBounds(10,320,800,50);
		  t5.setFont(new Font("Arial",Font.BOLD,20));
		  t5.setForeground(Color.white);
		  c.add(t5);
		  
		  t6=new JLabel();
		  t6.setBounds(10,390,800,50);
		  t6.setFont(new Font("Arial",Font.BOLD,20));
		  t6.setForeground(Color.white);
		  c.add(t6);
		  
		  //BUTTON
		  b1 = new JButton("HEART SPECIALIST");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.BLUE);
		  b1.setBounds(50,50,230,40);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b11 = new JButton("NEUROLOGY");
		  b11.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		  b11.setForeground(Color.white);
		  b11.setForeground(Color.BLUE);
		  b11.setBounds(340,50,230,40);
		  b11.addActionListener(this);   
		  c.add(b11);
		  
		  b3 = new JButton("DERMATOLOGY");
		  b3.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		  b3.setForeground(Color.white);
		  b3.setForeground(Color.BLUE);
		  b3.setBounds(610,50,230,40);
		  b3.addActionListener(this);   
		  c.add(b3);
		  
		  b4 = new JButton("PSYCHIARTIST");
		  b4.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		  b4.setForeground(Color.white);
		  b4.setForeground(Color.BLUE);
		  b4.setBounds(50,110,230,40);
		  b4.addActionListener(this);   
		  c.add(b4);
		  
		  b5 = new JButton("NEUROLOGY");
		  b5.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		  b5.setForeground(Color.white);
		  b5.setForeground(Color.BLUE);
		  b5.setBounds(340,110,230,40);
		  b5.addActionListener(this);   
		  c.add(b5);
		  
		  b6 = new JButton("GYNECOLOGY");
		  b6.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		  b6.setForeground(Color.white);
		  b6.setForeground(Color.BLUE);
		  b6.setBounds(610,110,230,40);
		  b6.addActionListener(this);   
		  c.add(b6);
		  
		  
		  
		  b2 = new JButton("BACK");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.red);
		  b2.setBounds(750,0,150,30);
		  b2.addActionListener(this);   
		  c.add(b2);
		 
		 //IMAGE
		  img=new ImageIcon(getClass().getResource("help.jpg"));
		  t4=new JLabel(img);
		  t4.setBounds(0,0,900,600);
		  c.add(t4);
		  
		  this.add(c);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
			 t3.setText("DR METHILA WOISHE =>UNITED CARE");
			 t5.setText("DR TANVIR HASAN =>ALPHA CARE");
			 t6.setText("DR JANNATUL TANZILA =>BITA CARE");
			 
			}
			
			else if(ae.getSource()==b11)
			{
			 t3.setText("DR TOFAYEL SULTAN =>UNITED CARE");
			 t5.setText("DR SHAFIN AHMED =>ALPHA CARE");
			 t6.setText("DR ANIK KHAN =>BITA CARE");
			}
			else if(ae.getSource()==b3)
			{
			 t3.setText("NEEHAL NASEEM =>UNITED CARE");
			 t5.setText("JUNAYED RAHMAN =>ALPHA CARE");
			 t6.setText("ANI HASAN =>BITA CARE");
			}
			else if(ae.getSource()==b4)
			{
			 t3.setText("DR C.RONALDO =>UNITED CARE");
			 t5.setText("DR RAFSAN HASIN =>ALPHA CARE");
			 t6.setText("DR SABILA NUR =>BITA CARE");
			}
			else if(ae.getSource()==b5)
			{
			 t3.setText("DR TAHSAN KHAN =>UNITED CARE");
			 t5.setText("DR AFRENA HAQUE =>ALPHA CARE");
			 t6.setText("DR MOMINA MUSTAHESAN =>BITA CARE");
			}
			else if(ae.getSource()==b6)
			{
			 t3.setText("DR PRITOM HASAN =>UNITED CARE");
			 t5.setText("DR KANIS FATEMA =>ALPHA CARE");
			 t6.setText("DR TASMIA NEHA =>BITA CARE");
			}
			
			else if(ae.getSource()==b2)
			{
				Form3A f = new Form3A();
				this.setVisible(false);
				f.setVisible(true);
			}
		}
}