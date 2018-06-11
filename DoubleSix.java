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

import audioplayer.MP3;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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

	private JPanel startPanel;               //開始的Panel
	private JButton gameStart;	
	private JButton rule; 
	private JLabel backgroundLB;
	
	private JPanel rulePanel;                 //rule的Panel
	private JButton back;	
	
	private JPanel playPanel;                
	private JButton about;
	private JButton backToMenu;
	
	private final static int ROW = 10;
	private final static int COLUMN = 4;

	
	private JLabel gameName;
	private JPanel toolBar;
	private JLabel score;
	private JPanel actionPanel;
	private JPanel contentPanel;
	private JLabel chinese;
	private JLabel math;
	private JLabel history;
	private JLabel physicalEducation;
	private JLabel science;
	
	private JTextArea ruleContent;
	
	private JButton btn[]; //按鈕陣列
	private Question question;
	
	Thread gameThread; //倒數計時的執行緒
	private int time=109;
	private JTextField countdownTime;
	
	
	Thread gameAudio; //遊戲音樂的執行緒
	MP3 mp3;
    String filename;
    
    DataBase database;
    GetData getdata=new GetData();



	/**
	 * Create the frame.
	 */
	public DoubleSix() {
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 534);
		startPanel = new JPanel();
		setContentPane(startPanel);
		startPanel.setLayout(null);
		
		
		gameStart = new JButton("遊戲開始");
		gameStart.setBounds(350, 369, 500, 31);		
		gameStart.addActionListener(this);		
		startPanel.add(gameStart);
		
		rule = new JButton("規則");
		rule.setBounds(350, 312, 500, 31);
		rule.addActionListener(this);		
		startPanel.add(rule);
		
		gameName = new JLabel("知識王");
		gameName.setBounds(450, 100, 400, 100);
		gameName.setFont (new Font ("SansSerif", Font.PLAIN, 100));
		startPanel.add(gameName);		
		
		
		backgroundLB = new JLabel("");
		backgroundLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));		
		backgroundLB.setBounds(0, 0, 3000, 500);
		startPanel.add(backgroundLB);
		

		
		
