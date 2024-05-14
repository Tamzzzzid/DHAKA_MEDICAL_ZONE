import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form11B extends JFrame implements ActionListener //OUTPUT SALARY
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t2,t3,t4,t5,t6,t7,t77,t8,t9,t10,t11,t12,tt1,tt2,tt3,tt4,tt5,tt6,ttt1,ttt2,ttt3,ttt4,ttt5,ttt6;//6 infos+image+3 titles
		Font f,f1;
		JButton b7;//6 see buttons+1 back 
		public Form11B()
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
		  f1=new Font("Arial",Font.BOLD,23);
		  t1=new JLabel("JANNATUL TANZILA :");
		  t1.setBounds(10,100,300,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		  
		  t2=new JLabel("ANIK KHAN :");
		  t2.setBounds(10,170,300,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  c.add(t2);
		  
		  t3=new JLabel("ANI HASAN :");
		  t3.setBounds(10,240,300,30);
		  t3.setFont(f);
		  t3.setForeground(Color.white);
		  c.add(t3);
		  
		  t12=new JLabel("SABILA NUR :");
		  t12.setBounds(10,310,300,30);
		  t12.setFont(f);
		  t12.setForeground(Color.white);
		  c.add(t12);
		  
		  t5=new JLabel("MOMINA MUSTAHESAN : ");
		  t5.setBounds(10,380,300,30);
		  t5.setFont(f);
		  t5.setForeground(Color.white);
		  c.add(t5);
		  
		  t6=new JLabel("TASMIA NEHA : ");
		  t6.setBounds(10,450,300,30);
		  t6.setFont(f);
		  t6.setForeground(Color.white);
		  c.add(t6);
		  
		  t77=new JLabel();//total
		  t77.setBounds(150,510,500,40);
		  t77.setFont(f1);
		  t77.setForeground(Color.red);
		  c.add(t77);
		  
		  //f1=new Font("Arial",Font.BOLD,22);
		  t7=new JLabel("WAGE");
		  t7.setBounds(350,10,270,30);
		  t7.setFont(f);
		  t7.setForeground(Color.red);
		  c.add(t7);
		  
		  t9=new JLabel("NAME");
		  t9.setBounds(10,10,270,30);
		  t9.setFont(f);
		  t9.setForeground(Color.red);
		  c.add(t9);
		  
		  t11=new JLabel("DURATION(MONTH)");
		  t11.setBounds(600,10,270,30);
		  t11.setFont(f);
		  t11.setForeground(Color.red);
		  c.add(t11);
		  
		  tt1=new JLabel();
		  tt1.setBounds(350,100,200,40);
		  tt1.setFont(f);
		  tt1.setForeground(Color.white);
		  c.add(tt1);
		  
		  tt2=new JLabel();
		  tt2.setBounds(350,170,200,40);
		  tt2.setFont(f);
		  tt2.setForeground(Color.white);
		  c.add(tt2);
		  
		  tt3=new JLabel();
		  tt3.setBounds(350,240,200,40);
		  tt3.setFont(f);
		  tt3.setForeground(Color.white);
		  c.add(tt3);
		  
		  tt4=new JLabel();
		  tt4.setBounds(350,310,200,40);
		  tt4.setFont(f);
		  tt4.setForeground(Color.white);
		  c.add(tt4);
		  
		  tt5=new JLabel();
		  tt5.setBounds(350,380,200,40);
		  tt5.setFont(f);
		  tt5.setForeground(Color.white);
		  c.add(tt5);
		  
		  tt6=new JLabel();
		  tt6.setBounds(350,450,200,40);
		  tt6.setFont(f);
		  tt6.setForeground(Color.white);
		  c.add(tt6);
		  
		  ttt1=new JLabel();
		  ttt1.setBounds(600,100,200,40);
		  ttt1.setFont(f);
		  ttt1.setForeground(Color.white);
		  c.add(ttt1);
		  
		  ttt2=new JLabel();
		  ttt2.setBounds(600,170,200,40);
		  ttt2.setFont(f);
		  ttt2.setForeground(Color.white);
		  c.add(ttt2);
		  
		  ttt3=new JLabel();
		  ttt3.setBounds(600,240,200,40);
		  ttt3.setFont(f);
		  ttt3.setForeground(Color.white);
		  c.add(ttt3);
		  
		  ttt4=new JLabel();
		  ttt4.setBounds(600,310,200,40);
		  ttt4.setFont(f);
		  ttt4.setForeground(Color.white);
		  c.add(ttt4);
		  
		  ttt5=new JLabel();
		  ttt5.setBounds(600,380,200,40);
		  ttt5.setFont(f);
		  ttt5.setForeground(Color.white);
		  c.add(ttt5);
		  
		  ttt6=new JLabel();
		  ttt6.setBounds(600,450,200,40);
		  ttt6.setFont(f);
		  ttt6.setForeground(Color.white);
		  c.add(ttt6);
		  
		  
		  
		 /* t9=new JLabel("ENTER YOUR GENDER :");
		  t9.setBounds(10,350,270,30);
		  t9.setFont(f);
		  t9.setForeground(Color.white);
		  c.add(t9); */
		  
		  
		  
		  //BUTTON
		  
		 
		  
		  
		  b7 = new JButton("EXIT");
		  b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b7.setForeground(Color.white);
		  b7.setForeground(Color.red);
		  b7.setBounds(10,510,100,50);
		  b7.addActionListener(this);   
		  c.add(b7);
		  
		 
		  
		  //IMAGE
		  img=new ImageIcon(getClass().getResource("show.jpg"));
		  t10=new JLabel(img);
		  t10.setBounds(0,0,900,600);
		  c.add(t10);
		  
		}
		public void actionPerformed(ActionEvent ae)
		{
			
			
			if(ae.getSource()==b7)
			{
			    Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			 
			 
			}
			
			
			
			
		}
}
