// LOG IN 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame implements ActionListener
{
	JLabel t,t1,t2;
	JTextField emailfld;
	JPasswordField passfld;
	JButton backbtn, loginbtn, signupbtn;
    Container c;
	Font f;
	ImageIcon img1,img3,img4, img5;
	
	Form1()
	{
		super("LOGIN");	
		//FUNDAMENTAL
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		this.setSize(900,600);
		//BG
		c=this.getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(null);
		
	    //textfield
		emailfld = new JTextField();
        emailfld.setBounds(375,218,231,40);
        c.add(emailfld);

        passfld = new JPasswordField();
        passfld.setBounds(375,291,231,40);
        passfld.setEchoChar('*');
        c.add(passfld);
		
		//TEXTS
		f=new Font("Arial",Font.BOLD,18);
		t1=new JLabel();
		t1.setText("ENTER YOUR EMAIL : ");
		t1.setBounds(50,218,320,30);
		t1.setFont(f);
		t1.setForeground(Color.white);
		c.add(t1);
		
		t2=new JLabel();
		t2.setText("ENTER YOUR PASSWORD : ");
		t2.setBounds(50,291,320,30);
		t2.setFont(f);
		t2.setForeground(Color.white);
		c.add(t2);
		
		
		//button
		img3 = new ImageIcon("loginbtn.png");
		loginbtn = new JButton(img3);
		loginbtn.setBounds(320,430,102,32);
		loginbtn.addActionListener(this);
		c.add(loginbtn);

        img4 = new ImageIcon("backbtn.png");
		backbtn = new JButton(img4);
		backbtn.setBounds(150,430,102,32);
		backbtn.addActionListener(this);
		c.add(backbtn);

		img4 = new ImageIcon("signupbtn.png");
		signupbtn = new JButton(img4);
		signupbtn.setBounds(500,430,102,32);
		signupbtn.addActionListener(this);
		c.add(signupbtn);
		
		//IMAGE
		img1=new ImageIcon(getClass().getResource("loginPage.jpg"));
		t=new JLabel(img1);
		t.setBounds(0,0,900,600);
		c.add(t);
		
		this.add(c);
	}	

	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		String email=emailfld.getText();
		String pass=passfld.getText();
		
		Account acc=new Account();
		
		if(ae.getSource()==signupbtn)
		{
		
			Form2 f=new Form2();
			f.setVisible(true);
			this.setVisible(false);
		}

		else if(ae.getSource()==backbtn)
		{
			form f= new form();
			f.setVisible(true);
			this.setVisible(false);
		}

		
		else if(loginbtn.getText().equals(command))
		{
			if(email.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill Up All First");
			}
			
			else if(acc.checkAccount(email,pass)==true)
			{
				
			JOptionPane.showMessageDialog(this,"Login Successful");
			
			Form3 f=new Form3();
			f.setVisible(true);
			this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Incorrect Email or Password");
			}
		}
		


}

}

	