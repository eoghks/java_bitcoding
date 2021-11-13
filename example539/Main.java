package example539;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("JTextField example");
		f.setSize(200,200);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel(new GridLayout(3,1));
		JPanel p1= new JPanel();
		JPanel p2= new JPanel();
		JPanel p3= new JPanel();
		
		JLabel lb=new JLabel("아무 텍스타나 입력하세요...");
		lb.setForeground(Color.BLUE);
		p1.add(lb);
		
		JTextField tf=new JTextField(10);
		p2.add(tf);
		
		JButton jb= new JButton("확인");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb.setText(tf.getText());
			}
		});
		p3.add(jb);
		
		p.add(p1); p.add(p2); p.add(p3);
		f.setContentPane(p);
		f.setVisible(true);
	}

}
