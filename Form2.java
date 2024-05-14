// SIGN UP 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener
{

	JLabel t,t1,t2,t3,t4,t5;
	Container c;
	JButton backbtn, registerbtn;
    JTextField namefld,emailfld,mobilefld,addressfld;
    JPasswordField passfld;
	Font f;
	ImageIcon img1,img2,img3,img4,img5;
	
	Form2()
	{
		super("Register Your Info");	
		//FUNDAMENTAL
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,600);
		//BG
		c=this.getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(null);
		

		//textfield
		namefld = new JTextField();
        namefld.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		namefld.setBounds(355,163,280,29);
	
		c.add(namefld);

        emailfld = new JTextField();
        emailfld.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
        emailfld.setBounds(355,217,280,29);
     
        c.add(emailfld);
        

        addressfld = new JTextField();
        addressfld.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		addressfld.setBounds(355,275,280,29);
	
        c.add(addressfld);
        
        mobilefld = new JTextField();
        mobilefld.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		mobilefld.setBounds(355,334,280,29);
	
        c.add(mobilefld);
        
        passfld = new JPasswordField();
        passfld.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		passfld.setBounds(355,389,280,29);
		passfld.setEchoChar('*');

        c.add(passfld);
        
		//TEXTS
		f=new Font("Arial",Font.BOLD,18);
		t1=new JLabel();
		t1.setText("ENTER YOUR NAME : ");
		t1.setBounds(20,163,320,30);
		t1.setFont(f);
		t1.setForeground(Color.white);
		c.add(t1);
		
		t2=new JLabel();
		t2.setText("ENTER YOUR EMAIL : ");
		t2.setBounds(20,217,320,30);
		t2.setFont(f);
		t2.setForeground(Color.white);
		c.add(t2);
		
		t3=new JLabel();
		t3.setText("ENTER YOUR ADRESS : ");
		t3.setBounds(20,275,320,30);
		t3.setFont(f);
		t3.setForeground(Color.white);
		c.add(t3);
		
		t4=new JLabel();
		t4.setText("ENTER YOUR CELL NUMBER : ");
		t4.setBounds(20,334,320,30);
		t4.setFont(f);
		t4.setForeground(Color.white);
		c.add(t4);
		
		t5=new JLabel();
		t5.setText("ENTER YOUR PASSWORD : ");
		t5.setBounds(20,389,320,30);
		t5.setFont(f);
		t5.setForeground(Color.white);
		c.add(t5);
		
		
        
		//button
		img3 = new ImageIcon("backbtn.png");
		backbtn = new JButton(img3);
		backbtn.setBounds(200,455,102,32);
		backbtn.addActionListener(this);
		c.add(backbtn);
		
		img4 = new ImageIcon("registerbtn.png");
		registerbtn = new JButton(img4);
		registerbtn.setBounds(560,455,102,32);
        registerbtn.addActionListener(this);
		c.add(registerbtn);
		
		//IMAGE
		img2=new ImageIcon(getClass().getResource("signuppage.jpg"));
		t=new JLabel(img2);
		t.setBounds(0,0,900,600);
		c.add(t);
		
		
		this.add(c);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s1=emailfld.getText();
		String s2=passfld.getText();
		
		if(ae.getSource()==registerbtn)
		{
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill Up All First");
			}
			else{
				
				Account acc=new Account(s1,s2);
				acc.addAccount();
				
			JOptionPane.showMessageDialog(this,"Registration Successful");
			Form1 f=new Form1();
			f.setVisible(true);
			this.setVisible(false);
			}
		}
		else if(ae.getSource()==backbtn)
		{
			Form1 f=new Form1();
			f.setVisible(true);
			this.setVisible(false);
		}
	}
	

	
}
