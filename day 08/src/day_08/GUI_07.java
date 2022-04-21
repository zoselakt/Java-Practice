package day_08;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.*;

public class GUI_07 extends Frame implements ActionListener{
	// 텍스트 필드 
	
	TextField tf;
	TextArea ta;
	
	public GUI_07(String title) {
		super(title);
	
		tf = new TextField();
		ta = new TextArea();
		
		add(ta, "Center");
		add(tf, "South");
		
		tf.addActionListener(this);
		
		ta.setEditable(false);
		setBounds(200, 200, 300, 300);
		setVisible(true);
		tf.requestFocus();
	}
	
	
	public static void main(String[] args) {
		GUI_07 at = new GUI_07("ActionEvent TextComponent Test");	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText();
		ta.append(str+"\n");
		
		tf.setText("");
		tf.requestFocus();
	}
}
