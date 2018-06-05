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
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Question extends JFrame implements ActionListener {
	private JFrame qf = new JFrame("���D!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private GridBagLayout gb = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private Box horizontal = Box.createHorizontalBox();
	private Box vertical = Box.createVerticalBox();
	private JButton q1 = new JButton("�K���N");
	private JButton q2 = new JButton("���r�N ");
	private JButton q3 = new JButton("�ަ�|");
	private JButton q4 = new JButton("�ѹ�");
	
	public void init(int n) {

		if(n==1) {
			qf.setBounds(30, 30, 500, 300);
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���D: �G��A�ڳ̳߷R�������O�H ");
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q1);
			botp.add(q2);
			botp.add(q3);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
		}

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==q2) {
			System.out.println("q2");
			qf.setVisible(false);
		}
		
	}

}
