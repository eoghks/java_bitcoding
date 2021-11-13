package Probelm552;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Calendar;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f= new MyFrame();
		MyPanel p=new MyPanel(f);
		JPanel p1= new JPanel();
		f.setContentPane(p);
		f.setVisible(true);
	}

}

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("P551");
		setLocation(500,200);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class MyPanel extends JPanel{
	public MyPanel(JFrame f) {
		setLayout(new BorderLayout());
		String str="현재 시각은"+Calendar.getInstance().getTime()+"입니다";
		JLabel lb=new JLabel(str);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		add(lb,BorderLayout.CENTER);
		JPanel p2= new JPanel();
		p2.setLayout(new GridLayout(1,2));
		JButton b1=new JButton("확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
			}
		});
		p2.add(b1);
		JButton b2= new JButton("새로고침");
		p2.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str="현재 시각은"+Calendar.getInstance().getTime()+"입니다";
				lb.setText(str);
			}
		});
		add(p2, BorderLayout.SOUTH);
	}
}