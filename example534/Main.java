package example534;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JButton Example");
		f.setSize(1280,720);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p= new JPanel();
		
		JButton bt1=new JButton("First Button");
		bt1.setEnabled(false);
		
		JButton bt2= new JButton();
		bt2.setText("Second Button");
		JButton bt3= new JButton("Third Button");
		bt3.setBackground(Color.CYAN);
		bt3.setOpaque(true);
		bt3.setToolTipText("3번째 버튼");
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		f.setContentPane(p);
		f.setVisible(true);
	}

}
