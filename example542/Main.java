package example542;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JOptionPane Example");
		f.setSize(250, 200);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p= new JPanel();
		JButton b=new JButton("Button");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = JOptionPane.showOptionDialog(f,"버튼을 누르세요", "Dialog 2", JOptionPane.YES_NO_CANCEL_OPTION
						,JOptionPane.PLAIN_MESSAGE,null,new String[] {"예","아니오","취소"},"예");
				if(k==0)
					b.setText("예 눌림");
				else if(k==1)
					b.setText("아니오 눌림");
			}
		});
		p.add(b);
		f.setContentPane(p);
		f.setVisible(true);
		
	}

}
