package example540;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JTextField example");
		f.setSize(300,160);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel(new GridLayout(3,1));
		JPanel p1= new JPanel();
		JPanel p2=new JPanel(new GridLayout(1,2));
		JPanel p3= new JPanel ();
		
		JLabel title =new JLabel("포테이토 피자 주문");
		JLabel size= new JLabel("사이즈 : ");
		size.setHorizontalAlignment(SwingConstants.CENTER);
		JComboBox cb = new JComboBox(new String[] {"사이즈","M","L","XL"});
		JButton bt=new JButton("확인");
		
		p1.add(title);
		p2.add(size); p2.add(cb);
		p3.add(bt);
		p.add(p1);p.add(p2);p.add(p3);
		f.setContentPane(p);
		f.setVisible(true);
	}

}
