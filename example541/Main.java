package example541;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JOptionPane Example");
		f.setSize(350,200);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		JButton bt= new JButton("Button");
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(f,"Contents", "Dialog", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showInputDialog("제일 좋아하는 음식");
			}
		});
		p.add(bt);
		f.setContentPane(p);
		f.setVisible(true);
	}

}
