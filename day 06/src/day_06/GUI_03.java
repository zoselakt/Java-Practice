package day_06;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

		// �̺�Ʈó��
		// �̺�Ʈ������
		// �̺�Ʈ ����
		// Action- void actionPerformed(ActionEvent) = Action �߻���
		// key- void KeyPressed(Ű ������) / void KeyReleased(������ Ű�� ����) / void keyTyped(�����ڵ��Է½�)
		// mouse- void MousePressed(���콺��ư�� ������)/ voidMouseReleased(������ ���콺����)/ void MouseClicked (Ŭ����)
		// 		  void MouseEntered(���콺�� ������Ʈ�� �ö�Ë�) / void MouseExisted(���콺�� ������Ʈ�� �����)
class Listener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource(); // �̺�Ʈ�߻��� ������Ʈ
			button.setText("��ư Ŭ��"); // ��ư ���ڿ� ������
	}}
public class GUI_03 extends JFrame{
	GUI_03() {
		setTitle("JFrame");
		setSize(300, 300);
		
		JButton button = new JButton("button");
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
		button.addActionListener(new Listener1()); // ��ư ������Ʈ�� �׼��̺�Ʈ ������ �ޱ�
	}
	public static void main(String[] args) {
		new GUI_03();
	}
}
