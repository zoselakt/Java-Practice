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
		g.setFont(new Font("굴림", Font.BOLD, 20));
		g.drawString("반갑습니다",	10, 100); // 선으로 출력한다. fill은 선색으로 채워 출력한다.
		
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
		g.drawString("마우스를 움직이세요", 20, 50);
		g.drawString("#", x, y);
	}
	
	public static void main(String[] args) {
		// 그래픽스(Graphics)
		// 문자를 출력하거나 도형, 선, 색을 그리는 기능 등 그래픽처리를 위한 객체
		// paint() / repaint() / update() 메소드
		
		GUI_16 pe = new GUI_16();
		
		
//메인메서드
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		mouseDragged(e); 
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	}
//메인클래스
}
