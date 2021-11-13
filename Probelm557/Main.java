package Probelm557;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
		MyPanel p= new MyPanel(f);
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
	JTextField tf1;
	JTextField tf2;
	JComboBox cb;
	public MyPanel(JFrame f){
		setLayout(null);
		//************************************
		JPanel p1= new JPanel();
		JLabel lb1= new JLabel("뉴스레터를 받으시겠습니까?");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel p2= new JPanel();
		JRadioButton rb1= new JRadioButton("동의");
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected()) {
					tf1.setEnabled(true);
					cb.setEnabled(true);
					tf2.setEnabled(false);
				}
			}
		});
		JRadioButton rb2= new JRadioButton("동의 안함");
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb2.isSelected()) {
					tf1.setEnabled(false);
					tf2.setEnabled(false);
					cb.setEnabled(false);
				}
			}
		});
		ButtonGroup bg1= new ButtonGroup();
		bg1.add(rb1); bg1.add(rb2);
		rb1.setSelected(true);
		p2.add(rb1); p2.add(rb2);
		p1.add(lb1); p1.add(p2);
		p1.setBounds(20, 30, 360, 30);
		add(p1);
		//************************************
		JPanel p3= new JPanel();
		tf1=new JTextField(10);
		JLabel lb2= new JLabel("@");
		tf2= new JTextField(7);
		cb= new JComboBox(new String[] {"naver.com","nate.com","hanmail.net", "gmail.com","직접입력"});
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb.getSelectedItem()=="직접입력") {
					tf2.setEnabled(true);
				}
				else {
					tf2.setEnabled(false);
					tf2.setText("");
				}
			}
		});
		cb.setSelectedItem("naver.com");
		
		p3.add(tf1); p3.add(lb2); p3.add(tf2); p3.add(cb);
		p3.setBounds(20,100,360,30);
		add(p3);
		//************************************
		JButton bt=new JButton("확인");
		bt.setBounds(150, 150,100,25);
		add(bt);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showOptionDialog(
				f,
				"확인 하시겠습니까",
				"뉴스레터 수신",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,null,null);
			}
		});
		
	}
}