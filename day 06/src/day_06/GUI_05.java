package day_06;

import javax.swing.*;
import java.awt.event.*;

class MenuActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "팝업");// 간단한 알림창
	}}
	
public class GUI_05 extends JFrame{
	GUI_05() {
		setTitle("Menu 만들기");
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		//메뉴생성
		JMenu screenMenu = new JMenu("메뉴바1"); 
		
		//메뉴 기능생성
		screenMenu.add(new JMenuItem("load"));
		screenMenu.add(new JMenuItem("hide"));
		screenMenu.add(new JMenuItem("reshow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		// 메뉴바에 메뉴기능생성
		mb.add(screenMenu);
		mb.add(new JMenu("편집"));
		mb.add(new JMenu("실행"));
		mb.add(new JMenu("도움말"));
		
		
		JMenuItem item = new JMenuItem("팝업");
		item.addActionListener(new MenuActionListener());
		
		screenMenu.add(item);
		mb.add(screenMenu);
		
		// 메뉴바를 현재프레임의 메뉴로 지정
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
			new GUI_05();


	}

}

