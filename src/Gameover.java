import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gameover extends JPanel implements ActionListener{
	private JPanel topPanel;
	private JButton playAgain;
	private JButton backToMenu;
	private String score;
	private JLabel information;
	private String input;
	
	public Gameover() {
		this.setBounds(0, 0, 1300, 525);
		this.setLayout(new BorderLayout());
		
		topPanel = new JPanel();
		
		playAgain = new JButton("在玩一次?");
		backToMenu = new JButton("返回主畫面");
		topPanel.add(playAgain);
		topPanel.add(backToMenu);
		
		input = DoubleSix.getInput();
		System.out.println(input);
		
		score = "     您的分數: " + DoubleSix.getSum();
		information = new JLabel();
		information.setBackground(Color.white);
		information.setFont(new Font ("SansSerif", Font.BOLD, 40));
		information.setForeground(Color.BLUE);
		information.setText("您的姓名: "+ input + "\r\n" + score);
		
		this.add(information);
		this.add(topPanel, BorderLayout.NORTH);
		

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
