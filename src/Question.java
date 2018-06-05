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
	private JFrame qf = new JFrame("���D!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private JButton q1; //�w�]������
	private JButton q2;
	private JButton q3;
	private JButton q4;
	
	public void init(int choice) {
		
		if(choice==1) {
			qf.setBounds(30, 30, 500, 300);
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���D: �G��A�ڳ̳߷R�������O�H ");
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("���r�N ");
			q2 = new JButton("�K���N ");
			q3 = new JButton("�ަ�|");
			q4 = new JButton("�ѹ�");
			
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
			
			JTextArea text = new JTextArea("���D:�u�M�v�b�ͪ��ǤW�������H ");
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			//�`�ϰʪ���    �ĸz�ʪ���    �n��ʪ���    �ƥְʪ���
			q1 = new JButton("�`�ϰʪ��� ");
			q2 = new JButton("�ĸz�ʪ��� ");
			q3 = new JButton("�n��ʪ���");
			q4 = new JButton("�ƥְʪ���");
			
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
			System.out.println("87�����F");
			JOptionPane.showMessageDialog(this, "�A�����F87",
 					"���~!", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
