package day_08;

import java.awt.*;
import java.awt.event.*;

public class GUI_17 extends Frame{
	DemoCanvas demoCanvas;
	
	public GUI_17() {
		super("canvas test");
		setLayout(new FlowLayout());
		setBounds(200, 200, 500, 500);
		setVisible(true);
		
		demoCanvas = new DemoCanvas();
		demoCanvas.setSize(300, 300);
		add(demoCanvas);
		demoCanvas.setBackground(Color.yellow);
		
		demoCanvas.addMouseMotionListener(new EventHandler());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}); 
	}	
	class EventHandler extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent me) {
			demoCanvas.x = me.getX();
			demoCanvas.y = me.getY(); 
			demoCanvas.repaint();
		}
	}
	public static void main(String[] args) {
		// canvas 클래스
		
		GUI_17 ce = new GUI_17();
		
		
//메인메서드
	}
//메인클래스
}

class DemoCanvas extends Canvas{
	int x = 50, y=50;
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawString("@", x, y);
	}
}