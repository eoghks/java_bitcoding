package example530;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("JPanel ");
		f.setSize(400,300);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p =new JPanel();
		p.setOpaque(true);
		p.setBackground(Color.BLACK);
		f.setContentPane(p);
		f.setVisible(true);
	}

}
