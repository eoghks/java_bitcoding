package example544;
import javax.swing.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JList example");
		f.setSize(300,200);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel(new GridLayout(1,1));
		JList jl=new JList(new DefaultListModel());
		DefaultListModel m= (DefaultListModel)jl.getModel();
		m.addElement("에어콘");
		m.addElement("냉장고");
		m.addElement("TV");
		m.add(0,"세탁기");
		jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jl.setSelectedIndex(2);
		p.add(jl);
		f.setContentPane(p);
		f.setVisible(true);
		
	}

}
