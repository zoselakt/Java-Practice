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
		
		myscrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 1, 100); //��ũ�ѹ� ����: �⺻��ġ:50 / ��ũ�ѹ�ũ��:0 / �ּҰ�:1/ �ִ밪:100
		add("South", myscrollbar);
		
		myscrollbar.addAdjustmentListener(this);
		
		myLabel = new Label("��ũ�� �ٸ� �����̼���.");
		myLabel.setBackground(Color.YELLOW);
		add(myLabel, "Center");
				
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		Object obj = ae.getSource();
		if(obj == myscrollbar) {
			myLabel.setText("��ġ: "+myscrollbar.getValue());
		}
	}
	
	public static void main(String[] args) {
		// Adjustment Event(��ũ�ѹ� ������Ʈ)
		
		GUI_08 sb = new GUI_08();
//���θ޼���
	}
//����Ŭ����
}
