import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DoubleSix extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel testLB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoubleSix frame = new DoubleSix();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				} //catch the exception situation
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DoubleSix() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("\u904A\u6232\u958B\u59CB");
		btnNewButton.setBounds(176, 369, 291, 31);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(this);
		
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u898F\u5247");
		btnNewButton_1.setBounds(176, 312, 291, 31);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		JLabel testLB = new JLabel("");
		testLB.setIcon(new ImageIcon("C:/Users/Administrator/Desktop/JavaProgram/temp_final_project/Double_six/src/123.png"));
		testLB.setBounds(63, 41, 225, 181);
		contentPane.add(testLB);
		
		
	}

	//listening the actions
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			System.out.println("this is btnNewButton");
		}else if(e.getSource()==btnNewButton_1) {
			System.out.println("this is btnNewButton_1");
		}
		
	}
}
