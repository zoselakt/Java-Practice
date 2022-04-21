package day_08;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI_15 extends Frame implements WindowListener{
	// WindowEvent / Adapter클래스
	
	public GUI_15() {
		/*
		super("window Event test");
		addWindowListener(this);
		*/
		super("window Adapter Test");
		EventHandler eh = new EventHandler();
		addWindowListener(eh);
	}
/*	
 * window 클래스사용
	public void windowActivated(WindowEvent we) {}
	public void windowDeactivated(WindowEvent we) {}
	public void windowOpened(WindowEvent we){}
	public void windowClosed(WindowEvent we){
		System.exit(0);
	}
	
	public void windowClosing(WindowEvent we){}
	public void windowIconufied(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
*/	
	// adapter클래스사용
	class EventHandler extends WindowAdapter{
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		GUI_15 win = new GUI_15();
		win.setBounds(200, 200, 300, 300);
		win.setVisible(true);
//메인메서드		
	}
//메인클래스

	
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
