import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class question extends JFrame{
	private JFrame qf = new JFrame("問題!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private GridBagLayout gb = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private JButton q1 = new JButton("鯛魚燒");
	private JButton q2 = new JButton("銅鑼燒 ");
	private JButton q3 = new JButton("豬血糕");
	private JButton q4 = new JButton("老鼠");
	
	public void init() {
		qf.setBounds(30, 30, 500, 300);
		qf.setLayout(new BorderLayout(0, 20));
//		botp.setLayout(gb);
		botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
		
		JTextArea text = new JTextArea("問題: 哆啦A夢最喜愛的食物是？ ");
		topp.add(text);
		
//		gbc.fill = GridBagConstraints.HORIZONTAL;
//		gb.setConstraints(q1, gbc);
		botp.add(q1);
		
//		gbc.gridwidth = 5;
////		gbc.gridwidth = GridBagConstraints.REMAINDER;
		botp.add(q2);
//		gbc.gridwidth = GridBagConstraints.REMAINDER;
		botp.add(q3);
//		gbc.gridwidth = GridBagConstraints.REMAINDER;
		botp.add(q4);
//		gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		qf.add(topp, BorderLayout.NORTH);
		qf.add(botp);
		qf.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new question().init();
		
	}

}
