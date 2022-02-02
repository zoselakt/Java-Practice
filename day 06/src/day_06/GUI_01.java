package day_06;

import java.awt.FlowLayout;
import javax.swing.*;
		// GUI 프로그래밍
		// AWT : 자바에서 GUI프로그래밍 하기위해 처음으로 제공한 라이브러리
		// swing : AWT를 대체하기 위해 자바로 작성된 GUI객체
		// 컴포넌트 : 자바에서 gui를 구성하는 요소
		// 컨테이너 : 다른 컴포넌트를 포함할 수 있는 컴포넌트

		// 관련 메서드
		// setLocation(int x, int y) : 프레임의 위치지정
		// setSize(int width, int height) : 프레임의 크기지정
		// setIconImage(Image IconImage): 타이틀바에 보여질 아이콘 설정
		// setTitle(String title): 타이틀바의 제목설정
		// setVisible(boolean b): 화면에 표시여부를 설정

		// 프로그래밍 순서
		//1. extends JFrame
		//2. 기본설정: title, size, visible
		
public class GUI_01 extends JFrame{
	GUI_01() {
		setTitle("JFrame");
		setSize(300,300);
		
		// 컴포넌트 만들기
		JButton button= new JButton("button");
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
	}
	public static void main(String[] args) {
		new GUI_01();
	}}
