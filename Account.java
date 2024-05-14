import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
//import Frames.*;


public class Account
{
	private String email;
	private String password;

	File file;
	FileWriter fwrite;

	Scanner input;

	public Account()
	{
		this.email="";
	}
	
	public Account(String email,String password)
	{
		this.email=email;
		this.password=password;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void addAccount()
	{
		
		
		try
		{
			file=new File("userData.txt");
			file.createNewFile();
			
			fwrite=new FileWriter(file,true);
			
			fwrite.write(getEmail()+"\t");
			fwrite.write(getPassword()+"\n");
			
			fwrite.flush();
			fwrite.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean checkAccount(String email,String password)
	{
		boolean flag=false;
		file=new File("userData.txt");
		try
		{
			
			input=new Scanner(file);
			
			while(input.hasNextLine())
			{
				String line=input.nextLine();
				String[] value=line.split("\t");
				if(value[0].equals(email)&&value[1].equals(password))
				{
					flag=true;
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
	}
	

}