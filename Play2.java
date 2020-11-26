import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class play11 extends JFrame
{
	play11()
	{
//		super("Player 1");
		//Declaration
		JFrame jf;
		JLabel l1,l2,l3,l4,l5,l6;
		JButton b1,b2,b3,b4,b5,b6;
		JTextField t1,t2,t3,t4,t5;
		//Initilization
			//player Frame
		jf=new JFrame("PlayerS");
		jf.setLayout(null);
		l1=new JLabel("Player 1 :") ;
		l6=new JLabel("Player 2 :") ;
		l2=new JLabel("Enter Number In between 1 to 4 : ");
		t1=new JTextField();
		l5=new JLabel("Enter Number In between 1 to 4 : ");
		t5=new JTextField();
		b1=new JButton("OKK");
		b2=new JButton("Clear");
		b5=new JButton("OKK");
		b6=new JButton("Clear");


		l3=new JLabel("player 1 Entered Number : ");
		t2=new JTextField();

		//Computer Frame
		l4=new JLabel("player 2 Entered Number : ");
		t3=new JTextField();
		b3=new JButton("Back");
		b4=new JButton("Exit");
		//Set Bounds
		
		l1.setBounds(0,0,100,100);
		l6.setBounds(240,0,300,100);

		l2.setBounds(20,20,500,100);
		l5.setBounds(260,20,500,100);

		t1.setBounds(20,90,200,25);
		t5.setBounds(260,90,200,25);

		b1.setBounds(20,120,70,30);
		b2.setBounds(95,120,70,30);
		b5.setBounds(260,120,70,30);
		b6.setBounds(335,120,70,30);
		
		l3.setBounds(20,160,500,100);
		t2.setBounds(20,220,200,25);

		l4.setBounds(240,160,300,100);
		t3.setBounds(240,220,200,25);
		
		b3.setBounds(150,250,70,30);
		b4.setBounds(230,250,70,30);

		//add in frame
		jf.add(l1);
		jf.add(l2);
		jf.add(l5);
		jf.add(l6);
		
		jf.add(t1);
		jf.add(t5);

		jf.add(b1);
		jf.add(b2);
		jf.add(b5);
		jf.add(b6);
		
		jf.add(l3);
		jf.add(t2);

		jf.add(l4);
		jf.add(t3);
		

		jf.add(b3);
		jf.add(b4);
		//
		jf.setSize(600,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void actionPerformed(ActionEvent e)
{

}
}
class play2
{
	public static void main(String args[])
	{
				new play11();
	}
}