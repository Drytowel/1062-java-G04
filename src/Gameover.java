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

public class Gameover extends JPanel{
	private String score;
	private JLabel information;
	private String input;
	private JPanel textPanel;
	
	public Gameover() {
		this.setBounds(0, 0, 1300, 525);
		this.setLayout(new BorderLayout());
		
		input = DoubleSix.getInput();
		System.out.println(input);
		
		score = "     您的分數: " + DoubleSix.getSum();
		information = new JLabel();
		information.setBackground(Color.white);
		information.setFont(new Font ("SansSerif", Font.BOLD, 40));
		information.setForeground(Color.BLUE);
		information.setText("您的姓名: "+ input + "\r\n" + score);
		
		this.add(information);
        
		//抓資料
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			// handle the error
		}

		Connection conn = null;
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/g04?"
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

	

}
