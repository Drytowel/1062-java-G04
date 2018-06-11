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

import audioplayer.MP3;

public class Question extends JFrame implements ActionListener {
	private JFrame qf = new JFrame("問題!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private JButton q1; //預設為答案
	private JButton q2;
	private JButton q3;
	private JButton q4;
	
	private Thread gameAudio;
	private MP3 mp3;
	private String filename;
	
	private DoubleSix doubleSix;
	
	public void chinese(int choice) {
		// 1,6,11,16,21,26,31,36
		if(choice==1) {
			qf.setBounds(400, 300, 400, 300);
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
			
		}else if(choice==36) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("入木三分這句成語是來自於誰的故事？ ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("王羲之");
			q2 = new JButton("張旭");
			q3 = new JButton("陸游");
			q4 = new JButton("郭璞");
			
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
			
		}else if(choice==7) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("2+5x5=? ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("27");
			q2 = new JButton("15");
			q3 = new JButton("10");
			q4 = new JButton("5");
			
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
			
		}else if(choice==12) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("下列何者不是質數?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("8");
			q2 = new JButton("3");
			q3 = new JButton("2");
			q4 = new JButton("5");
			
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
			
		}else if(choice==17) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("64為2的幾次方?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("6");
			q2 = new JButton("5");
			q3 = new JButton("4");
			q4 = new JButton("7");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q2);
			botp.add(q1);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==22) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("下列何者不是32的因數?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("7");
			q2 = new JButton("16");
			q3 = new JButton("4");
			q4 = new JButton("2");
			
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
			
		}else if(choice==27) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("下列何者不是11的倍數?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("111");
			q2 = new JButton("121");
			q3 = new JButton("11");
			q4 = new JButton("22");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q4);
			botp.add(q1);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==32) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("請問16和14的最大公因數為?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("2");
			q2 = new JButton("8");
			q3 = new JButton("7");
			q4 = new JButton("16");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q1);
			botp.add(q4);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==37) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("1+8x(4-3)=?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("9");
			q2 = new JButton("8");
			q3 = new JButton("10");
			q4 = new JButton("7");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q1);
			botp.add(q2);
			botp.add(q3);
			
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
			
		}else if(choice==18) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("鄭經治台時，改國號為什麼國？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("東寧");
			q2 = new JButton("鄭經");
			q3 = new JButton("西寧");
			q4 = new JButton("高砂");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q2);
			botp.add(q1);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==23) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("著有道德經，為道家始祖的是？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("李耳");
			q2 = new JButton("李鼻");
			q3 = new JButton("李斯");
			q4 = new JButton("李威");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q2);
			botp.add(q1);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==28) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("十三行文化遺址在台北縣哪裡發現？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("八里");
			q2 = new JButton("陽明山");
			q3 = new JButton("淡水");
			q4 = new JButton("五股");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q2);
			botp.add(q1);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==33) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("二次大戰期間的諾曼第登陸，發生在哪一個國家？  ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("法國");
			q2 = new JButton("西班牙");
			q3 = new JButton("美國");
			q4 = new JButton("荷蘭");
			
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
			
		}else if(choice==38) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("何者屬於台灣原住民的節慶活動？  ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("豐年祭");
			q2 = new JButton("載香包");
			q3 = new JButton("放水燈");
			q4 = new JButton(" 跳童乩 ");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q1);
			botp.add(q3);
			botp.add(q4);
			botp.add(q2);
			
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
			
		}else if(choice==24) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("水溫降到攝氏幾度以下會結冰？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("0");
			q2 = new JButton("20");
			q3 = new JButton("10");
			q4 = new JButton("30");
			
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
			
		}else if(choice==29) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("少量白雲母，最可能之火成岩種類為何？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("花崗岩");
			q2 = new JButton("橄欖岩");
			q3 = new JButton("輝長岩");
			q4 = new JButton("玄武岩");
			
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
			
		}else if(choice==34) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("臭氧層的臭氧減少的主因是下列何種化合物？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("氟氯碳化物");
			q2 = new JButton("氯氧化合物");
			q3 = new JButton("二氧化氮");
			q4 = new JButton("二氧化碳");
			
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
			
		}else if(choice==39) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("豬籠草和毛氈苔主要藉由捕食昆蟲\n以獲得該地區缺乏的何種營養素？ ");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("氮");
			q2 = new JButton("鐵");
			q3 = new JButton("碳");
			q4 = new JButton("鉀");
			
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
			
		}else if(choice==10) {
			qf.setBounds(400, 300, 400, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("鐵人三項比賽中，自行車項目的距離為幾公里？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("40");
			q2 = new JButton("20");
			q3 = new JButton("10");
			q4 = new JButton("30");
			
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
			
		}else if(choice==15) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("在籃球比賽中，得分的最高限制為多久?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("無此規定");
			q2 = new JButton("100分");
			q3 = new JButton("200分");
			q4 = new JButton("150分");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q1);
			botp.add(q3);
			botp.add(q4);
			botp.add(q2);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==20) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("籃球比賽時，罰球中籃算幾分?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("1分");
			q2 = new JButton("2分");
			q3 = new JButton("3分");
			q4 = new JButton("4分");
			
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
			
		}else if(choice==25) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("請問NBA籃球規則中規定個人犯規幾次即畢業離場？");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("六次");
			q2 = new JButton("五次");
			q3 = new JButton("四次");
			q4 = new JButton("三次");
			
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
			
		}else if(choice==30) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("排球運動中，在發球或比賽中，球觸網而過，則");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("比賽繼續");
			q2 = new JButton("對方得分");
			q3 = new JButton("重新發球");
			q4 = new JButton("犯規");
			
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
			
		}else if(choice==35) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("排球比賽獲發球權之一方應如何移動位置?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("順時鐘輪轉一位");
			q2 = new JButton("裁判決定");
			q3 = new JButton("教練指示");
			q4 = new JButton("逆時鐘");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q3);
			botp.add(q1);
			botp.add(q2);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}else if(choice==40) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // 去掉視窗的裝飾
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //不使用任何裝飾視窗風格
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("排球比賽時下列哪一情況是不得用攔網方式將球擊回?");
			text.setEditable(false); //使題目無法被修改
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("對方發球");
			q2 = new JButton("對方吊小球");
			q3 = new JButton("對方扣殺球");
			q4 = new JButton("對方後排攻擊");
			
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q4);
			botp.add(q1);
			botp.add(q2);
			botp.add(q3);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		doubleSix = new DoubleSix();
		if(e.getSource()==q1) {
			System.out.println("q1");
			
			gameAudio = new Thread() {    
	    		public void run() {
	    			filename = "resources/audio/currect.mp3";
	    			mp3 = new MP3(filename);
	    			mp3.setLoop(false);
	    			mp3.play();
	    		}
	    	};
	    	gameAudio.start();
			
			qf.setVisible(false);
            
			doubleSix.Calculation(1); //+10

		}else if(e.getSource()==q2 || e.getSource()==q3 || e.getSource()==q4) {
			System.out.println("87答錯了");
			
			gameAudio = new Thread() {    
	    		public void run() {
	    			filename = "resources/audio/wrong.mp3";
	    			mp3 = new MP3(filename);
	    			mp3.setLoop(false);
	    			mp3.play();
	    		}
	    	};
	    	gameAudio.start(); 

			JOptionPane.showMessageDialog(this, "你答錯了87",
 					"錯誤!", JOptionPane.ERROR_MESSAGE);
            
			doubleSix.Calculation(2); //-2
			
		}
		
	}

}
