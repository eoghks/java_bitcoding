package Probelm554;
import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("P554");
		f.setSize(400,500);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p=new MyPanel();
		f.setContentPane(p);
		f.setVisible(true);
	}

}

class MyPanel extends JPanel{
	public MyPanel() {
		setLayout(new GridLayout(9,1));
		
		JLabel lb1=new JLabel("설문조사");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lb1);
		//************************************************
		JLabel lb2 = new JLabel("성별");
		add(lb2);
		//************************************************
		JPanel p1= new JPanel(new GridLayout(1,2));
		JRadioButton rb1= new JRadioButton("남성");
		JRadioButton rb2= new JRadioButton("여성");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1); bg.add(rb2);
		p1.add(rb1); p1.add(rb2);
		add(p1);
		//************************************************
		JLabel lb3= new JLabel("제일 좋아하는 프로그래밍 언어");
		add(lb3);
		//************************************************
		JPanel p2= new JPanel(new GridLayout(1,5));
		JRadioButton rb3= new JRadioButton("자바");
		JRadioButton rb4= new JRadioButton("파이썬");
		JRadioButton rb5= new JRadioButton("C++");
		JRadioButton rb6= new JRadioButton("기타");
		JTextField tf= new JTextField(7);
		ButtonGroup bg2= new ButtonGroup();
		bg2.add(rb3); bg2.add(rb4); bg2.add(rb5); bg2.add(rb6);
		p2.add(rb3); p2.add(rb4); p2.add(rb5); p2.add(rb6); p2.add(tf);
		add(p2);
		//************************************************
		JLabel lb4= new JLabel("좋아하는 동물");
		add(lb4);
		//************************************************
		JPanel p3 =new JPanel(new GridLayout(1,4));
		JRadioButton rb7 = new JRadioButton("개");
		JRadioButton rb8 = new JRadioButton("고양이");
		JRadioButton rb9 = new JRadioButton("말");
		JRadioButton rb10 = new JRadioButton("낙타");
		ButtonGroup bg3= new ButtonGroup();
		bg3.add(rb7); bg3.add(rb8); bg3.add(rb9); bg3.add(rb10);
		p3.add(rb7); p3.add(rb8); p3.add(rb9); p3.add(rb10);
		add(p3);
		//************************************************
		JLabel lb5= new JLabel("설문에 참여주셔서 감사합니다.");
		lb5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lb5);
		//************************************************
		JButton b= new JButton("제출");
		add(b);
	}
}