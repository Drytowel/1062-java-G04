import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Question extends JFrame implements ActionListener {
	private JFrame qf = new JFrame("問題!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private JButton q1; //預設為答案
	private JButton q2;
	private JButton q3;
	private JButton q4;
	
	public void init(int choice) {
		
		if(choice==1) {
			qf.setBounds(30, 30, 500, 300);
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("問題: 哆啦A夢最喜愛的食物是？ ");
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("銅鑼燒 ");
			q2 = new JButton("鯛魚燒 ");
			q3 = new JButton("豬血糕");
			q4 = new JButton("老鼠");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q1);
			botp.add(q3);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
		}else if(choice==2) {
qf.setBounds(30, 30, 500, 300);
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("問題:「鱟」在生物學上的分類？ ");
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			//節肢動物門    腔腸動物門    軟體動物門    棘皮動物門
			q1 = new JButton("節肢動物門 ");
			q2 = new JButton("腔腸動物門 ");
			q3 = new JButton("軟體動物門");
			q4 = new JButton("棘皮動物門");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q4);
			botp.add(q3);
			botp.add(q1);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==q1) {
			System.out.println("q1");
			qf.setVisible(false);
		}else if(e.getSource()==q2 || e.getSource()==q3 || e.getSource()==q4) {
			System.out.println("87答錯了");
			JOptionPane.showMessageDialog(this, "你答錯了87",
 					"錯誤!", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
