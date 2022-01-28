package day_07;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

// ���콺 GUI

public class GUI_04 extends JFrame{
	JPanel jp = new JPanel();
	JLabel la;
	GUI_04(){
		setTitle("mouse �̺�Ʈ â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		jp.addMouseListener(new MouseListener1());
		jp.addMouseMotionListener(new MouseListener1());
		la=new JLabel("���콺�� �÷�������.");
		jp.add(la);
		setSize(300, 300);
		setVisible(true);
	}
	class MouseListener1 implements MouseListener, MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		la.setText("Mouse Dragged (" + e.getX()+","+e.getY()+")");
	}
	@Override
	public void mouseMoved(MouseEvent e) {		
		la.setText("Mouse Moved (" + e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		la.setText("���콺 Ŭ��Ƚ��:"+ e.getClickCount());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JPanel p =(JPanel)e.getSource();
		p.setBackground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JPanel p =(JPanel)e.getSource();
		p.setBackground(Color.yellow);
	}

	

		
}

	public static void main(String[] args) {
			new GUI_04();
	}
}