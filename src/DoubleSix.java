import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;



import audioplayer.MP3_background;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class DoubleSix extends JFrame implements ActionListener {

	private JPanel startPanel;               //開始的Panel
	private JButton gameStart;				//遊戲開始按鈕
	private JButton rule; 					//遊戲規則按鈕
	private JLabel backgroundLB;			//主畫面背景
	
	private JPanel rulePanel;                 //規則Panel
	private JButton back;					  //規則下的返回按鈕
	
	private JPanel playPanel;                //遊戲畫面panel
	private JButton about;					//遊戲畫面下'關於'按鈕
	private JButton backToMenu;				//遊戲畫面下'返回主畫面'按鈕
	
	private final static int ROW = 10;		//遊戲畫面下按鈕列數
	private final static int COLUMN = 4;	//遊戲畫面下按鈕行數
	
	private JButton btn[];                  //按鈕陣列
	private Question question;              //問題panel
	
	private Thread gameThread;
	private int time=60;                    //倒數時間
	private JTextField countdownTime;       //倒數時間文字區域
	
	private Thread gameAudio;
	private MP3_background mp3;
	private String filename;                //背景音樂路徑
	
	private static int sum = 0;             //初始分數
	Gameover gameover;                      //遊戲結束panel
	private String input;                   //資料庫使用的input
	private static String input2;           //讓game使用的input，不確定會不會影響到資料庫，所以再設一個使用
	
	private Thread countThread;
	private JTextField scoreCount;	
	
	public DoubleSix() {
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 534);
		startPanel = new JPanel();
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
		
		JLabel gameName = new JLabel("知識王");
		gameName.setBounds(450, 100, 400, 100);
		gameName.setFont (new Font ("SansSerif", Font.PLAIN, 100));
		startPanel.add(gameName);		
		
		backgroundLB = new JLabel("");
		backgroundLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));		
		backgroundLB.setBounds(0, 0, 3000, 500);
		startPanel.add(backgroundLB);		
	}	
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
			toolBar.setBackground(Color.GRAY);
			toolBar.setBorder(border); //設置邊框
			toolBar.setPreferredSize(new Dimension(1000, 48));
			
			toolBar.add(about); //將關於按鈕放入
			toolBar.add(backToMenu); //回到主畫面按鈕
			
			JPanel actionPanel = new JPanel();  //設置分數資訊區域
			actionPanel.setBackground(Color.yellow);
			actionPanel.setBorder(border);
			actionPanel.setPreferredSize(new Dimension(520, 380));
			
			JLabel score = new JLabel("分數: ",JLabel.CENTER);        //設置分數面板
			score.setFont (new Font ("SansSerif", Font.PLAIN, 40));
			actionPanel.add(score);
			
			scoreCount = new JTextField("                 ");  //新增分數文字
			countThread = new Thread() {
				public void run() {
		        	while(true){
		        		try {
		        			Thread.sleep(100);
		        		} catch (InterruptedException ex) {}				
						scoreCount.setText(" " + sum + " ");
		        		scoreCount.setFont(new Font ("SansSerif", Font.PLAIN, 20));
		        	}
		        }
			};
			countThread.start();
		    actionPanel.add(scoreCount);			
			
			JPanel contentPanel = new JPanel();  //設置遊玩區域
			contentPanel.setBackground(Color.PINK);
			contentPanel.setBorder(border);
			contentPanel.setPreferredSize(new Dimension(300, 500));
			contentPanel.setLayout(gridLayout); //將遊戲區域設成gridLayout
			
			JLabel chinese = new JLabel("國文",JLabel.CENTER);        
			chinese.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(chinese);
			JLabel math = new JLabel("數學",JLabel.CENTER);     
			math.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(math);
			JLabel history = new JLabel("歷史",JLabel.CENTER);      
			history.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(history);
			JLabel science = new JLabel("自然",JLabel.CENTER);    
			science.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(science);
			JLabel physicalEducation = new JLabel("體育",JLabel.CENTER);      
			physicalEducation.setFont (new Font ("SansSerif", Font.PLAIN, 30));
			contentPanel.add(physicalEducation);
			
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
			            	mp3.stop();         //停止音樂
			            	
			            	//資料庫
			            	try {
			        			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			        		} catch (Exception ex) {
			        			// handle the error
			        		}

			        		Connection conn = null;
			        		try {
			        			input = JOptionPane.showInputDialog( "請輸入姓名" ); 
			    				System.out.println(input);
			    				input2 = input;
			        			conn = DriverManager.getConnection("jdbc:mysql://localhost/g04?"
			        					+ "user=root&password=0000&serverTimezone=UTC&useSSL=false");

			        			Statement stmt = conn.createStatement();
			        			
			        			String sql = "INSERT INTO scoreboard VALUES ('"+input+"','"+sum+"')"; //存進資料庫
			        			stmt.executeUpdate(sql);
			        			
			        		} catch (SQLException ex) {}			        		
			            	gameover = new Gameover(); //跳到遊戲結束視窗
			            	gameover.setInput(input2);
			            	setContentPane(gameover);
			            	gameover.setVisible(true);
			            }
		            }
		         }
		    };
		    gameThread.start();
		    toolBar.add(countdownTime);
		    
		    //背景音樂
		    gameAudio = new Thread() {    
	    		public void run() {
	    			filename = "resources/audio/background.mp3";
	    			mp3 = new MP3_background(filename);
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
			JTextArea ruleContent = new JTextArea("遊戲名稱:知識王\r\n" + 
 					" \r\n" + 
 					"遊戲方式  : 每個按鈕都有題目，在時間內答越多題分數越高，答錯會扣分\r\n" + 
 					"\r\n" + 
 					"規則  : 答對一題+10分，每答錯一個選項-2分\r\n" + 
 					"\r\n" + 
 					"題目數 : 共40題  \r\n");	
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
			gameStart = new JButton("遊戲開始");
			gameStart.setBounds(350, 369, 500, 31);	
			gameStart.addActionListener(this);
			
			startPanel.add(gameStart);
			
			rule = new JButton("規則");
			rule.setBounds(350, 312, 500, 31);
			rule.addActionListener(this);
			startPanel.add(rule);
			
			JLabel gameName = new JLabel("知識王");
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
			
			time = 10;
			sum = 0;
			gameThread.stop();  //停止倒數
			mp3.stop();         //停止音樂
			
			setBounds(100, 100, 1300, 525);				
			startPanel = new JPanel();
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
			
			JLabel gameName = new JLabel("知識王");
			gameName.setBounds(450, 100, 400, 100);
			gameName.setFont (new Font ("SansSerif", Font.PLAIN, 100));
			startPanel.add(gameName);	
			
			backgroundLB = new JLabel("");
			backgroundLB.setIcon(new ImageIcon(getClass().getResource( "wood.png" ) ));			
			backgroundLB.setBounds(0, 0, 3000, 500);
			startPanel.add(backgroundLB);
		}		
			
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
	
	public void Calculation(int n) {
		if(n==1) {
			sum+=10;
			System.out.println(sum);
		}else if(n==2){
			sum -= 2;
			System.out.println(sum);
		}
		
	}
	
	public static int getSum() {
		return sum;
	}

	public static void setSum(int sum) {
		DoubleSix.sum = sum;
	}
	
	public static String getInput() {
		return input2;
	}
	
}