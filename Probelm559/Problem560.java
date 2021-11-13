package Probelm559;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Problem560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f= new MyFrame();
		MyPanel p= new MyPanel();
		f.setContentPane(p);
		f.setVisible(true);
	}

}

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(400,400);
		setLocation(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("P559");
	}
}

class MyPanel extends JPanel{
	JTextField tf;
	JList jl;
	DefaultListModel m;
	public MyPanel() {
		setLayout(null);
		jl= new JList(new DefaultListModel());
		m= (DefaultListModel)jl.getModel();
		jl.setBounds(20,20,340,250);
		add(jl);
		tf=new JTextField(10);
		tf.setBounds(20,300,200,30);
		add(tf);
		//******************************************************
		JButton bt1=new JButton("추가");
		bt1.setBounds(240,300,60,30);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a= tf.getText();
				m.addElement(a);
			}
		});
		JButton bt2=new JButton("제거");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.remove(jl.getSelectedIndex());
			}
		});
		bt2.setBounds(310,300,60,30);
		add(bt1);
		add(bt2);
	}
}