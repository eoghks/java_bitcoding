package example536;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("ActionListener Example");
		f.setSize(1280, 720);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p= new JPanel();
		p.setOpaque(true);
		p.setBackground(Color.CYAN);
		JLabel l=new JLabel("김 성 훈 이~\n");
		JButton b=new JButton("Button");
		ActionListener r=actionColor(p);
		b.addActionListener(r);
		p.add(l);
		p.add(b);
		f.setContentPane(p);
		f.setVisible(true);
	}


public static ActionListener actionColor(JPanel p){
	ActionListener r=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		if(p.getBackground()==Color.CYAN)
			p.setBackground(Color.WHITE);
		else
			p.setBackground(Color.CYAN);
		}};
	return r;
	}
}