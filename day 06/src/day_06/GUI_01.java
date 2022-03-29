package day_06;

import java.awt.FlowLayout;
import javax.swing.*;
		// GUI ���α׷���
		// AWT : �ڹٿ��� GUI���α׷��� �ϱ����� ó������ ������ ���̺귯��
		// swing : AWT�� ��ü�ϱ� ���� �ڹٷ� �ۼ��� GUI��ü
		// ������Ʈ : �ڹٿ��� gui�� �����ϴ� ���
		// �����̳� : �ٸ� ������Ʈ�� ������ �� �ִ� ������Ʈ

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
		setTitle("JFrame");
		setSize(300,300);
		
		// ������Ʈ �����
		JButton button= new JButton("button");
		JCheckBox box = new JCheckBox("checkbox");
		JSlider slide = new JSlider();
		JTextField tf= new JTextField("text", 20);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GUI_01();
	}}
