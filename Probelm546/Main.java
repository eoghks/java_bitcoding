package Probelm546;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Java is fun");
		f.setLocation(500,200);
		f.setSize(600,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p= new JPanel();
		p.setOpaque(true);
		p.setBackground(Color.red);
		f.setContentPane(p);
	}

}
