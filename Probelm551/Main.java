package Probelm551;
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f= new MyFrame();
		MyPanel p=new MyPanel();
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
	public MyPanel() {
		setLayout(new BorderLayout());
		String str="현재 시각은"+Calendar.getInstance().getTime()+"입니다";
		JLabel lb=new JLabel(str);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		add(lb,BorderLayout.CENTER);
		JButton b=new JButton("확인");
		add(b,BorderLayout.SOUTH);
	}
}