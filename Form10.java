import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form10 extends JFrame implements ActionListener //SET SALARY
{
	    ImageIcon icon,img;//for BG
		Container c;
		JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;//6 infos+image+3 titles
		Font f,f1;
		JTextField w1,w2,w3,w4,w5,w6,w11,w22,w33,w44,w55,w66;//12 text fields
		JButton b1,b2,b3,b4,b5,b6,b7,b8;//6 see buttons+1 back 
		public Form10()
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
		  t1=new JLabel("METHILA WOISHE :");
		  t1.setBounds(10,100,300,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		  
		  t2=new JLabel("TOFAYEL SULTAN :");
		  t2.setBounds(10,170,300,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  c.add(t2);
		  
		  t3=new JLabel("NEEHAL NASEEN :");
		  t3.setBounds(10,240,300,30);
		  t3.setFont(f);
		  t3.setForeground(Color.white);
		  c.add(t3);
		  
		  t12=new JLabel("C RONALDO :");
		  t12.setBounds(10,310,300,30);
		  t12.setFont(f);
		  t12.setForeground(Color.white);
		  c.add(t12);
		  
		  t5=new JLabel("TAHSAN KHAN");
		  t5.setBounds(10,380,300,30);
		  t5.setFont(f);
		  t5.setForeground(Color.white);
		  c.add(t5);
		  
		  t6=new JLabel("PRITOM HASAN");
		  t6.setBounds(10,450,300,30);
		  t6.setFont(f);
		  t6.setForeground(Color.white);
		  c.add(t6);
		  
		  //f1=new Font("Arial",Font.BOLD,22);
		  t7=new JLabel("SET WAGE");
		  t7.setBounds(350,10,270,30);
		  t7.setFont(f);
		  t7.setForeground(Color.red);
		  c.add(t7);
		  
		  t9=new JLabel("NAME");
		  t9.setBounds(10,10,270,30);
		  t9.setFont(f);
		  t9.setForeground(Color.red);
		  c.add(t9);
		  
		  t11=new JLabel("SET MONTH");
		  t11.setBounds(600,10,270,30);
		  t11.setFont(f);
		  t11.setForeground(Color.red);
		  c.add(t11);
		  
		 /* t9=new JLabel("ENTER YOUR GENDER :");
		  t9.setBounds(10,350,270,30);
		  t9.setFont(f);
		  t9.setForeground(Color.white);
		  c.add(t9); */
		  
		  
		  
		  //BUTTON
		  
		  b6 = new JButton("DONE");
		  b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b6.setForeground(Color.white);
		  b6.setForeground(Color.green);
		  b6.setBounds(10,510,100,50);
		  b6.addActionListener(this);   
		  c.add(b6);
		  
		  
		  b7 = new JButton("EXIT");
		  b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b7.setForeground(Color.white);
		  b7.setForeground(Color.red);
		  b7.setBounds(140,510,100,50);
		  b7.addActionListener(this);   
		  c.add(b7);
		  
		 //TEXT FIELD
		  w1 = new JTextField();
		  w1.setBounds(350,100,200,40);
		  c.add(w1);
		  
		  w2 = new JTextField();
		  w2.setBounds(350,170,200,40);
		  c.add(w2);
		  
		  w3 = new JTextField();
		  w3.setBounds(350,240,200,40);
		  c.add(w3);
		  
		  w4 = new JTextField();
		  w4.setBounds(350,310,200,40);
		  c.add(w4);
		  
		  w5 = new JTextField();
		  w5.setBounds(350,380,200,40);
		  c.add(w5);
		  
		  w6 = new JTextField();
		  w6.setBounds(350,450,200,40);
		  c.add(w6);
		  
		  w11 = new JTextField();
		  w11.setBounds(600,100,200,40);
		  c.add(w11);
		  
		  w22 = new JTextField();
		  w22.setBounds(600,170,200,40);
		  c.add(w22);
		  
		  w33 = new JTextField();
		  w33.setBounds(600,240,200,40);
		  c.add(w33);
		  
		  w44 = new JTextField();
		  w44.setBounds(600,310,200,40);
		  c.add(w44);
		  
		  w55 = new JTextField();
		  w55.setBounds(600,380,200,40);
		  c.add(w55);
		  
		  w66 = new JTextField();
		  w66.setBounds(600,450,200,40);
		  c.add(w66);
		  
		  //IMAGE
		  img=new ImageIcon(getClass().getResource("reg.jpg"));
		  t10=new JLabel(img);
		  t10.setBounds(0,0,900,600);
		  c.add(t10);
		  
		}
		public void actionPerformed(ActionEvent ae)
		{
			
			
			if(ae.getSource()==b7)
			{
			    Form10M f = new Form10M();
				this.setVisible(false);
				f.setVisible(true);
			 
			 
			}
			
			else if(ae.getSource()==b6) //DONE
			{
			 Form11 ff=new Form11();
			 ff.tt1.setText(w1.getText());
			 ff.tt2.setText(w2.getText());
			 ff.tt3.setText(w3.getText());
			 ff.tt4.setText(w4.getText());
			 ff.tt5.setText(w5.getText());
			 ff.tt6.setText(w6.getText());
			 ff.ttt1.setText(w11.getText());
			 ff.ttt2.setText(w22.getText());
			 ff.ttt3.setText(w33.getText());
			 ff.ttt4.setText(w44.getText());
			 ff.ttt5.setText(w55.getText());
			 ff.ttt6.setText(w66.getText());
			 
			  int a = Integer.parseInt(w1.getText());
			  int aa = Integer.parseInt(w11.getText());
			  int b = Integer.parseInt(w2.getText());
			  int bb = Integer.parseInt(w22.getText());
			  int c = Integer.parseInt(w3.getText());
			  int cc = Integer.parseInt(w33.getText());
			  int d = Integer.parseInt(w4.getText());
			  int dd = Integer.parseInt(w44.getText());
			  int e = Integer.parseInt(w5.getText());
			  int ee = Integer.parseInt(w55.getText());
			  int f = Integer.parseInt(w6.getText());
			  int fff = Integer.parseInt(w66.getText());
			  
			  int x=a*aa+b*bb+c*cc+d*dd+e*ee+f*fff;
			  ff.t77.setText("TOTAL = "+String.valueOf(x)+" /BDT");
			 
			 
			 
			}
			
			
		}
}
