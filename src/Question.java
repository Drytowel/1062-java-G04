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
	private JFrame qf = new JFrame("���D!!");
	private JPanel topp = new JPanel();
	private JPanel botp = new JPanel();
	private JButton q1; //�w�]������
	private JButton q2;
	private JButton q3;
	private JButton q4;
	
	public void init(int choice) {
		
		if(choice==1) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			botp.setBackground(Color.white); //�]�m�D��panel�I���C��
			
			JTextArea text = new JTextArea("���D: �G��A�ڳ̳߷R�������O�H ");
			text.setEditable(false); //���D�صL�k�Q�ק�

			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("���r�N ");
			q2 = new JButton("�K���N ");
			q3 = new JButton("�ަ�|");
			q4 = new JButton("�ѹ�");
			
			topp.setBackground(Color.white); //�]�m���spanel�I���C��
			topp.add(text);
			
			q1.addActionListener(this);
			q2.addActionListener(this);
			q3.addActionListener(this);
			q4.addActionListener(this);
			
			botp.add(q2);
			botp.add(q1);
			botp.add(q3);
			botp.add(q4);
			
			qf.add(topp, BorderLayout.NORTH);
			qf.add(botp);

			qf.setVisible(true);
		}else if(choice==2) {
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
			
		}else if(choice==3) {
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
			
		}else if(choice==4) {
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
			
		}else if(choice==5) {
			qf.setBounds(400, 300, 500, 300);
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
			
		}else if(choice==7) {
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
			
		}else if(choice==8) {
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
			
		}else if(choice==9) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�ǩh�Q�ѥ[�R�|�A�����������O�����ܦ��� ");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�n��");
			q2 = new JButton("�ɦ�");
			q3 = new JButton("ī�G");
			q4 = new JButton("���a��");
			
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
			
		}else if(choice==10) {
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
			
		}else if(choice==11) {
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
			
		}else if(choice==12) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("�q���O���骺������[1MB]�A�۷��h��[KB]�H");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("1024");
			q2 = new JButton("1000");
			q3 = new JButton("2000");
			q4 = new JButton("2550");
			
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
			
		}else if(choice==14) {
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
			
		}else if(choice==15) {
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
			
		}else if(choice==17) {
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
			
		}else if(choice==18) {
			qf.setBounds(400, 300, 500, 300);
			qf.setUndecorated(true); // �h���������˹�
			qf.getRootPane().setWindowDecorationStyle(JRootPane.NONE); //���ϥΥ���˹���������
			
			qf.setLayout(new BorderLayout(0, 20));
			
			botp.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 15));
			
			JTextArea text = new JTextArea("���ܤH�����D���A���D���F�����l�����A�Τ����űC�������L?");
			text.setEditable(false); //���D�صL�k�Q�ק�
			text.setFont (new Font ("SansSerif", Font.PLAIN, 18));
			
			q1 = new JButton("�n��");
			q2 = new JButton("�Y�v");
			q3 = new JButton("�e��");
			q4 = new JButton("����");
			
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
			
		}else if(choice==19) {
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
			
		}else if(choice==20) {
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
			
		}

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==q1) {
			System.out.println("q1");
			qf.setVisible(false);
		}else if(e.getSource()==q2 || e.getSource()==q3 || e.getSource()==q4) {
			System.out.println("87�����F");
			JOptionPane.showMessageDialog(this, "�A�����F87",
 					"���~!", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
