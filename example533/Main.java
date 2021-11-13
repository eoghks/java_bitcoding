package example533;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JLabel Example");
		f.setSize(1280,720);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(2,5));
		for(int i=1; i<=10; i++) {
			JLabel l =new JLabel(i+"번째 라벨");
			l.setOpaque(true);
			l.setBackground(new Color(100+15*i,100+15*i,100+15*i));
			l.setHorizontalAlignment(SwingConstants.CENTER);
			p.add(l);
		}
		f.setContentPane(p);
		f.setVisible(true);
	}

}
