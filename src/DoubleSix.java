import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;

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
	private JPanel contentPane_2;
	private JButton btnNewButton;      //戰鬥開始
	private JButton btnNewButton_1;    //規則
	private JButton btnNewButton_2;    //返回
	private JTextArea btnNewButton_3;    //規則內容	
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
		//setBounds(100, 100, 655, 534);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnNewButton = new JButton("\u904A\u6232\u958B\u59CB");
		btnNewButton.setBounds(350, 369, 500, 31);
		//btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(this);
		
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\u898F\u5247");
		btnNewButton_1.setBounds(350, 312, 500, 31);
		btnNewButton_1.addActionListener(this);
		
		contentPane.add(btnNewButton_1);
		
		testLB = new JLabel("");
		testLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));
		//Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) );
		testLB.setBounds(0, 0, 3000, 500);
		contentPane.add(testLB);
		
		
	}

	//listening the actions
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			System.out.println("this is btnNewButton");
		}else if(e.getSource()==btnNewButton_1) {
			System.out.println("this is btnNewButton_1");
			setSize(1300, 524);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//setBounds(100, 100, 655, 534);
			contentPane_2 = new JPanel();
			//contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane_2);
			contentPane_2.setLayout(new GridBagLayout());		
			
			
			JTextArea btnNewButton_3 = new JTextArea("遊戲名稱:雙六\r\n" + 
					" \r\n" + 
					"遊戲方式  : 每個玩家丟一個骰子(以 _自選顏色_ 當玩家代表)，毎個格子都有特殊的小規則，可能是前進幾格或後退幾格，或者是要完成某個題目。  \r\n" + 
					"\r\n" + 
					"玩家人數  : 2\r\n" + 
					"\r\n" + 
					"勝利條件  : _最先_ 到達終點的人勝利。  \r\n" + 
					"\r\n" + 
					"總格數    : 50格  \r\n" + 
					"\r\n" + 
					"小規則種類 :  \r\n" + 
					"\r\n" + 
					"   猜題        : 猜燈謎,知識王,微積分,常識題  \r\n" + 
					"  \r\n" + 
					"   前進後退  : 踩到就前進或後退該格規定之格數  \r\n" + 
					"  \r\n" + 
					"   特殊格     : 踩到就回家、踩到就進監獄  ");			
			btnNewButton_3.setFont (new Font ("SansSerif", Font.PLAIN, 18));  //字體大小
			contentPane_2.add(btnNewButton_3);
			btnNewButton_2 = new JButton("返回");
			btnNewButton_2.setBounds(0, 0, 500, 31);
			btnNewButton_2.addActionListener(this);
			contentPane_2.add(btnNewButton_2);
			setVisible(true);
		}else if(e.getSource()==btnNewButton_2) {                              
			System.out.println("this is btnNewButton_3");
			
			DoubleSixPanel = new DoubleSixPanel();                 
			DoubleSix dou = new DoubleSix();
			//dou.setSize(1300, 525);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1300, 525);
			contentPane = new JPanel();
			//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
			testLB.setBounds(0, 0, 3000, 500);
			contentPane.add(testLB);
			
		}
		
	}
}
