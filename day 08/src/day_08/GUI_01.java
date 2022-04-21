package day_08;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;

		// GUI 프로그래밍
		// AWT(Abstract Window Toolkit) : 자바에서 GUI프로그래밍 하기위해 처음으로 제공한 라이브러리
		// swing : AWT를 대체하기 위해 자바로 작성된 GUI객체
		//
		// 계층
		// 컴포넌트 : 자바에서 gui를 구성하는 요소 / 최상위 계층
		// 컨테이너 : 다른 컴포넌트를 포함할 수 있는 컴포넌트 / window, Frame, panel
		// 나머지 : Button / List / Checkbox / Choice / Label / TextComponent(TextFiled, TextArea)

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
		setTitle("JFrame"); // 제목
		setSize(500,500); // 사이즈
		
		TextField tf1, tf2, tf3, tf4; // 텍스트필드 생성
		
		// 컴포넌트 만들기
		JButton button= new JButton("button"); 
		List lst; //리스트
		JCheckBox box = new JCheckBox("checkbox");
		Choice cho; // 초이스 
		CheckboxGroup boxG = new CheckboxGroup(); // 체크박스 그룹
		Label lab1, lab2; //레이블
		JSlider slide = new JSlider();
		TextArea ta1, ta2; // 텍스트지역 / 여러줄의 text를 입력할때 사용
		
		this.setLayout(new FlowLayout()); //레이아웃 지정 / 왼쪽
		setBackground(new Color(127,255,212)); //this생략가능
		this.add(button);
		
		//버튼
//		button.setLocation(50, 50); // 버튼 위치설정 / 레이아웃 설정시 삭제 
		button.setBackground(Color.green); //버튼 배경 색
		button.setForeground(Color.gray); // 버튼 글자 색 
		this.add(box);
		this.add(slide);
		
		// 리스트
		lst = new List(3, true); // 보이는 화면 3개 
		add(lst);
		lst.add("삼성");
		lst.add("한화");
		lst.add("현대");
		lst.add("대우");
		
		 // 체크박스그룹
		Checkbox ta3, ta4;
		ta3 = new Checkbox("남자", true, boxG);
		add(ta3);
		ta4 = new Checkbox("여자", false, boxG);
		add(ta4);
		
		// 초이스
		cho = new Choice();
		add(cho);
		
		cho.add("Mon");
		cho.add("Tue");
		cho.add("Wed");
		cho.add("Thu");
		cho.add("Fri");
		cho.add("Sat");
		cho.add("Son");
		
		// 레이블
		lab1 = new Label("레이블설정");
		add(lab1);
		lab1.setBackground(Color.cyan);

		lab2 = new Label("레이블2", Label.RIGHT); //레이블 생성과 위치설정
		add(lab2);
		lab2.setBackground(Color.green);
		
		// 텍스트 필드
		tf1 = new TextField();
		add(tf1);
		tf2 = new TextField(30); //컬럼 / 사이즈
		add(tf2);
		tf3 = new TextField("텍스트 필드 3"); 
		add(tf3);
		tf4 = new TextField("텍스트필드 4", 30);
		add(tf4);
		
		// 텍스트area 
		ta1= new TextArea("텍스트area 1", 10, 30, TextArea.SCROLLBARS_NONE); 
		add(ta1);		
			
		setVisible(true); // setVisible로 화면이 보이게 해야한다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료이벤트
	}
	
	//메인	
	public static void main(String[] args) {
		//클래스생성
		GUI_01 gui_01 = new GUI_01();
		// 화면 중간에 띄우기
		
		Toolkit tk = Toolkit.getDefaultToolkit(); //스크린사이즈를 구하기위한 생성자
		Dimension screenSize = tk.getScreenSize();
		
		gui_01.setLocation(screenSize.width/2-150, screenSize.height/2-150);
		
//메인종료
	}
}
