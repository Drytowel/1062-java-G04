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
	private JFrame qf = new JFrame("���D!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private JButton q1; //�w�]������
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("(�q�@�r)�s���S�����A²���p���� ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("��");
			q2 = new JButton("��");
			q3 = new JButton("�s");
			q4 = new JButton("�\");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�l��G�^�Q���ӧө�ǡA�T�Q�ӥߡA�|�Q�ӡu�v...�H ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("���b");
			q2 = new JButton("�ն�");
			q3 = new JButton("���ѩR");
			q4 = new JButton("�q�ߩұ�");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�ήe�@�H�ǵ�A�U�H�ǹꪺ���y�A�O�U�����@��");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�T�H����");
			q2 = new JButton("�T�C����");
			q3 = new JButton("�T��`��");
			q4 = new JButton("�T�h���C");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�x�W���U���ʷm�t�A�|��ɶ��q�`�b���Ӷǲθ`�O�e��?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�����`");
			q2 = new JButton("���d�`");
			q3 = new JButton("�ݤȸ`");
			q4 = new JButton("����`");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�}�y�I�઺�y�A�����O����?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("����");
			q2 = new JButton("���Y");
			q3 = new JButton("�L��");
			q4 = new JButton("���");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���~�����@�̬O?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("������");
			q2 = new JButton("�I�@�g");
			q3 = new JButton("����y");
			q4 = new JButton("�d�Ӯ�");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�x�W�U�Τ^�����q�����N��O?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�ϫȬ��D");
			q2 = new JButton("�صL�L��");
			q3 = new JButton("�����X�s");
			q4 = new JButton("���N����");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�J��T���o�y���y�O�Ӧ۩�֪��G�ơH ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("������");
			q2 = new JButton("�i��");
			q3 = new JButton("����");
			q4 = new JButton("���\");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("1+2+3......+10�A�а��`�ƬO�h�֡H ");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("2+5x5=? ");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�U�C��̤��O���?");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("64��2���X����?");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�U�C��̤��O32���]��?");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�U�C��̤��O11������?");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�а�16�M14���̤j���]�Ƭ�?");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("1+8x(4-3)=?");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�u���~���x�v�o�y���y�X�۩�֪��G�ơH ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�y��");
			q2 = new JButton("���");
			q3 = new JButton("��l�E");
			q4 = new JButton("�S��");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�Ѹ��G�Ϊū��p�~�h���@��H���v�⪺�x�� ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�q���t");
			q2 = new JButton("�s��");
			q3 = new JButton("�B��");
			q4 = new JButton("���");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�����ϥΪ��L���O����");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�C�s����M");
			q2 = new JButton("�ʤѼC");
			q3 = new JButton("�O�s�M");
			q4 = new JButton("�E�s�s���M");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�G�g�v�x�ɡA��긹�������H");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�F��");
			q2 = new JButton("�G�g");
			q3 = new JButton("���");
			q4 = new JButton("����");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�ۦ��D�w�g�A���D�a�l�����O�H");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("����");
			q2 = new JButton("����");
			q3 = new JButton("����");
			q4 = new JButton("����");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�Q�T���ƿ�}�b�x�_�����̵o�{�H");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�K��");
			q2 = new JButton("�����s");
			q3 = new JButton("�H��");
			q4 = new JButton("����");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�G���j�Դ������հҲĵn���A�o�ͦb���@�Ӱ�a�H  ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�k��");
			q2 = new JButton("��Z��");
			q3 = new JButton("����");
			q4 = new JButton("����");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("����ݩ�x�W�������`�y���ʡH  ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�צ~��");
			q2 = new JButton("�����]");
			q3 = new JButton("����O");
			q4 = new JButton(" ������ ");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���D:�u�M�v�b�ͪ��ǤW�������H ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			//�`�ϰʪ���    �ĸz�ʪ���    �n��ʪ���    �ƥְʪ���
			q1 = new JButton("�`�ϰʪ��� ");
			q2 = new JButton("�ĸz�ʪ��� ");
			q3 = new JButton("�n��ʪ���");
			q4 = new JButton("�ƥְʪ���");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("����̱o�b������Ʊ����ɭԡA�o�{����̱o��z�H ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�~��");
			q2 = new JButton("��ı");
			q3 = new JButton("�N��");
			q4 = new JButton("�@����");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���y�o�{�a�ߤޤO�ɡA�O�Q���򥴨� ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("ī�G");
			q2 = new JButton("���Y");
			q3 = new JButton("�ݼ�");
			q4 = new JButton("�]�y");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�e���q�`�Q�Τ���覡�V�P��ǻ��������M�Z�����T��");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("���R");
			q2 = new JButton("���^����");
			q3 = new JButton("��s");
			q4 = new JButton("���O��");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���ŭ������X�ץH�U�|���B�H");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�ֶq�ն����A�̥i�ध��������������H");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("��^��");
			q2 = new JButton("���V��");
			q3 = new JButton("������");
			q4 = new JButton("�ȪZ��");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���h������֪��D�]�O�U�C��ؤƦX���H");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�t��Ҥƪ�");
			q2 = new JButton("���ƦX��");
			q3 = new JButton("�G��ƴ�");
			q4 = new JButton("�G��ƺ�");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("��Ţ��M���֭a�D�n�ǥѮ�������\n�H��o�Ӧa�ϯʥF�������i���H ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("��");
			q2 = new JButton("�K");
			q3 = new JButton("��");
			q4 = new JButton("�[");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�y���B�ʪ��N�y���A�~���O���@�زy���N�y ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�O�ֲy");
			q2 = new JButton("�βy");
			q3 = new JButton("�N��");
			q4 = new JButton("�]�y");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�K�H�T�����ɤ��A�ۦ樮���ت��Z�����X�����H");
			text.setEditable(false); //���D�صL�k�Q�ק�
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�b�x�y���ɤ��A�o�����̰�����h�[?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�L���W�w");
			q2 = new JButton("100��");
			q3 = new JButton("200��");
			q4 = new JButton("150��");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�x�y���ɮɡA�@�y���x��X��?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("1��");
			q2 = new JButton("2��");
			q3 = new JButton("3��");
			q4 = new JButton("4��");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�а�NBA�x�y�W�h���W�w�ӤH�ǳW�X���Y���~�����H");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("����");
			q2 = new JButton("����");
			q3 = new JButton("�|��");
			q4 = new JButton("�T��");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�Ʋy�B�ʤ��A�b�o�y�Τ��ɤ��A�yĲ���ӹL�A�h");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�����~��");
			q2 = new JButton("���o��");
			q3 = new JButton("���s�o�y");
			q4 = new JButton("�ǳW");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�Ʋy������o�y�v���@�����p�󲾰ʦ�m?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("����������@��");
			q2 = new JButton("���P�M�w");
			q3 = new JButton("�нm����");
			q4 = new JButton("�f����");
			
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
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�Ʋy���ɮɤU�C���@���p�O���o���d���覡�N�y���^?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("���o�y");
			q2 = new JButton("���Q�p�y");
			q3 = new JButton("��覩���y");
			q4 = new JButton("����Ƨ���");
			
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
			System.out.println("87�����F");
			
			gameAudio = new Thread() {    
	    		public void run() {
	    			filename = "resources/audio/wrong.mp3";
	    			mp3 = new MP3(filename);
	    			mp3.setLoop(false);
	    			mp3.play();
	    		}
	    	};
	    	gameAudio.start(); 

			JOptionPane.showMessageDialog(this, "�A�����F87",
 					"���~!", JOptionPane.ERROR_MESSAGE);
            
			doubleSix.Calculation(2); //-2
			
		}
		
	}

}
