import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gameover extends JPanel implements ActionListener{
//	private JPanel topPanel;
	private JButton playAgain;
	private JButton backToMenu;
	private String score;
	private JLabel information;
	private String input;
	private JTextField scoreBoard;
	private JPanel textPanel;
	

	
	public Gameover() {
		this.setBounds(0, 0, 1300, 525);
		this.setLayout(new BorderLayout());
		
//		topPanel = new JPanel();
		
//		playAgain = new JButton("在玩一次?");
//		backToMenu = new JButton("返回主畫面");
//		topPanel.add(playAgain);
//		topPanel.add(backToMenu);
		
//		input = DoubleSix.getInput();
//		System.out.println(input);
//		
//		score = "     您的分數: " + DoubleSix.getSum();
//		information = new JLabel();
//		information.setBackground(Color.white);
//		information.setFont(new Font ("SansSerif", Font.BOLD, 40));
//		information.setForeground(Color.BLUE);
//		information.setText("您的姓名: "+ input + "\r\n" + score);
//		
//		this.add(information);
//		this.add(topPanel, BorderLayout.NORTH);
        
		//抓資料
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			// handle the error
		}

		Connection conn = null;
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/scoreboard?"
					+ "user=root&password=0000&serverTimezone=UTC&useSSL=false");

			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM scoreboard";

			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData data = rs.getMetaData();

			int sum = data.getColumnCount();

			while(rs.next()){
				textPanel = new JPanel();
				textPanel.setLayout(new GridBagLayout());
				
				
			    for(int i=1; i<=sum; i++){
//			    	textPanel = new JPanel();
//			    	scoreBoard = new JTextField("                 ");
//			    	scoreBoard.setText(data.getColumnName(i)+":"+rs.getObject(i)+"\t");
//			    	scoreBoard.setFont(new Font ("SansSerif", Font.PLAIN, 20));
//			    	textPanel.add(scoreBoard);
//			    	this.add(textPanel);
			    	
			    	
//			    	textPanel.setLayout(new GridBagLayout());
//					JTextArea scoreBoard = new JTextArea(data.getColumnName(i+1)+":"+rs.getObject(i+1)+" \t");
//					scoreBoard.setEditable(false); //使規則無法被更改
//					scoreBoard.setFont (new Font ("SansSerif", Font.PLAIN, 30));  //字體大小
//					scoreBoard.setBackground (Color.white);                       //背景顏色
//					scoreBoard.setForeground (Color.BLACK);                       //字体颜色
//					textPanel.add(scoreBoard);

					this.add(textPanel);
			    	
			        System.out.print(data.getColumnName(i)+":"+rs.getObject(i)+" \t");
			    }
			    System.out.println("");
			}
			
		} catch (SQLException ex) {}
	}


	public String getInput() {
		return input;
	}







	public void setInput(String input) {
		this.input = input;
	}







	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==playAgain) {
			
		}
		if(e.getSource()==backToMenu) {

		}
	}
	

}
