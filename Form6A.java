import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form6A extends JFrame implements ActionListener //TAKE APPOINMENT WILL COME FROM CHOOSE DOC
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t,t1,t2,t3,t4,t5,t7,t8;//4 infos+image
		Font f,f1;
		JTextField w,w1,w2,w3,w4;//4 text fields
		JButton b1,b2,b3,b4,b5,b6,b7,b8;//DONE
		
		public Form6A()
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
		  t=new JLabel("ENTER YOUR NICK NAME :");
		  t.setBounds(10,50,270,30);
		  t.setFont(f);
		  t.setForeground(Color.white);
		  c.add(t);
		
		  t1=new JLabel("ENTER YOUR CELL NUMBER :");
		  t1.setBounds(10,150,300,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		  
		  t2=new JLabel("ENTER YOUR AGE :");
		  t2.setBounds(10,250,270,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  c.add(t2);
		  
		  t3=new JLabel("ENTER YOUR GENDER :");
		  t3.setBounds(10,350,270,30);
		  t3.setFont(f);
		  t3.setForeground(Color.white);
		  c.add(t3);
		  
		  t4=new JLabel("ENTER YOUR WEIGHT :");
		  t4.setBounds(10,450,270,30);
		  t4.setFont(f);
		  t4.setForeground(Color.white);
		  c.add(t4);
		  
		  f1=new Font("Arial",Font.BOLD,16);
		  t4=new JLabel("*Please fill all the boxes properly before selecting doctor");
		  t4.setBounds(120,0,500,30);
		  t4.setFont(f1);
		  t4.setForeground(Color.red);
		  c.add(t4);
		  
		  f1=new Font("Arial",Font.BOLD,25);
		  t5=new JLabel("CHOOSE DOCTOR");
		  t5.setBounds(500,50,300,50);
		  t5.setFont(f1);
		  t5.setForeground(Color.white);
		  c.add(t5);
		  //TEXTFIELD
		  w = new JTextField();
		  w.setBounds(10,90,270,50);  
		  c.add(w);

		  w1 = new JTextField();
		  w1.setBounds(10,190,270,50);
		  c.add(w1);
		  
		  w2 = new JTextField();
		  w2.setBounds(10,290,270,50);
		  c.add(w2);
		  
		  w3 = new JTextField();
		  w3.setBounds(10,390,270,50);
		  c.add(w3);
		  
		  w4 = new JTextField();
		  w4.setBounds(10,490,270,50);
		  c.add(w4);
		  
		  //BUTTON
		  b2 = new JButton("BACK");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.red);
		  b2.setBounds(0,0,100,30);
		  b2.addActionListener(this);   
		  c.add(b2);
		  
		  /*b1 = new JButton("BACK");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.red);
		  b1.setBounds(110,0,100,30);
		  b1.addActionListener(this);   
		  c.add(b1);*/
		  
		  //doctor buttons
		  b3 = new JButton("DR TANVIR HASAN");
		  b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b3.setForeground(Color.white);
		  b3.setForeground(Color.BLUE);
		  b3.setBounds(500,100,400,60);
		  b3.addActionListener(this);   
		  c.add(b3);
		  
		  b4 = new JButton("DR SHAFIN AHMED");
		  b4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b4.setForeground(Color.white);
		  b4.setForeground(Color.BLUE);
		  b4.setBounds(500,180,400,60);
		  b4.addActionListener(this);   
		  c.add(b4);
		  
		  b5 = new JButton("DR JUNAYED RAHMAN");
		  b5.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b5.setForeground(Color.white);
		  b5.setForeground(Color.BLUE);
		  b5.setBounds(500,260,400,60);
		  b5.addActionListener(this);   
		  c.add(b5);
		  
		  b6 = new JButton("DR RAFSAN HASIN");
		  b6.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b6.setForeground(Color.white);
		  b6.setForeground(Color.BLUE);
		  b6.setBounds(500,340,400,60);
		  b6.addActionListener(this);   
		  c.add(b6);
		  
		  b7 = new JButton("DR AFRENA HAQUE");
		  b7.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b7.setForeground(Color.white);
		  b7.setForeground(Color.BLUE);
		  b7.setBounds(500,420,400,60);
		  b7.addActionListener(this);   
		  c.add(b7);
		  
		  b8 = new JButton("DR KANIS FATEMA");
		  b8.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		  b8.setForeground(Color.white);
		  b8.setForeground(Color.BLUE);
		  b8.setBounds(500,500,400,60);
		  b8.addActionListener(this);   
		  c.add(b8);
		  
		  //IMAGE
		  img=new ImageIcon(getClass().getResource("apm.jpg"));//it was t3
		  t7=new JLabel(img);
		  t7.setBounds(0,0,900,600);
		  c.add(t7);
		  
		  
		  
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b3)
			{
			 Form5 ff=new Form5();
			 ff.t2.setText(w.getText());
			 ff.t4.setText(w1.getText());
			 ff.t6.setText(w2.getText());
			 ff.t8.setText(w3.getText());
			 ff.t10.setText(w4.getText());
			 ff.t12.setText("TANVIR HASAN");
			 ff.t14.setText("7");
			 ff.t16.setText("7.30 P.M");
			 ff.t18.setText("2000 Tk");
			 
			 
			}
			
			else if(ae.getSource()==b4)
			{
			 Form5 ff=new Form5();
			 ff.t2.setText(w.getText());
			 ff.t4.setText(w1.getText());
			 ff.t6.setText(w2.getText());
			 ff.t8.setText(w3.getText());
			 ff.t10.setText(w4.getText());
			 ff.t12.setText("SHAFIN AHMED");
			 ff.t14.setText("13");
			 ff.t16.setText("4.30 P.M");
			 ff.t18.setText("1800 Tk");
			 
			 
			}
			
			else if(ae.getSource()==b5)
			{
			 Form5 ff=new Form5();
			 ff.t2.setText(w.getText());
			 ff.t4.setText(w1.getText());
			 ff.t6.setText(w2.getText());
			 ff.t8.setText(w3.getText());
			 ff.t10.setText(w4.getText());
			 ff.t12.setText("JUNAYED RAHMAN");
			 ff.t14.setText("23");
			 ff.t16.setText("1.30 P.M");
			 ff.t18.setText("1200 Tk");
			 
			 
			}
			
			else if(ae.getSource()==b6)
			{
			 Form5 ff=new Form5();
			 ff.t2.setText(w.getText());
			 ff.t4.setText(w1.getText());
			 ff.t6.setText(w2.getText());
			 ff.t8.setText(w3.getText());
			 ff.t10.setText(w4.getText());
			 ff.t12.setText("RAFSAN KHAN");
			 ff.t14.setText("38");
			 ff.t16.setText("1.00 P.M");
			 ff.t18.setText("5000 Tk");
			 
			 
			}
			else if(ae.getSource()==b7)
			{
			 Form5 ff=new Form5();
			 ff.t2.setText(w.getText());
			 ff.t4.setText(w1.getText());
			 ff.t6.setText(w2.getText());
			 ff.t8.setText(w3.getText());
			 ff.t10.setText(w4.getText());
			 ff.t12.setText("AFRENA HAQUE");
			 ff.t14.setText("23");
			 ff.t16.setText("10.00 A.M");
			 ff.t18.setText("1700 Tk");
			 
			 
			}
			else if(ae.getSource()==b8)
			{
			 Form5 ff=new Form5();
			 ff.t2.setText(w.getText());
			 ff.t4.setText(w1.getText());
			 ff.t6.setText(w2.getText());
			 ff.t8.setText(w3.getText());
			 ff.t10.setText(w4.getText());
			 ff.t12.setText("KANIS FATEMA");
			 ff.t14.setText("63");
			 ff.t16.setText("6.00 P.M");
			 ff.t18.setText("1100 Tk");
			 
			 
			}
			else if(ae.getSource()==b2)
			{
				Form6M f = new Form6M();
				this.setVisible(false);
				f.setVisible(true); 
			}
		}
}
