package day_06;

import javax.swing.*;
import java.awt.event.*;

class MenuActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "�˾�");// ������ �˸�â
	}}
	
public class GUI_05 extends JFrame{
	GUI_05() {
		setTitle("Menu �����");
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		//�޴�����
		JMenu screenMenu = new JMenu("�޴���1"); 
		
		//�޴� ��ɻ���
		screenMenu.add(new JMenuItem("load"));
		screenMenu.add(new JMenuItem("hide"));
		screenMenu.add(new JMenuItem("reshow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		// �޴��ٿ� �޴���ɻ���
		mb.add(screenMenu);
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		
		
		JMenuItem item = new JMenuItem("�˾�");
		item.addActionListener(new MenuActionListener());
		
		screenMenu.add(item);
		mb.add(screenMenu);
		
		// �޴��ٸ� ������������ �޴��� ����
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
			new GUI_05();


	}

}

