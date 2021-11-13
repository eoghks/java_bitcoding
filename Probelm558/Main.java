package Probelm558;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
		JPanel p= new JPanel();
		CardLayout cl=new CardLayout();
		p.setLayout(cl);
		MotoPanel mp= new MotoPanel(p,cl);
		p.add("Motto", mp);
		p.add("Edit",new EditonPanel(p,mp,cl));
		f.setContentPane(p);
		f.setVisible(true);
	}

}
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("P556");
		setSize(500,250);
		setLocation(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MotoPanel extends JPanel{
	JLabel lb;
	public MotoPanel(JPanel p, CardLayout card) {
		setLayout(null);
		setOpaque(true);
		setBackground(Color.white);
		lb=new JLabel("오늘 걷지 않으면 내일 뛰어야 한다.");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setBounds(0,50, 500,40);
		lb.setFont(new Font("궁서", Font.PLAIN, 25));
		add(lb);
		
		JButton b= new JButton("편집");
		b.setBounds(400,180,60,30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.next(p);
			}
		});
		add(b);
	}
}

class EditonPanel extends JPanel{
	JTextField tf;
	public EditonPanel(JPanel p, MotoPanel mp, CardLayout card) {
		setLayout(null);
		tf= new JTextField(40);
		tf.setBounds(50,50,400,30);
		add(tf);
		
		JButton b= new JButton("확인");
		b.setBounds(400,180,60,30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.lb.setText(tf.getText());
				card.next(p);
			}
		});
		add(b);
	}
}