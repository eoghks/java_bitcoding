package example543;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame();
		f.setSize(500,400);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		
		JButton b=new JButton("Button");
		b.setBounds(100,50,300,100);
		JLabel lb=new JLabel("Label");
		lb.setOpaque(true);
		lb.setBackground(Color.cyan);
		lb.setBounds(300,250,150,50);
		
		p1.add(b);p1.add(lb);
		f.setContentPane(p1);
		f.setVisible(true);
	}

}
