import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form7A extends JFrame implements ActionListener //DOCTOR LIST
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t12;//6 infos+image+3 titles
		Font f,f1;
		JTextField w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12;//12 text fields
		JButton b1,b2,b3,b4,b5,b6,b7,b8;//6 see buttons+1 back 
		public Form7A()
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
		  t1=new JLabel("DR TANVIR HASAN :");
		  t1.setBounds(10,100,300,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		  
		  t2=new JLabel("DR SHAFIN AHMED :");
		  t2.setBounds(10,170,300,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  c.add(t2);
		  
		  t3=new JLabel("DR JUNAYED RAHMAN :");
		  t3.setBounds(10,240,300,30);
		  t3.setFont(f);
		  t3.setForeground(Color.white);
		  c.add(t3);
		  
		  t12=new JLabel("DR RAFSAN HASIN :");
		  t12.setBounds(10,310,300,30);
		  t12.setFont(f);
		  t12.setForeground(Color.white);
		  c.add(t12);
		  
		  t5=new JLabel("DR AFRENA HAQUE : ");
		  t5.setBounds(10,380,300,30);
		  t5.setFont(f);
		  t5.setForeground(Color.white);
		  c.add(t5);
		  
		  t6=new JLabel("DR KANIS FATEMA : ");
		  t6.setBounds(10,450,300,30);
		  t6.setFont(f);
		  t6.setForeground(Color.white);
		  c.add(t6);
		  
		  //f1=new Font("Arial",Font.BOLD,22);
		  t7=new JLabel("INFO");
		  t7.setBounds(350,10,270,30);
		  t7.setFont(f);
		  t7.setForeground(Color.red);
		  c.add(t7);
		  
		  t9=new JLabel("NAME");
		  t9.setBounds(10,10,270,30);
		  t9.setFont(f);
		  t9.setForeground(Color.red);
		  c.add(t9);
		  
		 /* t9=new JLabel("ENTER YOUR GENDER :");
		  t9.setBounds(10,350,270,30);
		  t9.setFont(f);
		  t9.setForeground(Color.white);
		  c.add(t9); */
		  
		  
		  
		  //BUTTON
		  
		  b1 = new JButton("SHOW");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.green);
		  b1.setBounds(350,100,100,40);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b2 = new JButton("SHOW");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.green);
		  b2.setBounds(350,170,100,40);
		  b2.addActionListener(this);   
		  c.add(b2);
		  
		  b3 = new JButton("SHOW");
		  b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b3.setForeground(Color.white);
		  b3.setForeground(Color.green);
		  b3.setBounds(350,240,100,40);
		  b3.addActionListener(this);   
		  c.add(b3);
		  
		  b4 = new JButton("SHOW");
		  b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b4.setForeground(Color.white);
		  b4.setForeground(Color.green);
		  b4.setBounds(350,310,100,40);
		  b4.addActionListener(this);   
		  c.add(b4);
		  
		  b5 = new JButton("SHOW");
		  b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b5.setForeground(Color.white);
		  b5.setForeground(Color.green);
		  b5.setBounds(350,380,100,40);
		  b5.addActionListener(this);   
		  c.add(b5);
		  
		  b6 = new JButton("SHOW");
		  b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b6.setForeground(Color.white);
		  b6.setForeground(Color.green);
		  b6.setBounds(350,450,100,40);
		  b6.addActionListener(this);   
		  c.add(b6);
		  
		  
		  b7 = new JButton("BACK");
		  b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b7.setForeground(Color.white);
		  b7.setForeground(Color.red);
		  b7.setBounds(10,10,100,50);
		  b7.addActionListener(this);   
		  c.add(b7);
		  
		  //IMAGE
		  img=new ImageIcon(getClass().getResource("bmi.jpg"));
		  t10=new JLabel(img);
		  t10.setBounds(0,0,900,600);
		  c.add(t10);
		  
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 Form8 ff=new Form8();
			 ff.t2.setText("DR TANVIR HASAN");
			 ff.t4.setText("HEART SPECIALIST");
			 ff.t6.setText("31");
			 ff.t8.setText("MALE");
			 ff.t10.setText("DMC");
			 ff.t12.setText("UK");
			 ff.t14.setText("3 YEARS");
			 ff.t16.setText("2000 TK");
			 ff.t18.setText("7.30 PM -10 PM");
			}
			 
			else if(ae.getSource()==b2)
			{
			 Form8 ff=new Form8();
			 ff.t2.setText("DR SHAFIN AHMED");
			 ff.t4.setText("NEUROLOGY ");
			 ff.t6.setText("35");
			 ff.t8.setText("MALE");
			 ff.t10.setText("SMC");
			 ff.t12.setText("USA");
			 ff.t14.setText("4 YEARS");
			 ff.t16.setText("1800 TK");
			 ff.t18.setText("4.30 PM -9.30 PM");
			 
			 
			}
			else if(ae.getSource()==b3)
			{
			 Form8 ff=new Form8();
			 ff.t2.setText("DR JUNAYED RAHMAN");
			 ff.t4.setText("DERMATOLOGY ");
			 ff.t6.setText("45");
			 ff.t8.setText("MALE");
			 ff.t10.setText("PMC");
			 ff.t12.setText("CANADA");
			 ff.t14.setText("15 YEARS");
			 ff.t16.setText("1200 TK");
			 ff.t18.setText("1.30 PM -6.30 PM");
			}
			
			else if(ae.getSource()==b4)
			{
			 Form8 ff=new Form8();
			 ff.t2.setText("DR RAFSAN HASIN");
			 ff.t4.setText("PSYCHIATRIST ");
			 ff.t6.setText("48");
			 ff.t8.setText("MALE");
			 ff.t10.setText("DMC");
			 ff.t12.setText("PORTUGAL");
			 ff.t14.setText("20 YEARS");
			 ff.t16.setText("5000 TK");
			 ff.t18.setText("1.00 PM -6.30 PM");
			}
			
			else if(ae.getSource()==b5)
			{
			 Form8 ff=new Form8();
			 ff.t2.setText("DR AFRRENA HAQUE");
			 ff.t4.setText("NEUROLOGIST ");
			 ff.t6.setText("45");
			 ff.t8.setText("FEMALE");
			 ff.t10.setText("DMC");
			 ff.t12.setText("JAPAN");
			 ff.t14.setText("18 YEARS");
			 ff.t16.setText("1700 TK");
			 ff.t18.setText("10.00 AM -2.30 PM");
			}
			else if(ae.getSource()==b6)
			{
			 Form8 ff=new Form8();
			 ff.t2.setText("DR KANIS FATEMA");
			 ff.t4.setText("GYNECOLOGIST ");
			 ff.t6.setText("38");
			 ff.t8.setText("FEMALE");
			 ff.t10.setText("SMC");
			 ff.t12.setText("INDIA");
			 ff.t14.setText("15 YEARS");
			 ff.t16.setText("1100 TK");
			 ff.t18.setText("6.00 PM -9.30 PM");
			}
			
			else if(ae.getSource()==b7)
			{
			    Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			 
			 
			}
			
			
		}
}
