package day_08;

import java.awt.*;
import java.awt.event.*;

public class GUI_16 extends Frame implements MouseMotionListener{
	
	public GUI_16() {
		super("paint test");
		setBounds(200, 200, 300, 300);
		setVisible(true);
		
		addMouseMotionListener(new EventHandler());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}); 
	}
	//paint()
	public void paint(Graphics g) {
		g.setFont(new Font("����", Font.BOLD, 20));
		g.drawString("�ݰ����ϴ�",	10, 100); // ������ ����Ѵ�. fill�� �������� ä�� ����Ѵ�.
		
		g.drawOval(20, 100, 200, 200);
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 200, 200);
		
		g.drawRect(50, 50, 50, 50);
		g.setColor(Color.red);
		g.drawRoundRect(50, 50, 50, 50, 10, 10);
		
		g.fillPolygon(new int [] {20,40,80}, new int[] {50,50,100}, 3);
	}
	//repaint()
	int x=0, y=0;
	class EventHandler extends MouseMotionAdapter{
		public void MouseDragged(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			repaint();
		}
	}
//	public void MouseMoved(MouseEvent me) {	}
	
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void repaint(Graphics g) {
		g.drawString("���콺�� �����̼���", 20, 50);
		g.drawString("#", x, y);
	}
	
	public static void main(String[] args) {
		// �׷��Ƚ�(Graphics)
		// ���ڸ� ����ϰų� ����, ��, ���� �׸��� ��� �� �׷���ó���� ���� ��ü
		// paint() / repaint() / update() �޼ҵ�
		
		GUI_16 pe = new GUI_16();
		
		
//���θ޼���
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		mouseDragged(e); 
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	}
//����Ŭ����
}
