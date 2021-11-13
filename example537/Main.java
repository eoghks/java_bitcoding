package example537;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JCheckBox Example");
		f.setSize(400,150);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1= new JPanel();
		JPanel p2= new JPanel();
		JPanel p3= new JPanel();
		
		JLabel lb= new JLabel();
		lb.setText("핫도그에 무엇을 발라드릴까요?");
		lb.setOpaque(true);
		lb.setBackground(Color.CYAN);
		p1.add(lb);
		
		
		JCheckBox cb1=new JCheckBox("케첩");
		cb1.setSelected(true);
		JCheckBox cb2=new JCheckBox("머스타드");
		JCheckBox cb3=new JCheckBox("설탕");
		JCheckBox cb4=new JCheckBox("간장");
		
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		p2.add(cb4);
		//p3.setLayout(new BorderLayout());
		p3.add(p1, BorderLayout.NORTH);
		p3.add(p2, BorderLayout.SOUTH);
		
		f.setContentPane(p3);
		f.setVisible(true);
	}

}
