package Probelm553;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f=new MyFrame();
		MyPanel p= new MyPanel(f);
		f.setContentPane(p);
		f.setVisible(true);
	}

}

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("P553");
		setLocation(500,200);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MyPanel extends JPanel{
	ArrayList<JCheckBox> cblist;
	public MyPanel(JFrame f) {
		cblist = new ArrayList<JCheckBox>();
		setLayout(new BorderLayout());
		JPanel p1= new JPanel(new GridLayout(10,1));
		for(int i=0; i<10; i++) {
			JCheckBox cb= new JCheckBox("CheckBox"+i);
			p1.add(cb);
			cblist.add(cb);
		}
		add(p1, BorderLayout.CENTER);
		
		JButton b= new JButton("확인");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				for(JCheckBox cb : cblist) {
					if(cb.isSelected())
						i++;
				}
				f.setTitle(i+"개가 선택되었습니다.");
			}
		});
		add(b, BorderLayout.SOUTH);
	}
}