//		GridBagLayout gb = new GridBagLayout();
		
		
	}

	//listening the actions
	
	
	@SuppressWarnings("deprecation")
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

			
			toolBar = new JPanel();   //設置工具列
			toolBar.setBackground(Color.GRAY);
			toolBar.setBorder(border); //設置邊框
			toolBar.setPreferredSize(new Dimension(1000, 48));
			
			toolBar.add(about); //將關於按鈕放入
			toolBar.add(backToMenu); //回到主畫面按鈕
			
			actionPanel = new JPanel();  //設置操作區域
			actionPanel.setBackground(Color.yellow);
			actionPanel.setBorder(border);
			actionPanel.setPreferredSize(new Dimension(520, 380));
			
			score = new JLabel("分數",JLabel.CENTER);        //設置分數在分數面板
			score.setFont (new Font ("SansSerif", Font.PLAIN, 40));
			actionPanel.add(score);
			
			
			contentPanel = new JPanel();  //設置遊玩區域
			contentPanel.setBackground(Color.PINK);
			contentPanel.setBorder(border);
			contentPanel.setPreferredSize(new Dimension(300, 500));
			contentPanel.setLayout(gridLayout); //將遊戲區域設成gridLayout
			
			chinese = new JLabel("國文",JLabel.CENTER);        
			chinese.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(chinese);
			math = new JLabel("數學",JLabel.CENTER);     
			math.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(math);
			history = new JLabel("歷史",JLabel.CENTER);      
			history.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(history);
			science = new JLabel("自然",JLabel.CENTER);    
			science.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(science);
			physicalEducation = new JLabel("體育",JLabel.CENTER);      
			physicalEducation.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(physicalEducation);
			
			
			//build button array(can be controlled one by one)
			btn = new JButton[51];
			for(int i=1; i<=ROW*COLUMN; i++) {								
				btn[i] = new JButton(""+i);
				btn[i].addActionListener(this);	
				contentPanel.add(btn[i]);				
			}

			
			countdownTime = new JTextField("                                   "); //設置倒數計時
			gameThread = new Thread() {
		        public void run() {
		        		for(int j=time; j>=0; j--) {
			            	try {
					            Thread.sleep(1000);
					        } catch (InterruptedException ex) {}			            	
		            		countdownTime.setText("剩餘時間: "+j);
		            		countdownTime.setBackground(Color.green);
				            countdownTime.setFont(new Font("楷體",Font.BOLD|Font.ITALIC,16));
				            
				            if(j==0) {
				            	mp3.stop();         //時間到,停止音樂
				            }
			            }
		         }
		    };
		    gameThread.start();
		    toolBar.add(countdownTime);
		    {
				try {
				database = new DataBase();
				} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				  }
			}
			try {
				getdata.score_update(0);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //更新值(分數加十分)
			
		    
		    //背景音樂
		    gameAudio = new Thread() {    
	    		public void run() {
	    			filename = "resources/audio/background.mp3";
	    			mp3 = new MP3(filename);
	    			mp3.setLoop(true);
	    			mp3.play();
	    		}
	    	};
	    	gameAudio.start();
	        
	        playPanel.add(toolBar, BorderLayout.NORTH);
			playPanel.add(actionPanel, BorderLayout.EAST);
		    playPanel.add(contentPanel, BorderLayout.CENTER);
			
		        
		    playPanel.setVisible(true);
		    
		    
			
		}else if(e.getSource()==rule) {
			System.out.println("rule");					
			setBounds(100, 100, 1300, 524);
			rulePanel = new JPanel();
			setContentPane(rulePanel);
//          contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));			
			rulePanel.setLayout(new GridBagLayout());				
			ruleContent = new JTextArea("遊戲名稱:知識王\r\n" + 
 					" \r\n" + 
 					"遊戲方式  : 每個按鈕都有題目，在時間內答越多題分數越高，答錯會扣分\r\n" + 
 					"\r\n" + 
 					"規則  : 答對一題+10分，每答錯一個選項-2分\r\n" + 
 					"\r\n" + 
 					"題目數 : 共50題  \r\n");	
			ruleContent.setEditable(false); //使規則無法被更改
			ruleContent.setFont (new Font ("SansSerif", Font.PLAIN, 30));  //字體大小
			ruleContent.setBackground (Color.white);                       //背景顏色
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
			
			gameName = new JLabel("知識王");
			gameName.setBounds(450, 100, 400, 100);
			gameName.setFont (new Font ("SansSerif", Font.PLAIN, 100));
			startPanel.add(gameName);	
			
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
			System.out.println("backToMunu");
			
			gameThread.stop();  //停止倒數
			mp3.stop();         //停止音樂
			
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
			
			gameName = new JLabel("知識王");
			gameName.setBounds(450, 100, 400, 100);
			gameName.setFont (new Font ("SansSerif", Font.PLAIN, 100));
			startPanel.add(gameName);	
			
			backgroundLB = new JLabel("");
			backgroundLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));			
			backgroundLB.setBounds(0, 0, 3000, 500);
			startPanel.add(backgroundLB);
		}		
		//按鈕按'行'分配題目種類	
		for(int i=1; i<=ROW*COLUMN; i++) {
			if(e.getSource()==btn[i]) {
				System.out.println("button" + i);
				question = new Question();
				btn[i].setVisible(false);
				if(i%5==1) {
					question.chinese(i);	
				}else if(i%5==2) {
					question.math(i);
				}else if(i%5==3) {
					question.history(i);	
				}else if(i%5==4) {
					question.science(i);	
				}else if(i%5==0) {
					question.physicalEducation(i);
				}
			}
		}
		
	}
	
}