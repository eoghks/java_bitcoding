package example544;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("JList example");
		f.setSize(300,200);
		f.setLocation(500,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel();
		JScrollPane sp=new JScrollPane();
		
		
		JList jl=new JList(new DefaultListModel());
		DefaultListModel m= (DefaultListModel)jl.getModel();
		m.addElement("에어콘");
		m.addElement("냉장고");
		m.addElement("TV");
		m.add(0,"세탁기");
		jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jl.setSelectedIndex(2);
		
		sp.add(jl);
		p.add(sp);
		
		f.setContentPane(p);
		f.setVisible(true);
	}

}
