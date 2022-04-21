package day_08;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_12 extends Frame{
	//메뉴창만들기
	MenuBar menuBar;
	Menu file, tool, bgColor, fontColor;
	MenuItem miOpen, miSave, miExit, miBlack, miGray, miWhite, miRed;
	Label label;
	
	public GUI_12() {
		super("MenuTest");
		setBounds(200,200,300,300);
	
	menuBar = new MenuBar();
	setMenuBar(menuBar);
	
	file = new Menu("파일");
	menuBar.add(file);
	
	miOpen = new MenuItem("열기");
	file.add(miOpen);
	
	miSave = new MenuItem("저장");
	file.add(miSave);

	file.addSeparator();
	
	miExit = new MenuItem("종료");
	file.add(miExit);
	
	EventHandler eh = new EventHandler();
	miOpen.addActionListener(eh);
	miSave.addActionListener(eh);
	miExit.addActionListener(eh);
	
	
	// 도구 메뉴
	tool = new Menu("도구");
	menuBar.add(tool);
	
	bgColor = new Menu("배경색");
	tool.add(bgColor);
	
	miBlack = new MenuItem("검정");
	bgColor.add(miBlack);
	
	miGray = new MenuItem("회색");
	bgColor.add(miGray);
	
	miBlack.addActionListener(eh);
	miGray.addActionListener(eh);

	fontColor = new Menu("글자색");
	tool.add(fontColor);
	
	miWhite = new MenuItem("흰색");
	fontColor.add(miWhite);
	
	miRed = new MenuItem("빨강");
	fontColor.add(miRed);
	
	miWhite.addActionListener(eh);
	miRed.addActionListener(eh);
	
	label = new Label("메뉴 테스트", Label.CENTER);
	add(label, "South");
	
//GUI메서드
	}
	class EventHandler implements ActionListener{
		Color bgcolor = Color.white;
		Color fcolor = Color.white;
		
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			
			if(obj == miOpen) {
				FileDialog fd = new FileDialog(GUI_12.this, "Open");
				fd.setVisible(true);
			} else if(obj == miSave) {
				FileDialog fd = new FileDialog(GUI_12.this, "Save");
				fd.setVisible(true);
			} else if(obj == miExit) {
				System.exit(0);
			} else if(obj == miBlack) {
				bgcolor = Color.black;
			} else if(obj == miGray) {
				bgcolor = Color.gray;
			} else if(obj == miWhite) {
				fcolor = Color.white;
			} else if(obj == miRed) {
				fcolor = Color.red;
			}
			setBackground(bgcolor);
			label.setBackground(bgcolor);
			label.setForeground(fcolor);
		}
	}
	
	public static void main(String[] args) {
		GUI_12 mt = new GUI_12();
		mt.setVisible(true);
		
		
//메인메서드
	}
//메인클래스
}
