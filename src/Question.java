import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextArea;

public class Question extends JFrame implements ActionListener {
	private JFrame qf = new JFrame("問題!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private JButton q1; //預設為答案
	private JButton q2;
	private JButton q3;
	private JButton q4;	
	
	public void chinese(int choice) {
		// 1,6,11,16,21,26,31,36
		if(choice==1) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("(猜一字)酒中沒有水，簡直如見鬼 ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("醜");
			q2 = new JButton("酉");
			q3 = new JButton("酒");
			q4 = new JButton("愧");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q3);
			botp.add(q2);
			botp.add(q1);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==6) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("子曰：吾十五而志於學，三十而立，四十而「」...？ ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("不惑");
			q2 = new JButton("耳順");
			q3 = new JButton("知天命");
			q4 = new JButton("從心所欲");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q3);
			botp.add(q2);
			botp.add(q1);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==11) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("形容一人傳虛，萬人傳實的成語，是下面哪一個");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("三人成虎");
			q2 = new JButton("三媒六證");
			q3 = new JButton("三戶亡秦");
			q4 = new JButton("三姑六婆");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q1);
			botp.add(q3);
			botp.add(q2);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==16) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("台灣民俗活動搶孤，舉辦時間通常在哪個傳統節令前後?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("中元節");
			q2 = new JButton("元宵節");
			q3 = new JButton("端午節");
			q4 = new JButton("中秋節");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q2);
			botp.add(q3);
			botp.add(q1);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==21) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("破釜沉舟的釜，指的是什麼?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("炊具");
			q2 = new JButton("斧頭");
			q3 = new JButton("兵器");
			q4 = new JButton("船舵");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q1);
			botp.add(q2);
			botp.add(q3);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==26) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("金瓶梅的作者是?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("笑笑生");
			q2 = new JButton("施耐庵");
			q3 = new JButton("西門慶");
			q4 = new JButton("吳承恩");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q3);
			botp.add(q2);
			botp.add(q1);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==31) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("台灣俗諺乞丐趕廟公的意思是?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("反客為主");
			q2 = new JButton("目無尊長");
			q3 = new JButton("推陳出新");
			q4 = new JButton("恩將仇報");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q3);
			botp.add(q2);
			botp.add(q4);
			botp.add(q1);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}
	}
	
	public void math(int choice) {
		// 2,7,12,17,22,27,32,37
		if(choice==2) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("1+2+3......+10，請問總數是多少？ ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("55");
			q2 = new JButton("52");
			q3 = new JButton("54");
			q4 = new JButton("50");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q1);
			botp.add(q3);
			botp.add(q2);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}
		
	}
	
	public void history(int choice) {
		// 3,8,13,18,23,28,33,38
		if(choice==3) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("「臥薪嘗膽」這句成語出自於誰的故事？ ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("句踐");
			q2 = new JButton("文種");
			q3 = new JButton("伍子胥");
			q4 = new JButton("范蠡");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q2);
			botp.add(q3);
			botp.add(q1);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==8) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("諸葛亮用空城計嚇退哪一位人物率領的軍隊 ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("司馬懿");
			q2 = new JButton("孟獲");
			q3 = new JButton("劉表");
			q4 = new JButton("曹操");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q3);
			botp.add(q1);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==13) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("關公使用的兵器是什麼");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("青龍偃月刀");
			q2 = new JButton("倚天劍");
			q3 = new JButton("屠龍刀");
			q4 = new JButton("九龍連環刀");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q1);
			botp.add(q2);
			botp.add(q4);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}
	}

	public void science(int choice) {
		// 4,9,14,19,24,29,34,39
		if(choice==4) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("問題:「鱟」在生物學上的分類？ ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			//節肢動物門    腔腸動物門    軟體動物門    棘皮動物門
			q1 = new JButton("節肢動物門 ");
			q2 = new JButton("腔腸動物門 ");
			q3 = new JButton("軟體動物門");
			q4 = new JButton("棘皮動物門");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q4);
			botp.add(q3);
			botp.add(q1);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==9) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("阿基米得在做什麼事情的時候，發現阿基米得原理？ ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("洗澡");
			q2 = new JButton("睡覺");
			q3 = new JButton("煮飯");
			q4 = new JButton("作實驗");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q3);
			botp.add(q1);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==14) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("牛頓發現地心引力時，是被什麼打到 ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("蘋果");
			q2 = new JButton("石頭");
			q3 = new JButton("芭樂");
			q4 = new JButton("鉛球");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q1);
			botp.add(q3);
			botp.add(q2);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==19) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("蜜蜂通常利用什麼方式向同伴傳遞食物方位和距離的訊息");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("飛舞");
			q2 = new JButton("飛回蜂窩");
			q3 = new JButton("鳴叫");
			q4 = new JButton("做記號");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q3);
			botp.add(q4);
			botp.add(q1);
			botp.add(q2);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}
		
	}

	public void physicalEducation(int choice) {
		// 5,10,15,20,25,30,35,40
		if(choice==5) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("球類運動的術語中，洗溝是哪一種球的術語 ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("保齡球");
			q2 = new JButton("棒球");
			q3 = new JButton("煮飯");
			q4 = new JButton("鉛球");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q1);
			botp.add(q4);
			botp.add(q2);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==q1) {
			System.out.println("q1");
			qf.setVisible(false);
		}else if(e.getSource()==q2 || e.getSource()==q3 || e.getSource()==q4) {
			System.out.println("87答錯了");
			JOptionPane.showMessageDialog(this, "你答錯了87",
 					"錯誤!", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
