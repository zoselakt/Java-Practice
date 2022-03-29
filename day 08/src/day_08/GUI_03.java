package day_08;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI_03 extends Frame implements MouseListener{
	// �̺�Ʈó��
	
	// Event Source: ������Ʈ,�����̳� (button,pannel)
	// Event Handler: �̺�Ʈ�� ó���� �ִ� Ŭ������ �ǹ��Ѵ�. / �̺�Ʈ�� �߻����� �� ����� �ڵ带 ������ ���� Ŭ����
	// Event Listener: �̺�Ʈ �ҽ��� �̺�Ʈ�ڵ鷯�� ����

	// �̺�Ʈ ����
	// Action- void actionPerformed(ActionEvent) = Action �߻���
	// key- void KeyPressed(Ű ������) / void KeyReleased(������ Ű�� ����) / void keyTyped(�����ڵ��Է½�)
	// mouse- void MousePressed(���콺��ư�� ������)/ voidMouseReleased(������ ���콺����)/ void MouseClicked (Ŭ����)
	// 		  void MouseEntered(���콺�� ������Ʈ�� �ö�Ë�) / void MouseExisted(���콺�� ������Ʈ�� �����)

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	Panel p5 = new Panel();
	Panel p6 = new Panel();
	
	CardLayout card = new CardLayout();
	
	public GUI_03() {
		super("Event Test");
		setLayout(card);
		setBounds(200, 200, 300, 300);
		
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.CYAN);
		p3.setBackground(Color.GREEN);
		p4.setBackground(Color.magenta);
		p5.setBackground(Color.ORANGE);
		p6.setBackground(Color.PINK);
		
		add("1", p1);
		add("2", p2);
		add("3", p3);
		add("4", p4);
		add("5", p5);
		add("6", p6);
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
		p6.addMouseListener(this);
	}
	
	public void mouseClicked (MouseEvent e) {
		card.next(this);
	}	
	public void mouseEntered (MouseEvent e){}
	public void mouseExited  (MouseEvent e){}
	public void mousePressed (MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	
	public static void main(String[] args) {
		GUI_03 ev = new GUI_03();
		ev.setVisible(true);
		
//���θ޼���
	}
//����Ŭ����
}
