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
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DoubleSix extends JFrame implements ActionListener {

	private DoubleSixPanel DoubleSixPanel;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel testLB;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DoubleSix() {
		super();
		
		DoubleSixPanel = new DoubleSixPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnNewButton = new JButton("\u904A\u6232\u958B\u59CB");
		btnNewButton.setBounds(350, 369, 500, 31);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(this);
		
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\u898F\u5247");
		btnNewButton_1.setBounds(350, 312, 500, 31);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		testLB = new JLabel("");
		testLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));
		//Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) );
		testLB.setBounds(0, 0, 1200, 700);
		contentPane.add(testLB);
		
		
	}

	//listening the actions
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			System.out.println("this is btnNewButton");
			
			DoubleSixPanel = new DoubleSixPanel();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 1200, 700);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			DoubleSixPanel.gameStart();
		}else if(e.getSource()==btnNewButton_1) {
			System.out.println("this is btnNewButton_1");
			
			DoubleSixPanel = new DoubleSixPanel();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 1200, 700);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			DoubleSixPanel.gameRule();
		}
		
	}
}
