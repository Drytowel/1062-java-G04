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
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DoubleSix extends JFrame implements ActionListener {

	private JPanel startPanel;               //����anel
	private JButton gameStart;	
	private JButton rule; 
	private JLabel backgroundLB;
	
	private JPanel rulePanel;                //rule��anel
	private JButton back;	
	
	private JPanel playPanel;                
	private JButton about;
	private JButton backToMenu;
	
	
	private final static int ROW = 10; //璈怠��10�摮�
	private final static int COLUMN = 5; //蝮勗��5�摮�
	
	private JButton btn[];
	private Question question;
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
			
			GridLayout gridLayout = new GridLayout(ROW, COLUMN); //閮剔蔭�摮�Panel
			
			Border border = BorderFactory.createBevelBorder(BevelBorder.LOWERED, //閮剔蔭����
			new Color(45, 92, 162), 
			new Color(43, 66, 97), 
			new Color(45, 92, 162), 
			new Color(84, 123, 200));
			
			setBounds(100, 100, 1300, 524);
			playPanel = new JPanel();
			playPanel.setBounds(100, 100, 1300, 524);
			playPanel.setLayout(new BorderLayout());
			setContentPane(playPanel);		//閮剔蔭�JFrame獢��摰寥�
			
			
			about = new JButton("��"); //閮剔蔭������
			about.addActionListener(this);
			
			backToMenu = new JButton("��銝餌�"); //閮剔蔭��銝餌�����
			backToMenu.addActionListener(this);

			
			JPanel toolBar = new JPanel();   //閮剔蔭撌亙���
			toolBar.setBackground(Color.white);
			toolBar.setBorder(border); //閮剔蔭����
			toolBar.setPreferredSize(new Dimension(1000, 48));
			
			toolBar.add(about); //撠�����
			toolBar.add(backToMenu); //��銝餌�����
			
			JPanel actionPanel = new JPanel();  //閮剔蔭�������
			actionPanel.setBackground(Color.yellow);
			actionPanel.setBorder(border);
			actionPanel.setPreferredSize(new Dimension(520, 380));
			
			JLabel player = new JLabel("��",JLabel.CENTER);
			player.setFont (new Font ("SansSerif", Font.PLAIN, 40));
			actionPanel.add(player);
			
			JPanel contentPanel = new JPanel();  //閮剔蔭�������
			contentPanel.setBackground(Color.blue);
			contentPanel.setBorder(border);
			contentPanel.setPreferredSize(new Dimension(300, 500));
			contentPanel.setLayout(gridLayout); //撠�����身��ridLayout
			
			btn = new JButton[51];
			for(int i=1; i<=ROW*COLUMN; i++) {								
				btn[i] = new JButton(""+i);
				btn[i].addActionListener(this);	
				contentPanel.add(btn[i]);
									
				
				
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
			JTextArea ruleContent = new JTextArea("����迂:��\r\n" + 
					" \r\n" + 
					"���撘�  : 瘥�摰嗡���狐摮�(隞� _��憿_ ��摰嗡誨銵�)嚗��摮��畾����������脣嗾������撟暹嚗��閬�������  \r\n" + 
					"\r\n" + 
					"�摰嗡犖�  : 2\r\n" + 
					"\r\n" + 
					"��璇辣  : '�����' ������犖����  \r\n" + 
					"\r\n" + 
					"蝮賣� : 50�  \r\n" + 
					"\r\n" + 
					"撠��車憿� :  \r\n" + 
					"\r\n" + 
					"   ���� : �����,�霅��,敺桃���,撣貉���  \r\n" + 
					"  \r\n" + 
					"   ���脣��� : 頦拙撠勗��脫����閰脫閬���  \r\n" + 
					"  \r\n" + 
					"   �畾 : 頦拙撠勗�振�萱�撠梢�脩���  ");			
			ruleContent.setFont (new Font ("SansSerif", Font.PLAIN, 18));  //摮�之撠�
			ruleContent.setBackground (Color.white);                       //��憿
			ruleContent.setForeground (Color.BLACK);                       //摮��
			rulePanel.add(ruleContent);			
			back = new JButton("餈��");
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
			JOptionPane.showMessageDialog(this, "鋆賭��: G04  �璆瑁�����������誨",
					"��", JOptionPane.INFORMATION_MESSAGE);
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
			
		for(int i=1; i<=ROW*COLUMN; i++) {
			if(e.getSource()==btn[i]) {
				System.out.print("backToMunu");
				question = new Question();
				question.init(i);
				btn[i].setVisible(false);
			}
		}
	
	
	
	
	
	
	
	}

	
}