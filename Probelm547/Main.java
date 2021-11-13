package Probelm547;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f= new MyFrame();
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