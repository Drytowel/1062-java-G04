import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DoubleSix extends JFrame implements ActionListener {

	private JPanel startPanel;               //開始的Panel
	private JButton gameStart;	
	private JButton rule; 
	private JLabel backgroundLB;
	
	private JPanel rulePanel;                //rule的Panel
	private JButton back;	
	
	private JPanel playPanel;                
	private JButton about;
	private JButton backToMenu;
	
	private JButton button[][];
	private Question question;
	
	private final static int ROW = 10; //橫向10個格子
	private final static int COLUMN = 5; //縱向5個格子
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DoubleSix() {
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 534);
		startPanel = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(startPanel);
		startPanel.setLayout(null);
		
		
		gameStart = new JButton("\u904A\u6232\u958B\u59CB");
		gameStart.setBounds(350, 369, 500, 31);		
		gameStart.addActionListener(this);		
		startPanel.add(gameStart);
		
		rule = new JButton("\u898F\u5247");
		rule.setBounds(350, 312, 500, 31);
		rule.addActionListener(this);		
		startPanel.add(rule);
		
		backgroundLB = new JLabel("");
		backgroundLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));		
		backgroundLB.setBounds(0, 0, 3000, 500);
		startPanel.add(backgroundLB);
		
//		GridBagLayout gb = new GridBagLayout();
		
		
	}

	//listening the actions
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==gameStart) {
			System.out.println("gameStart");
			
			GridLayout gridLayout = new GridLayout(ROW, COLUMN); //設置格子狀Panel
			
			Border border = BorderFactory.createBevelBorder(BevelBorder.LOWERED, //設置邊框
			new Color(45, 92, 162), 
			new Color(43, 66, 97), 
			new Color(45, 92, 162), 
			new Color(84, 123, 200));
			
			setBounds(100, 100, 1300, 524);
			playPanel = new JPanel();
			playPanel.setBounds(100, 100, 1300, 524);
			playPanel.setLayout(new BorderLayout());
			setContentPane(playPanel);		//設置為JFrame框架的內容面板
			
			
			about = new JButton("關於"); //設置關於按鈕
			about.addActionListener(this);
			
			backToMenu = new JButton("回到主畫面"); //設置回到主畫面按鈕
			backToMenu.addActionListener(this);

			
			JPanel toolBar = new JPanel();   //設置工具列
			toolBar.setBackground(Color.white);
			toolBar.setBorder(border); //設置邊框
			toolBar.setPreferredSize(new Dimension(1000, 48));
			
			toolBar.add(about); //將關於按鈕放入
			toolBar.add(backToMenu); //回到主畫面按鈕
			
			JPanel actionPanel = new JPanel();  //設置操作區域
			actionPanel.setBackground(Color.yellow);
			actionPanel.setBorder(border);
			actionPanel.setPreferredSize(new Dimension(520, 380));
			
			JPanel contentPanel = new JPanel(new GridLayout(10, 5));  //設置遊玩區域
//			contentPanel.setBackground(Color.blue);
//			contentPanel.setBorder(border);
//			contentPanel.setPreferredSize(new Dimension(300, 500));
//			contentPanel.setLayout(gridLayout); //將遊戲區域設成gridLayout
			button = new JButton[10][5];
			for(int i=0; i<ROW; i++) {
				for(int j=0; j<COLUMN; j++) {
					button[i][j] = new JButton(i+""+j);
					button[i][j].addActionListener(this);
					contentPanel.add(button[i][j]);
				}
			}

			playPanel.add(toolBar, BorderLayout.NORTH);
			playPanel.add(actionPanel, BorderLayout.EAST);
			playPanel.add(contentPanel, BorderLayout.CENTER);
			
//			JButton n1 = new JButton("1");
//	        GridBagConstraints p1 = new GridBagConstraints();
//	        p1.gridx = 0;
//	        p1.gridy = 0;
//	        p1.gridwidth = 1;
//	        p1.gridheight = 1;
//	        p1.weightx = 0;
//	        p1.weighty = 0;
//	        p1.fill = GridBagConstraints.BOTH;
//	        p1.anchor = GridBagConstraints.NORTHEAST;
//	        playPanel.add(n1, p1);
//	        
//	        
//	        
//	        JButton n2 = new JButton("2");
//	        GridBagConstraints p2 = new GridBagConstraints();
//	        p2.gridx = 1;
//	        p2.gridy = 0;
//	        p2.gridwidth = 1;
//	        p2.gridheight = 1;
//	        p2.weightx = 0;
//	        p2.weighty = 0;
//	        p2.fill = GridBagConstraints.NONE;
//	        p2.anchor = GridBagConstraints.NORTHEAST;	        
//	        playPanel.add(n2, p2);
//	        
//	        JButton n3 = new JButton("3");	        
//	        GridBagConstraints p3 = new GridBagConstraints();
//	        p3.gridx = 2;
//	        p3.gridy = 0;
//	        p3.gridwidth = 1;
//	        p3.gridheight = 1;
//	        p3.weightx = 0;
//	        p3.weighty = 0;
//	        p3.fill = GridBagConstraints.NONE;
//	        p3.anchor = GridBagConstraints.NORTHEAST;
//	        playPanel.add(n3, p3);
//	  
//	        JButton n4 = new JButton("4");	        
//	        GridBagConstraints p4 = new GridBagConstraints();
//	        p4.gridx = 3;
//	        p4.gridy = 0;
//	        p4.gridwidth = 1;
//	        p4.gridheight = 1;
//	        p4.weightx = 0;
//	        p4.weighty = 0;
//	        p4.fill = GridBagConstraints.NONE;
//	        p4.anchor = GridBagConstraints.NORTHEAST;
//	        playPanel.add(n4, p4);
//			
//	        
//	        JButton n5 = new JButton("5");	        
//	        GridBagConstraints p5 = new GridBagConstraints();
//	        p5.gridx = 43;
//	        p5.gridy = 0;
//	        p5.gridwidth = 1;
//	        p5.gridheight = 1;
//	        p5.weightx = 0;
//	        p5.weighty = 0;
//	        p5.fill = GridBagConstraints.NONE;
//	        p5.anchor = GridBagConstraints.NORTHEAST;
//	        playPanel.add(n5, p5);
	        
	        playPanel.setVisible(true);
			
		}else if(e.getSource()==rule) {
			System.out.println("rule");					
			setBounds(100, 100, 1300, 524);
			rulePanel = new JPanel();
			setContentPane(rulePanel);
//          contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));			
			rulePanel.setLayout(new GridBagLayout());				
			JTextArea ruleContent = new JTextArea("遊戲名稱:雙六\r\n" + 
					" \r\n" + 
					"遊戲方式  : 每個玩家丟一個骰子(以 _自選顏色_ 當玩家代表)，毎個格子都有特殊的小規則，可能是前進幾格或後退幾格，或者是要完成某個題目。  \r\n" + 
					"\r\n" + 
					"玩家人數  : 2\r\n" + 
					"\r\n" + 
					"勝利條件  : '最先' 到達終點的人勝利。  \r\n" + 
					"\r\n" + 
					"總格數 : 50格  \r\n" + 
					"\r\n" + 
					"小規則種類 :  \r\n" + 
					"\r\n" + 
					"   猜題 : 猜燈謎,知識王,微積分,常識題  \r\n" + 
					"  \r\n" + 
					"   前進後退 : 踩到就前進或後退該格規定之格數  \r\n" + 
					"  \r\n" + 
					"   特殊格 : 踩到就回家、踩到就進監獄  ");			
			ruleContent.setFont (new Font ("SansSerif", Font.PLAIN, 18));  //字體大小
			ruleContent.setBackground (Color.white);                       //背景顏色
			ruleContent.setForeground (Color.BLACK);                       //字体颜色
			rulePanel.add(ruleContent);			
			back = new JButton("返回");
			back.setBounds(0, 0, 500, 31);
			back.addActionListener(this);
			rulePanel.add(back);			
		}else if(e.getSource()==back) {                              
			System.out.println("back");
			setBounds(100, 100, 1300, 525);				
			startPanel = new JPanel();
			setContentPane(startPanel);
//			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));			
			startPanel.setLayout(null);			
			gameStart = new JButton("\u904A\u6232\u958B\u59CB");
			gameStart.setBounds(350, 369, 500, 31);
			gameStart.setBackground(Color.WHITE);
			gameStart.addActionListener(this);
			
			startPanel.add(gameStart);
			
			rule = new JButton("\u898F\u5247");
			rule.setBounds(350, 312, 500, 31);
			rule.addActionListener(this);
			startPanel.add(rule);
			
			backgroundLB = new JLabel("");
			backgroundLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));			
			backgroundLB.setBounds(0, 0, 3000, 500);
			startPanel.add(backgroundLB);

			
		}
		else if(e.getSource()==about) {
			System.out.print("about");
			JOptionPane.showMessageDialog(this, "製作: G04  鄭楷融、鄧煒庠、何冠勳、趙崇廣",
					"關於", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		else if(e.getSource()==backToMenu) {
			System.out.print("backToMunu");
			setBounds(100, 100, 1300, 525);				
			startPanel = new JPanel();
			setContentPane(startPanel);		
			startPanel.setLayout(null);			
			gameStart = new JButton("\u904A\u6232\u958B\u59CB");
			gameStart.setBounds(350, 369, 500, 31);
			gameStart.setBackground(Color.WHITE);
			gameStart.addActionListener(this);
			
			startPanel.add(gameStart);
			
			rule = new JButton("\u898F\u5247");
			rule.setBounds(350, 312, 500, 31);
			rule.addActionListener(this);
			startPanel.add(rule);
			
			backgroundLB = new JLabel("");
			backgroundLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));			
			backgroundLB.setBounds(0, 0, 3000, 500);
			startPanel.add(backgroundLB);
		}
		
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COLUMN; j++) {
				if(e.getSource()==button[i][j]) {
					System.out.println("button");
					question = new Question();
					question.init(i*10+j);
					button[i][j].setVisible(false);
				}
			}
		}
	}
}