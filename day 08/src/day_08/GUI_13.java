package day_08;

import java.awt.*;
import java.awt.event.*;

public class GUI_13 extends Frame{
	// �˾��޴�
	
	PopupMenu popmenu;
	MenuItem miCopy, miCut, miPaste;
	Label label;
	public GUI_13() {
		super("Popup test");
		setBounds(200, 200, 300, 300);
	
	popmenu = new PopupMenu();
	this.add(popmenu);
	
	label = new Label("", Label.CENTER);
	label.setBackground(Color.yellow);
	add(label, "South");
	
	miCopy = new MenuItem("����");
	miCut = new MenuItem("�߶󳻱�");
	miPaste = new MenuItem("�ٿ��ֱ�");
	
	popmenu.add(miCopy);
	popmenu.add(miCut);
	popmenu.add(miPaste);
	
	EventHandler eh = new EventHandler();
	addMouseListener(eh);
	
	}
	
	class EventHandler implements MouseListener{
		public void mouseClicked (MouseEvent me) {
			Point po = me.getPoint();
			int x = po.x;
			int y = po.y;
			
			label.setText("x = "+x+ ", y=" +y);
			
			if(me.getButton() == me.BUTTON3) {  //button1: ���ʹ�ư, button2: �� ��ư, button3: �����ʹ�ư)
			popmenu.show(GUI_13.this, x, y);
			}
		}
		public void mouseEntered (MouseEvent me) {
			setBackground(Color.yellow);
		}
		public void mouseExited (MouseEvent me) {
			setBackground(Color.blue);
		}
		public void mousePressed (MouseEvent me) {
			setBackground(Color.green);
		}
		public void mouseReleased (MouseEvent me) {
			setBackground(Color.white);
		}
	}
	
	public static void main(String[] args) {
		GUI_13 pop = new GUI_13();
		pop.setVisible(true);
		
		
//���θ޼���
	}
//����Ŭ����
}
