package Probelm550;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f= new MyFrame();
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,3));
		for(int i=0; i<6; i++) {
			if(i%2==0) {
				p.add(new blackPanel());
			}
			else
				p.add(new whitePanel());
		}
		f.setContentPane(p);
	}

}

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("P550");
		setSize(300,200);
		setLocation(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class blackPanel extends JPanel{
	public blackPanel() {
		setOpaque(true);
		setBackground(Color.black);
	}
}

class whitePanel extends JPanel{
	public whitePanel() {
		setOpaque(true);
		setBackground(Color.white);
	}
}