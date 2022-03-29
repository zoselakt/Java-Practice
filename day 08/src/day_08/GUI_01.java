package day_08;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;

		// GUI ���α׷���
		// AWT(Abstract Window Toolkit) : �ڹٿ��� GUI���α׷��� �ϱ����� ó������ ������ ���̺귯��
		// swing : AWT�� ��ü�ϱ� ���� �ڹٷ� �ۼ��� GUI��ü
		//
		// ����
		// ������Ʈ : �ڹٿ��� gui�� �����ϴ� ��� / �ֻ��� ����
		// �����̳� : �ٸ� ������Ʈ�� ������ �� �ִ� ������Ʈ / window, Frame, panel
		// ������ : Button / List / Checkbox / Choice / Label / TextComponent(TextFiled, TextArea)

		// ���� �޼���
		// setLocation(int x, int y) : �������� ��ġ����
		// setSize(int width, int height) : �������� ũ������
		// setIconImage(Image IconImage): Ÿ��Ʋ�ٿ� ������ ������ ����
		// setTitle(String title): Ÿ��Ʋ���� ������
		// setVisible(boolean b): ȭ�鿡 ǥ�ÿ��θ� ����

		// ���α׷��� ����
		//1. extends JFrame
		//2. �⺻����: title, size, visible
		
public class GUI_01 extends JFrame{
	GUI_01() {
		setTitle("JFrame"); // ����
		setSize(500,500); // ������
		
		TextField tf1, tf2, tf3, tf4; // �ؽ�Ʈ�ʵ� ����
		
		// ������Ʈ �����
		JButton button= new JButton("button"); 
		List lst; //����Ʈ
		JCheckBox box = new JCheckBox("checkbox");
		Choice cho; // ���̽� 
		CheckboxGroup boxG = new CheckboxGroup(); // üũ�ڽ� �׷�
		Label lab1, lab2; //���̺�
		JSlider slide = new JSlider();
		TextArea ta1, ta2; // �ؽ�Ʈ���� / �������� text�� �Է��Ҷ� ���
		
		this.setLayout(new FlowLayout()); //���̾ƿ� ���� / ����
		setBackground(new Color(127,255,212)); //this��������
		this.add(button);
		
		//��ư
//		button.setLocation(50, 50); // ��ư ��ġ���� / ���̾ƿ� ������ ���� 
		button.setBackground(Color.green); //��ư ��� ��
		button.setForeground(Color.gray); // ��ư ���� �� 
		this.add(box);
		this.add(slide);
		
		// ����Ʈ
		lst = new List(3, true); // ���̴� ȭ�� 3�� 
		add(lst);
		lst.add("�Ｚ");
		lst.add("��ȭ");
		lst.add("����");
		lst.add("���");
		
		 // üũ�ڽ��׷�
		Checkbox ta3, ta4;
		ta3 = new Checkbox("����", true, boxG);
		add(ta3);
		ta4 = new Checkbox("����", false, boxG);
		add(ta4);
		
		// ���̽�
		cho = new Choice();
		add(cho);
		
		cho.add("Mon");
		cho.add("Tue");
		cho.add("Wed");
		cho.add("Thu");
		cho.add("Fri");
		cho.add("Sat");
		cho.add("Son");
		
		// ���̺�
		lab1 = new Label("���̺���");
		add(lab1);
		lab1.setBackground(Color.cyan);

		lab2 = new Label("���̺�2", Label.RIGHT); //���̺� ������ ��ġ����
		add(lab2);
		lab2.setBackground(Color.green);
		
		// �ؽ�Ʈ �ʵ�
		tf1 = new TextField();
		add(tf1);
		tf2 = new TextField(30); //�÷� / ������
		add(tf2);
		tf3 = new TextField("�ؽ�Ʈ �ʵ� 3"); 
		add(tf3);
		tf4 = new TextField("�ؽ�Ʈ�ʵ� 4", 30);
		add(tf4);
		
		// �ؽ�Ʈarea 
		ta1= new TextArea("�ؽ�Ʈarea 1", 10, 30, TextArea.SCROLLBARS_NONE); 
		add(ta1);		
			
		setVisible(true); // setVisible�� ȭ���� ���̰� �ؾ��Ѵ�.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����̺�Ʈ
	}
	
	//����	
	public static void main(String[] args) {
		//Ŭ��������
		GUI_01 gui_01 = new GUI_01();
		// ȭ�� �߰��� ����
		
		Toolkit tk = Toolkit.getDefaultToolkit(); //��ũ������� ���ϱ����� ������
		Dimension screenSize = tk.getScreenSize();
		
		gui_01.setLocation(screenSize.width/2-150, screenSize.height/2-150);
		
//��������
	}
}
