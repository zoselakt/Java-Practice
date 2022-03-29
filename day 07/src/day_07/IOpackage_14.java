package day_07;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOpackage_14 extends Frame {
	String name = "";
	TextArea ta = new TextArea();
	Panel pa = new Panel();
	TextField tf = new TextField(25);
	Button btnSave = new Button("save");
	
	public IOpackage_14(String name) {
		super("채팅");
		this.name = name;
		
		setBounds(200, 200, 300, 300);
		pa.setLayout(new FlowLayout());
		pa.add(tf);
		pa.add(btnSave);
		
		add(ta, "Center");
		add(pa, "South");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fsave = new FileDialog(IOpackage_14.this, "save", FileDialog.SAVE);
				fsave.setVisible(true);
				
				String fname = fsave.getDirectory() + fsave.getFile();
				fileSave(fname);
			}
		});
		EventHandler eh = new EventHandler();
		ta.addFocusListener(eh);
		tf.addFocusListener(eh);
		tf.addActionListener(eh);
		
		ta.setText("**"+name+"님 채팅 내용**");
		ta.setEditable(false);
		
		setResizable(false);
		setVisible(true);
		tf.requestFocus();
	}
	
	public void fileSave(String fname) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(fname);
			bw = new BufferedWriter(fw);
			bw.write(ta.getText());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try {
					bw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// 채팅내용파일에 저장하기
		if(args.length != 1) {
			System.out.println("하나의 이름만 입력하세요.");
			System.exit(0);
		}
		new IOpackage_14(args[0]);
		
//메인메서드		
	}
	
	class EventHandler extends FocusAdapter implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if("".equals(msg)) return;
			
			ta.append("\r\n"+name + ">" + msg);
			tf.setText("");
		}
		public void focusGained(FocusEvent fe) {
			tf.requestFocus();
		}
	}
//메인클래스
}
