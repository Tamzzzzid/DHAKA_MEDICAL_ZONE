// GET STARTED PAGE

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel label;
	JButton button;
	ImageIcon img1, img2, img3,i;
	
	
	form()
	{
		super("HOSPITAL MANAGEMENT SYSTEM");	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,600);
		
		
		img1 = new ImageIcon("logo1.png");
        this.setIconImage(img1.getImage());

        

		panel = new JPanel();
		panel.setLayout(null);
		
		img2= new ImageIcon("background1.jpg");
		
		label = new JLabel(img2);
		label.setBounds(0,0,900,600);
		panel.add(label);

        img3 = new ImageIcon("getStart.png");
		button = new JButton(img3);
		button.setBounds(100,430,226,67); 
        button.addActionListener(this);
		label.add(button);
		

		
		this.add(panel);
		
	}


	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==button)
			{
			    Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}

		}


}
