import java.util.*;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

class Main
{
JPanel jp;	
JLabel jl;
JButton jb1,jb2;
JFrame jf;
Main()
{
//Add Frame 
jf=new JFrame("21 Matchstick");
jp=new JPanel();
jl=new JLabel("21 Matchstick");
jb1=new JButton("1 Player");
jb2=new JButton("2 Player");

jp.setLayout(null);
//set Bounds
jl.setBounds(200,80,500,30);
jb1.setBounds(150,150,200,30);
jb2.setBounds(150,200,200,30);

jp.add(jl);
jp.add(jb1);
jp.add(jb2);
jf.add(jp);  
        jf.setSize(500, 500);  
        jf.setLocationRelativeTo(null);  
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        jf.setVisible(true); 
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==jb1)
{

}
else
	if(e.getSource()==jb2)
	{

	}
	else
	{

	}
}
}
class jfram
{
public static void main(String args[])
{
new Main();
}
}
