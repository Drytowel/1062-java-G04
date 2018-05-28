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

	private DoubleSixPanel doubleSixPanel;
	private JPanel contentPanel;
	private JButton gameStart;
	private JButton rule; 
	private JButton back;
	private JTextArea ruleContent;
	private JLabel testLB;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DoubleSix() {
		super();
		
		doubleSixPanel = new DoubleSixPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 655, 534);
		contentPanel = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		
		gameStart = new JButton("\u904A\u6232\u958B\u59CB");
		gameStart.setBounds(350, 369, 500, 31);
		//btnNewButton.setBackground(Color.WHITE);
		gameStart.addActionListener(this);
		
		contentPanel.add(gameStart);
		
		rule = new JButton("\u898F\u5247");
		rule.setBounds(350, 312, 500, 31);
		rule.addActionListener(this);
		
		contentPanel.add(rule);
		
		testLB = new JLabel("");
		testLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));
		//Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) );
		testLB.setBounds(0, 0, 3000, 500);
		contentPanel.add(testLB);
		
		
	}

	//listening the actions
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==gameStart) {
			System.out.println("this is gameStart");
		}else if(e.getSource()==rule) {
			System.out.println("rule");
			setSize(1300, 524);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//setBounds(100, 100, 655, 534);
			contentPanel = new JPanel();
			//contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPanel);
			contentPanel.setLayout(new GridBagLayout());		
			
			
			JTextArea ruleContent = new JTextArea("遊戲名稱:雙六\r\n" + 
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
			ruleContent.setFont (new Font ("SansSerif", Font.PLAIN, 18));  //字體大小
			contentPanel.add(ruleContent);
			back = new JButton("返回");
			back.setBounds(0, 0, 500, 31);
			back.addActionListener(this);
			contentPanel.add(back);
			setVisible(true);
		}else if(e.getSource()==back) {                              
			System.out.println("this is btnNewButton_3");
			
			doubleSixPanel = new DoubleSixPanel();                 
			DoubleSix dou = new DoubleSix();
			//dou.setSize(1300, 525);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1300, 525);
			contentPanel = new JPanel();
			//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPanel);
			contentPanel.setLayout(null);
			
			
			gameStart = new JButton("\u904A\u6232\u958B\u59CB");
			gameStart.setBounds(350, 369, 500, 31);
			gameStart.setBackground(Color.WHITE);
			gameStart.addActionListener(this);
			
			contentPanel.add(gameStart);
			
			rule = new JButton("\u898F\u5247");
			rule.setBounds(350, 312, 500, 31);
			rule.addActionListener(this);
			contentPanel.add(rule);
			
			testLB = new JLabel("");
			testLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));
			//Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) );
			testLB.setBounds(0, 0, 3000, 500);
			contentPanel.add(testLB);
			
		}
		
	}
}