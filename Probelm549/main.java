package Probelm549;
import java.awt.Color;

import javax.swing.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f= new MyFrame();
		f.setContentPane(new MyPanel());
	}

}

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Java is fun");
		setSize(600,500);
		setLocation(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MyPanel extends JPanel{
	public MyPanel() {
		setOpaque(true);
		setBackground(Color.red);
	}
}