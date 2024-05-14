import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class Form5 extends JFrame implements ActionListener //SHOW APPOINMENT
{
	
	
	
	ImageIcon icon,img;//for BG
    Container c;
	JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;//18 infos+image
	Font f;
	JTextField w;
	File file;
	FileWriter fwrite;
	JButton b1,b2,b3,b4,b5,b6,b22;//back to page 3
	
	/*public Form5(String a,String b,String c,String d,String e)
	{
		this.cname=a;
		this.cnum=b;
		this.cage=c;
		this.cgender=d;
		this.cweight=e;	
		
	}*/
	public Form5()
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
		  
		  t3=new JLabel("CELL NUMBER :");
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
		  
		  t9=new JLabel("WEIGHT      :");
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
		  
		  t11=new JLabel("DOCTOR      ");
		  t11.setBounds(10,300,270,30);
		  t11.setFont(f);
		  t11.setForeground(Color.white);
		  c.add(t11);
		  
		  t12=new JLabel();
		  t12.setBounds(300,300,270,30);
		  t12.setFont(f);
		  t12.setForeground(Color.white);
		  c.add(t12);
		  
		  t13=new JLabel("SERIAL      :");
		  t13.setBounds(10,350,270,30);
		  t13.setFont(f);
		  t13.setForeground(Color.white);
		  c.add(t13);
		  
		  t14=new JLabel();
		  t14.setBounds(300,350,270,30);
		  t14.setFont(f);
		  t14.setForeground(Color.white);
		  c.add(t14);
		  
		  t15=new JLabel("TIME        :");
		  t15.setBounds(10,400,270,30);
		  t15.setFont(f);
		  t15.setForeground(Color.white);
		  c.add(t15);
		  
		  t16=new JLabel();
		  t16.setBounds(300,400,270,30);
		  t16.setFont(f);
		  t16.setForeground(Color.white);
		  c.add(t16);
		  
		  t17=new JLabel("FEE         :");
		  t17.setBounds(10,450,270,30);
		  t17.setFont(f);
		  t17.setForeground(Color.white);
		  c.add(t17);
		  
		  t18=new JLabel();
		  t18.setBounds(300,450,270,30);
		  t18.setFont(f);
		  t18.setForeground(Color.white);
		  c.add(t18);
		  //TEXTFIELD
		  w = new JTextField();
		  w.setBounds(150,0,550,30);  
		  c.add(w);
		  
		  //button
		  b22 = new JButton("DOWNLOAD");
		  b22.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b22.setForeground(Color.white);
		  b22.setForeground(Color.BLUE);
		  b22.setBounds(0,0,150,30);
		  b22.addActionListener(this);   
		  c.add(b22);
		  
		  b6 = new JButton("EDIT BOX");
		  b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b6.setForeground(Color.white);
		  b6.setForeground(Color.BLUE);
		  b6.setBounds(700,0,200,30);
		  b6.addActionListener(this);   
		  c.add(b6);
		  
		  b1 = new JButton("UPDATE");
		  b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b1.setForeground(Color.white);
		  b1.setForeground(Color.BLUE);
		  b1.setBounds(800,50,100,30);
		  b1.addActionListener(this);   
		  c.add(b1);
		  
		  b2 = new JButton("UPDATE");
		  b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b2.setForeground(Color.white);
		  b2.setForeground(Color.BLUE);
		  b2.setBounds(800,100,100,30);
		  b2.addActionListener(this);   
		  c.add(b2);
		  
		  b3 = new JButton("UPDATE");
		  b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b3.setForeground(Color.white);
		  b3.setForeground(Color.BLUE);
		  b3.setBounds(800,150,100,30);
		  b3.addActionListener(this);   
		  c.add(b3);
		  
		  b4 = new JButton("UPDATE");
		  b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b4.setForeground(Color.white);
		  b4.setForeground(Color.BLUE);
		  b4.setBounds(800,200,100,30);
		  b4.addActionListener(this);   
		  c.add(b4);
		  
		  b5 = new JButton("UPDATE");
		  b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		  b5.setForeground(Color.white);
		  b5.setForeground(Color.BLUE);
		  b5.setBounds(800,250,100,30);
		  b5.addActionListener(this);   
		  c.add(b5);
		  
		  //IMAGE
		  img=new ImageIcon(getClass().getResource("show.jpg"));//it was t3
		  t20=new JLabel(img);
		  t20.setBounds(0,0,900,600);
		  c.add(t20);
		  
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b22)
		{
			try
			{
			  file=new File("userList.txt");
			  file.createNewFile();
			
			  fwrite=new FileWriter(file,true);
			
			  fwrite.write(t2.getText()+"\t");
			  fwrite.write(t4.getText()+"\t");
			  fwrite.write(t12.getText()+"\n");
			
			  fwrite.flush();
			  fwrite.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
			
			Form3 f = new Form3();
			this.setVisible(false);
			f.setVisible(true);
		}
		else if(ae.getSource()==b1)
		{
			t2.setText(w.getText());
		}
		else if(ae.getSource()==b2)
		{
			t4.setText(w.getText());
		}
		else if(ae.getSource()==b3)
		{
			t6.setText(w.getText());
		}
		else if(ae.getSource()==b4)
		{
			t8.setText(w.getText());
		}
		else if(ae.getSource()==b5)
		{
			t10.setText(w.getText());
		}
		else if(ae.getSource()==b6)
		{
			w.setText("");
		}
	}
	
}