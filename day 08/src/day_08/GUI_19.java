package day_08;

import java.awt.*;
import java.awt.event.*;

public class GUI_19 extends Frame implements ActionListener{
	Button open;
	Dimension d;
	SubFrame sub;
	
	public GUI_19() {
		super("��â���� �׽�Ʈ");
		setSize(500, 500);
		d = getSize();
		setLayout(null); //null�� �����ϸ� ������ġ����
		
		open = new Button("��â����");
		add(open);
		open.setSize(100, 50);
		Dimension bd = open.getSize();
		
		int x = d.width / 2 - bd.width / 2;
		int y = d.height / 2 - bd .height / 2;
		
		open.setLocation(x, y);
		setVisible(true);
	
		open.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}); 
	}
	
	public void actionPerfomed(ActionEvent ae) {
//		Object obj = ae.getSource();
//		if(obj == open) {
			final SubFrame sub = new SubFrame();
			sub.setSize(200, 200);
			sub.setVisible(true);
			
			int r =(int)(Math.random()*256);
			int g =(int)(Math.random()*256);
			int b =(int)(Math.random()*256);
			
			sub.setBackground(new Color(r, g, b));
			sub.setLocation(d.width, 0);
			
			sub.addWindowListener(new WindowAdapter() {				
				public void windowClosing(WindowEvent we) {
					sub.setVisible(false);
					sub.dispose();
					//System.exit(0);
				}
			}); 
			
			sub.setVisible(true);
		}
//	}
	
	public static void main(String[] args) {
		GUI_19 sf = new GUI_19();
		
		
//���θ޼���
	}
//����Ŭ����

	@Override
	public void actionPerformed(ActionEvent e) {
		actionPerfomed(e);
	}
}

class SubFrame extends Frame implements ActionListener{
	int r=255, g=255, b=255;
	Button btn;
	
	public SubFrame() {
		setLayout(null);
		setBackground(new Color(r,g,b));
		btn = new Button("����ٲٱ�");
		btn.setSize(100, 50);
		btn.setLocation(50, 50);
		add(btn);
		
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		int r =(int)(Math.random()*256);
		int g =(int)(Math.random()*256);
		int b =(int)(Math.random()*256);
		setBackground(new Color(r,g,b));
	}
}