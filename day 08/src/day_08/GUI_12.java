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
	//�޴�â�����
	MenuBar menuBar;
	Menu file, tool, bgColor, fontColor;
	MenuItem miOpen, miSave, miExit, miBlack, miGray, miWhite, miRed;
	Label label;
	
	public GUI_12() {
		super("MenuTest");
		setBounds(200,200,300,300);
	
	menuBar = new MenuBar();
	setMenuBar(menuBar);
	
	file = new Menu("����");
	menuBar.add(file);
	
	miOpen = new MenuItem("����");
	file.add(miOpen);
	
	miSave = new MenuItem("����");
	file.add(miSave);

	file.addSeparator();
	
	miExit = new MenuItem("����");
	file.add(miExit);
	
	EventHandler eh = new EventHandler();
	miOpen.addActionListener(eh);
	miSave.addActionListener(eh);
	miExit.addActionListener(eh);
	
	
	// ���� �޴�
	tool = new Menu("����");
	menuBar.add(tool);
	
	bgColor = new Menu("����");
	tool.add(bgColor);
	
	miBlack = new MenuItem("����");
	bgColor.add(miBlack);
	
	miGray = new MenuItem("ȸ��");
	bgColor.add(miGray);
	
	miBlack.addActionListener(eh);
	miGray.addActionListener(eh);

	fontColor = new Menu("���ڻ�");
	tool.add(fontColor);
	
	miWhite = new MenuItem("���");
	fontColor.add(miWhite);
	
	miRed = new MenuItem("����");
	fontColor.add(miRed);
	
	miWhite.addActionListener(eh);
	miRed.addActionListener(eh);
	
	label = new Label("�޴� �׽�Ʈ", Label.CENTER);
	add(label, "South");
	
//GUI�޼���
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
		
		
//���θ޼���
	}
//����Ŭ����
}
