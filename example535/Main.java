package example535;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("BorderLayout");
		f.setSize(1280, 720);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p= new JPanel();
		p.setLayout(new BorderLayout());
		
		JButton bt1=new JButton();
		bt1.setText("첫번째 버튼");
		JButton bt2=new JButton("두번째 버튼");
		JButton bt3=new JButton("세번째 버튼");
		bt3.setToolTipText("세번째 버튼 입니다~");
		JButton bt4=new JButton("네번째 버튼");
		bt4.setEnabled(false);
		JButton bt5=new JButton("다섯번째 버튼");
		JButton bt6=new JButton("6번째");
		p.add(bt1, BorderLayout.EAST);
		p.add(bt2, BorderLayout.WEST);
		p.add(bt3, "South");
		p.add(bt4, "North");
		p.add(bt5,"Center");
		//p.add(bt6, BorderLayout.BEFORE_LINE_BEGINS);
		f.setContentPane(p);
		f.setVisible(true);
	}

}
