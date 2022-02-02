package day_06;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

		// 이벤트처리
		// 이벤트리스너
		// 이벤트 종류
		// Action- void actionPerformed(ActionEvent) = Action 발생시
		// key- void KeyPressed(키 누를때) / void KeyReleased(눌러진 키를 뗄때) / void keyTyped(유니코드입력시)
		// mouse- void MousePressed(마우스버튼이 눌릴때)/ voidMouseReleased(눌러진 마우스땔떼)/ void MouseClicked (클릭시)
		// 		  void MouseEntered(마우스가 컴포넌트에 올라올떄) / void MouseExisted(마우스가 컴포넌트에 벗어날때)
class Listener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource(); // 이벤트발생한 컴포넌트
			button.setText("버튼 클릭"); // 버튼 문자열 재지정
	}}
public class GUI_03 extends JFrame{
	GUI_03() {
		setTitle("JFrame");
		setSize(300, 300);
		
		JButton button = new JButton("button");
		JCheckBox box = new JCheckBox("checkbox");
		JSlider slide = new JSlider();
		JTextField tf= new JTextField("text", 20);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new Listener1()); // 버튼 컴포넌트에 액션이벤트 리스너 달기
	}
	public static void main(String[] args) {
		new GUI_03();
	}
}
