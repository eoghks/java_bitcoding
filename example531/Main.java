package example531;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JLabel example");
		f.setSize(1200,720);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p= new JPanel();
		JLabel label1=new JLabel("First");
		JLabel label2=new JLabel("Second");
		JLabel label3=new JLabel("Third");
		label2.setOpaque(true);
		label2.setBackground(Color.CYAN);
		Font font=new Font("휴먼매직체", Font.BOLD,20);
		label3.setFont(font);
		p.add(label1);
		p.add(label2);
		p.add(label3);
		f.setContentPane(p);
		f.setVisible(true);
	}

}
