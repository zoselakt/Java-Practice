package day_08;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class GUI_08 extends Frame implements AdjustmentListener{
	Scrollbar myscrollbar;
	Label myLabel;
	
	public GUI_08() {
		super("Scrollbar test");
		setBounds(200, 200, 300, 300);
		
		myscrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 1, 100); //스크롤바 설정: 기본위치:50 / 스크롤바크기:0 / 최소값:1/ 최대값:100
		add("South", myscrollbar);
		
		myscrollbar.addAdjustmentListener(this);
		
		myLabel = new Label("스크롤 바를 움직이세요.");
		myLabel.setBackground(Color.YELLOW);
		add(myLabel, "Center");
				
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		Object obj = ae.getSource();
		if(obj == myscrollbar) {
			myLabel.setText("위치: "+myscrollbar.getValue());
		}
	}
	
	public static void main(String[] args) {
		// Adjustment Event(스크롤바 컴포넌트)
		
		GUI_08 sb = new GUI_08();
//메인메서드
	}
//메인클래스
}
