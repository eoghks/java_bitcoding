package example538;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JRadioButton Example");
		f.setSize(300,200);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2= new JPanel();
		JPanel p3= new JPanel();
		
		p.setLayout(new GridLayout(3,1));
		
		JLabel lb=new JLabel("당신의 성별은?");
		//lb.setHorizontalAlignment(SwingConstants.LEFT);
		p1.add(lb);
		p1.setOpaque(true);
		p1.setBackground(Color.CYAN);
		
		JRadioButton rb1=new JRadioButton();
		rb1.setText("남섬");
		JRadioButton rb2=new JRadioButton("여성");
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		p2.add(rb1); p2.add(rb2);
		
		JButton b=new JButton("확인");
		p3.add(b);
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		f.setContentPane(p);
		f.setVisible(true);
	}

}
