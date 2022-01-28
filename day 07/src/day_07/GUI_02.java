package day_07;

import java.awt.*;
import javax.swing.*;

public class GUI_02 {
	public static void main(String[] args) {
		// 배치관리자
		// 종류
		// FlowLayout : 왼 오 순서대로 배치
		// BorderLayout: 동서남북 중앙으로 나누어 지정한 영역에 배치
		// GridLayout: 동일크기로 나누고 왼 오 순서 배치
		// CardLayout: 카드를 쌓아놓은 듯이 컴포넌트를 쪼개어 배치
		new FlowWindow();
	//	new BorderWindow()  // 위에 flow와 중복되어 따로 사용
	//	new GridWindow()
	}
}
class FlowWindow extends JFrame{
	FlowWindow() {
		setTitle("flow window");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		this.setLayout(new FlowLayout());
		setVisible(true);
	}
}	
				
class BorderWindow extends JFrame{
	BorderWindow() {
		setTitle("border window");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");
		JButton btn4= new JButton("btn4");
		JButton btn5= new JButton("btn5");

		this.setLayout(new BorderLayout());
		this.add(btn1, BorderLayout.EAST);
		this.add(btn2, BorderLayout.WEST);
		this.add(btn3, BorderLayout.SOUTH);
		this.add(btn4, BorderLayout.NORTH);
		this.add(btn5, BorderLayout.CENTER);
		
		setVisible(true);
		
	}

class GridWindow extends JFrame{
	Gridwindow() {
		setTitle("grid window");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.setLayout(new GridLayout(2, 2));
		
		setVisible(true);
		
	}
}
}