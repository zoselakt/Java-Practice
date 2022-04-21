package day_08;

import java.awt.*;
import java.awt.event.*;

public class GUI_18 extends Frame{
	Panel pall, p1, p2, pright;
	Button blue, orange, green, plus, minus, erase, eraseAll;
	CanvasDemo cd;	
	
	public GUI_18() {
		super("paint test");
		pall = new Panel(new BorderLayout());
		pall.setBackground(Color.lightGray);
		add(pall, "West");
		
		p1 = new Panel(new GridLayout(3, 1)) {
			public Insets getInsets() {
				return new Insets(10, 10, 10, 10);
			}
		};
		
		pall.add(p1, "North");
		
		blue = new Button();
		blue.setBackground(Color.blue);
		orange = new Button();
		orange.setBackground(Color.orange);
		green = new Button();
		green.setBackground(Color.green);
		
		p1.add(blue); p1.add(orange); p1.add(green);
		
		plus = new Button("+");
		minus = new Button("-");
		erase = new Button("지우기");
		eraseAll = new Button("모두지우기");
		
		p2 = new Panel(new GridLayout(4, 1)) {
			public Insets getInsets() {
				return new Insets(20, 10, 220, 10);
			}
		};
		
		p2.add(plus); p2.add(minus); p2.add(erase); p2.add(eraseAll);
		pall.add(p2, "Center");
		
		pright = new Panel() {
			public  Insets getInsets() {
				return new Insets(60, 20, 20, 20);
			}
		};
		
		pright.setBackground(Color.gray);
		add(pright, "Center");
		
		cd = new CanvasDemo();
		cd.setSize(400, 400);
		cd.setBackground(Color.white);
		pright.add(cd);
		
		blue.addActionListener(new EventHandler());
		orange.addActionListener(new EventHandler());
		green.addActionListener(new EventHandler());
		plus.addActionListener(new EventHandler());
		minus.addActionListener(new EventHandler());
		erase.addActionListener(new EventHandler());
		eraseAll.addActionListener(new EventHandler());
		
		cd.addMouseMotionListener(new EventHandler());
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}); 
	}
	
	class EventHandler extends MouseMotionAdapter implements ActionListener{
		public void mouseDragged(MouseEvent me) {
			cd.x = me.getX();
			cd.y = me.getY();
			cd.repaint();
		}
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			Color btncol = ((Button)obj).getBackground();
			cd.sw = 0;
			
			if(btncol == Color.blue) {
				cd.color = btncol;		
			} else if(btncol == Color.orange){
				cd.color = btncol;						
			} else if (btncol == Color.green) {
				cd.color = btncol;										
			} else if(obj == plus) {
				cd.w++;
				cd.h++;
			} else if(obj == minus) {
				if(cd.w > 5) {
				cd.w--;
				cd.h--;
				}
			} else if(obj == erase) {
				cd.color = cd.getBackground();
			} else if(obj == eraseAll) {
				cd.sw = 1; 
				cd.repaint();
			}
		}
	}

	public static void main(String[] args) {
		GUI_18 ps = new GUI_18();
		ps.setBounds(300, 300, 600, 600);
		ps.setVisible(true);
// 메인메서드
	}
//메인클래스
}

class CanvasDemo extends Canvas{
	int x = 0, y = 0, w = 7, h = 7;
	int sw = 0; 
	Color color = Color.blue;
	
	public void paint (Graphics g) {
		if(sw == 0) {
			g.setColor(color);
//			g.drawString("#", x, y);
			g.fillOval(x, y, w, h);
		} else if(sw == 1) {
			g.clearRect(0, 0, 400, 400);
		}
	}
	public void update(Graphics g) {
		paint(g);
	}
}