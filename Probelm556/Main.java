package Probelm556;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
		MyPanel p= new MyPanel();
		f.setContentPane(p);
		f.setVisible(true);
	}

}
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("P556");
		setSize(400,250);
		setLocation(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MyPanel extends JPanel{
	public MyPanel(){
		setLayout(null);
		//************************************
		JPanel p1= new JPanel();
		JLabel lb1= new JLabel("뉴스레터를 받으시겠습니까?");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel p2= new JPanel();
		JRadioButton rb1= new JRadioButton("동의");
		JRadioButton rb2= new JRadioButton("동의 안함");
		ButtonGroup bg1= new ButtonGroup();
		bg1.add(rb1); bg1.add(rb2);
		p2.add(rb1); p2.add(rb2);
		p1.add(lb1); p1.add(p2);
		p1.setBounds(20, 30, 360, 30);
		add(p1);
		//************************************
		JPanel p3= new JPanel();
		JTextField tf1=new JTextField(10);
		JLabel lb2= new JLabel("@");
		JTextField tf2= new JTextField(7);
		JComboBox cb= new JComboBox(new String[] {"naver.com","nate.com","hanmail.net", "gmail.com","직접입력"});
		p3.add(tf1); p3.add(lb2); p3.add(tf2); p3.add(cb);
		p3.setBounds(20,100,360,30);
		add(p3);
		//************************************
		JButton bt=new JButton("확인");
		bt.setBounds(150, 150,100,25);
		add(bt);
		
	}
}