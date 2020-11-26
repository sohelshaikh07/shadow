import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random.*;
class play11 extends JFrame implements ActionListener,WindowListener
{
		public static int c=0,ccount=0,ucount=0;
		int cn=0,max=5,min=1,Usum=0,Csum=0,totSum=0;
		String s1=" ",s2=" ",s3=" ";
		JFrame jf;
		JLabel l1,l2,l3,l4;
		JButton b1,b2,b3,b4;
		JTextField t1,t2,t3,t4;
	play11()
	{
//		super("Player 1");
		//Declaration	
		//Initilization
			//player Frame
		jf=new JFrame("Player 1");
		jf.setLayout(null);
		l1=new JLabel("Player 1 :") ;
		l2=new JLabel("Enter Number In between 1 to 4 : ");
		t1=new JTextField();
		b1=new JButton("OKK");
		b2=new JButton("Clear");
		l3=new JLabel("You Enter Number : ");
		t2=new JTextField();
   //computer Frame
		l4=new JLabel("Computer Enter Number : ");
		t3=new JTextField();
		t4=new JTextField();
		b3=new JButton("Back");
		b4=new JButton("Exit");
		//Set Bounds
		
		l1.setBounds(0,0,100,100);
		l2.setBounds(20,20,500,100);
		t1.setBounds(20,90,200,25);
		b1.setBounds(20,120,70,30);
		b2.setBounds(95,120,70,30);
		l3.setBounds(20,160,500,100);
		t2.setBounds(20,220,200,25);

		l4.setBounds(240,160,300,100);
		t3.setBounds(240,220,200,25);
		
		b3.setBounds(150,250,70,30);
		b4.setBounds(230,250,70,30);

		//add in frame
		jf.add(l1);
		jf.add(l2);
		jf.add(t1);
		jf.add(b1);
		jf.add(b2);
		jf.add(l3);
		jf.add(t2);

		jf.add(l4);
		jf.add(t3);
		jf.add(t4);

		jf.add(b3);
		jf.add(b4);
		//
		b1.addActionListener(this);


		jf.setSize(600,600);
		jf.setVisible(true);
		jf.setLocation(700,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		c++;
		String s=(t1.getText());
		int n=Integer.parseInt(s);
		cn=(int)(Math.random()*(max-min)+min);
		s3=s3.concat(Integer.toString(cn));
		s1=s1.concat(s);
		s1=s1.concat(",");
		s3=s3.concat(",");
		if(c<7)
		  {
			t2.setText(""+s1);
			if(cn<5)
			{
			
				ccount++;
				Csum+=cn;
			}
			if(n>=1 && n<=4)
			{
				ucount++;
				Usum+=n;	
			JOptionPane.showMessageDialog(null," Enter Next Number ");
			t1.setText("");
			}
		   totSum=Usum+Csum;
		   }
	}
	else
	{
		JOptionPane.showMessageDialog(null," Enter Valid Number !!!");
	}		
			if(totSum>20)
			{
				if(Usum>Csum || ucount>ccount)
				{
					s2="User";
				}
				else
				{
					cn=(int)(Math.random()*(max-min)+min);
					s3=s3.concat(Integer.toString(cn));
					t3.setText(""+s3);	
					s2="Computer";	
				}
				JOptionPane.showMessageDialog(null,s2+" Lost The Game..!!");
			}
			else
			{
					t3.setText(""+s3);
			}
  	if(e.getSource()==b2)
  	{
  					t1.setText("");
  	}
  	else
  		if(e.getSource()==b3)
  		{

  		}
  		else
  			if(e.getSource()==b4)
  			{
  				dispose();
   			}
  }

}	
class play1
{
	public static void main(String args[])
	{
				new play11();
	}
}