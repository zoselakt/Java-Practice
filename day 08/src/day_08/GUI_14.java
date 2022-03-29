package day_08;

import java.awt.*;
import java.awt.event.*;

public class GUI_14 extends Frame{
	// ItemEvent

	CheckboxGroup gp;
	Checkbox chkb1, chkb2, chkb3;
	
	GUI_14(){
		super("ItemEvent Test");
		setLayout(new FlowLayout());
		setBounds(100, 100, 300, 300);
		
		gp = new CheckboxGroup();
		chkb1 = new Checkbox("노란색", gp, true);
		chkb2 = new Checkbox("파란색", gp, false);
		chkb3 = new Checkbox("빨간색", gp, false);
		
		chkb1.addItemListener(new EventHandler());
		chkb2.addItemListener(new EventHandler());
		chkb3.addItemListener(new EventHandler());
		
		add(chkb1);		add(chkb2);		add(chkb3);
		setBackground(Color.yellow);
		setVisible(true);
		
	}
	
		class EventHandler implements ItemListener{
			public void itemStateChanged(ItemEvent ie) {
				Checkbox chkb = (Checkbox)ie.getSource();
				String str = chkb.getLabel();
				
				if(str.equals("노란색")) {
					setBackground(Color.yellow);
					chkb1.setBackground(Color.yellow);
					chkb2.setBackground(Color.yellow);
					chkb3.setBackground(Color.yellow);
				}else if(str.equals("파란색")) {
					setBackground(Color.blue);
					chkb1.setBackground(Color.blue);
					chkb2.setBackground(Color.blue);
					chkb3.setBackground(Color.blue);
				}else {
					setBackground(Color.red);
					chkb1.setBackground(Color.red);
					chkb2.setBackground(Color.red);
					chkb3.setBackground(Color.red);
				}
				
			}
		}
	

	public static void main(String[] args) {
		GUI_14 ie = new GUI_14();
//메인메서드
	}
//메인클래스
}
