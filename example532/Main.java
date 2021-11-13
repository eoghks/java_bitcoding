package example532;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j= new JFrame("JLabel Example");
		j.setSize(350,200);
		j.setLocation(500,200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout());
		for(int i=1; i<=11; i++) {
			JLabel lb = new JLabel(i+"번째 레이블");
			lb.setOpaque(true);
			lb.setBackground(new Color(100+10*i, 100+10*i, 100+10*i));
			p.add(lb);
		}
		j.setContentPane(p);
		j.setVisible(true);
	}

}
