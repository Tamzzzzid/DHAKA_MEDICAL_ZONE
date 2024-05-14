import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form8 extends JFrame implements ActionListener //SHOW DOCTOR
{
	
	
	
	ImageIcon icon,img;//for BG
    Container c;
	JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19;//18 infos+image
	Font f;
	JButton b2;//back to page 3
	
	
	public Form8()
	{
		//FUNDAMENTAL
		   this.setVisible(true);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   this.setSize(900,600);
		  //BG
		   c=this.getContentPane();
		   c.setBackground(Color.black);
		   c.setLayout(null);
		   //TITLE
		  this.setTitle("HOSPITAL");
		  this.setResizable(false);
		  
		  //TEXTS
		  f=new Font("Arial",Font.BOLD,18);
		  t1=new JLabel("NAME        :");
		  t1.setBounds(10,50,280,30);
		  t1.setFont(f);
		  t1.setForeground(Color.white);
		  c.add(t1);
		
		  t2=new JLabel();
		  t2.setBounds(300,50,300,30);
		  t2.setFont(f);
		  t2.setForeground(Color.white);
		  //t2.setText(cname);
		  c.add(t2);
		  
		  t3=new JLabel("SECTION :");
		  t3.setBounds(10,100,270,30);
		  t3.setFont(f);
		  t3.setForeground(Color.white);
		  c.add(t3);
		  
		  t4=new JLabel();
		  t4.setBounds(300,100,270,30);
		  t4.setFont(f);
		  t4.setForeground(Color.white);
		  //t4.setText(String.valueOf(cnum));
		  c.add(t4);
		  
		  t5=new JLabel("AGE         :");
		  t5.setBounds(10,150,270,30);
		  t5.setFont(f);
		  t5.setForeground(Color.white);
		  c.add(t5);
		  
		  t6=new JLabel();
		  t6.setBounds(300,150,270,30);
		  t6.setFont(f);
		  t6.setForeground(Color.white);
		 // t6.setText(String.valueOf(cage));
		  c.add(t6);
		  
		  t7=new JLabel("GENDER      :");
		  t7.setBounds(10,200,270,30);
		  t7.setFont(f);
		  t7.setForeground(Color.white);
		  c.add(t7);
		  
		  t8=new JLabel();
		  t8.setBounds(300,200,270,30);
		  t8.setFont(f);
		  t8.setForeground(Color.white);
		  //t8.setText(String.valueOf(cgender));
		  c.add(t8);
		  
		  t9=new JLabel("MBBS FROM :");
		  t9.setBounds(10,250,270,30);
		  t9.setFont(f);
		  t9.setForeground(Color.white);
		  c.add(t9);
		  
		  t10=new JLabel();
		  t10.setBounds(300,250,270,30);
		  t10.setFont(f);
		  t10.setForeground(Color.white);
		  //t10.setText(String.valueOf(cweight));
		  c.add(t10);
		  
		  t11=new JLabel("MD FROM :");
		  t11.setBounds(10,300,270,30);
		  t11.setFont(f);
		  t11.setForeground(Color.white);
		  c.add(t11);
		  
		  t12=new JLabel();
		  t12.setBounds(300,300,270,30);
		  t12.setFont(f);
		  t12.setForeground(Color.white);
		  c.add(t12);
		  
		  t13=new JLabel("EXPERIENCE      :");
		  t13.setBounds(10,350,270,30);
		  t13.setFont(f);
		  t13.setForeground(Color.white);
		  c.add(t13);
		  
		  t14=new JLabel();
		  t14.setBounds(300,350,270,30);
		  t14.setFont(f);
		  t14.setForeground(Color.white);
		  c.add(t14);
		  
		  t15=new JLabel("FEE     :");
		  t15.setBounds(10,400,270,30);
		  t15.setFont(f);
		  t15.setForeground(Color.white);
		  c.add(t15);
		  
		  t16=new JLabel();
		  t16.setBounds(300,400,270,30);
		  t16.setFont(f);
		  t16.setForeground(Color.white);
		  c.add(t16);
		  
		  t17=new JLabel("SCHEDULE    :");
		  t17.setBounds(10,450,270,30);
		  t17.setFont(f);
		  t17.setForeground(Color.white);
		  c.add(t17);
		  
		  t18=new JLabel();
		  t18.setBounds(300,450,270,30);
		  t18.setFont(f);
		  t18.setForeground(Color.white);
		  c.add(t18);
		  
		  //button
		  b2 = new JButton("BACK");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.red);
		  b2.setBounds(0,0,150,30);
		  b2.addActionListener(this);   
		  c.add(b2);
		  
		  //IMAGE
		  img=new ImageIcon(getClass().getResource("show.jpg"));
		  t19=new JLabel(img);
		  t19.setBounds(0,0,900,600);
		  c.add(t19);
		  
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			Form7M f = new Form7M();
			this.setVisible(false);
			f.setVisible(true);
		}
	}
	
}