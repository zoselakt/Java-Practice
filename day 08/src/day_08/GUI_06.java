package day_08;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.*;

public class GUI_06 extends Frame implements ActionListener{
	// ActionEvent
	// 버튼 클릭하면 색 변경되는 이벤트
	
	Button btn[] = new Button[4];
	String str[] = {"Green", "Blue", "Cyan", "Red"};
	Color cl = new Color(240, 240, 240);
	
	public GUI_06() {
		super("ActionEvent Test 2");
		setLayout(new GridLayout(2, 2, 20, 20));
		setBounds(200, 200, 300, 300);
		
		for(int i=0; i<btn.length; i++) {
			btn[i] = new Button(str[i]);
			this.add(btn[i]);
			btn[i].addActionListener(this);
		}
	}
	
	
	public static void main(String[] args) {
		GUI_06 ab2 = new GUI_06();
		ab2.setVisible(true);
//메인메서드
	}
//메인클래스

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("Green")) {
			if(btn[0].getBackground().equals(Color.GREEN)) {
				btn[0].setBackground(cl);
				setBackground(Color.white);
			} else {
			btn[0].setBackground(Color.GREEN);
			setBackground(Color.GREEN);
			}
		}else if(str.equals("Blue")) {
			if(btn[1].getBackground().equals(Color.blue)) {
				btn[1].setBackground(cl);
				setBackground(Color.white);
			} else {
			btn[1].setBackground(Color.blue);
			setBackground(Color.blue);
			}
		} else if(str.equals("Cyan")) {
			if(btn[2].getBackground().equals(Color.cyan)) {
				btn[2].setBackground(cl);
				setBackground(Color.white);
			} else {
			btn[2].setBackground(Color.CYAN);
			setBackground(Color.CYAN);
			}
		} else if(str.equals("Red")) {
			if(btn[3].getBackground().equals(Color.red)) {
				btn[3].setBackground(cl);
				setBackground(Color.white);
			}else {
			btn[3].setBackground(Color.RED);
			setBackground(Color.RED);
			}
		}
	}
}
