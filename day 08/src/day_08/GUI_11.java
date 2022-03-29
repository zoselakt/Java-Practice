package day_08;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_11 extends Frame{
	//내부클래스 - 익명클래스
	
	Label label1, label2, laResult;
	Checkbox chb1, chb2, chb3, chb4, chb5, chb6, chb7, chb8;
	CheckboxGroup gp;
	
	Button btn;
	
	public GUI_11(String title){
		super(title);
		
		setBounds(200, 200, 300, 300);
		setLayout(new GridLayout(12, 1));
		btn = new Button("결과");
		
		add(btn, "South");
		
		label1 = new Label("* 당신의 취미생활은? (모두 고르세요)");
		label2 = new Label("* 당신의 연령은? ");
		laResult = new Label("당신은");
		
		chb1 = new Checkbox("독서");
		chb2 = new Checkbox("운동");
		chb3 = new Checkbox("여행");
		chb4 = new Checkbox("영화감상");
		
		gp = new CheckboxGroup();
		
		chb5 = new Checkbox("10대", gp, false);
		chb6 = new Checkbox("20대", gp, false);
		chb7 = new Checkbox("30대", gp, false);
		chb8 = new Checkbox("40대", gp, false);
		
		add(label1);add(chb1); add(chb2); add(chb3); add(chb4);
		add(label2);add(chb5); add(chb6); add(chb7); add(chb8);
		add(laResult);

		btn.addActionListener(new ActionListener() {
			String str = "";
			String str2 = ", 당신의 연령은";
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(chb1.getState()) str += chb1.getLabel();
				 if(chb2.getState()) str += chb2.getLabel();
				 if(chb3.getState()) str += chb3.getLabel();
				 if(chb4.getState()) str += chb4.getLabel();
				                                           ;
				 if(chb5.getState()) str += chb5.getLabel();
				 if(chb6.getState()) str += chb6.getLabel();
				 if(chb7.getState()) str += chb7.getLabel();
				 if(chb8.getState()) str += chb8.getLabel();
				 
				 laResult.setText("결과: 당신의 취미는"+ str + str2 + "입니다.");
			}
		});
	}

	public static void main(String[] args) {
		GUI_11 am = new GUI_11("CheckBox Event Test");
		am.setVisible(true);
		
//메인메서드
	}
//메인클래스
}
/*
class EventHandler implements ActionListener{
	public void ActionPerformed(ActiveEvent e) {
		System.exit(0);
	}
}*/