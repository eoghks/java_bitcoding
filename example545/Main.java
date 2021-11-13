package example545;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("CardLayout example");
		f.setSize(500,400);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		CardLayout card= new CardLayout();
		p.setLayout(card);
		JPanel p1= new JPanel();
		JButton b1= new JButton("누르면 패널 전환");
		p1.add(b1);
		JPanel p2=new JPanel();
		p2.setOpaque(true);
		p2.setBackground(Color.cyan);
		JLabel lb= new JLabel("두번째 패널");
		p2.add(lb);
		p.add("First Panel", p1);
		p.add("Second Panel", p2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(p, "Second Panel");
			}
		});
		f.setContentPane(p);
		f.setVisible(true);
	}

}
