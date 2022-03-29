package day_08;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI_03 extends Frame implements MouseListener{
	// 이벤트처리
	
	// Event Source: 컴포넌트,컨테이너 (button,pannel)
	// Event Handler: 이벤트를 처리해 주는 클래스를 의미한다. / 이벤트가 발생했을 때 실행될 코드를 구현해 놓은 클래스
	// Event Listener: 이벤트 소스와 이벤트핸들러를 연결

	// 이벤트 종류
	// Action- void actionPerformed(ActionEvent) = Action 발생시
	// key- void KeyPressed(키 누를때) / void KeyReleased(눌러진 키를 뗄때) / void keyTyped(유니코드입력시)
	// mouse- void MousePressed(마우스버튼이 눌릴때)/ voidMouseReleased(눌러진 마우스땔떼)/ void MouseClicked (클릭시)
	// 		  void MouseEntered(마우스가 컴포넌트에 올라올떄) / void MouseExisted(마우스가 컴포넌트에 벗어날때)

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	Panel p5 = new Panel();
	Panel p6 = new Panel();
	
	CardLayout card = new CardLayout();
	
	public GUI_03() {
		super("Event Test");
		setLayout(card);
		setBounds(200, 200, 300, 300);
		
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.CYAN);
		p3.setBackground(Color.GREEN);
		p4.setBackground(Color.magenta);
		p5.setBackground(Color.ORANGE);
		p6.setBackground(Color.PINK);
		
		add("1", p1);
		add("2", p2);
		add("3", p3);
		add("4", p4);
		add("5", p5);
		add("6", p6);
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
		p6.addMouseListener(this);
	}
	
	public void mouseClicked (MouseEvent e) {
		card.next(this);
	}	
	public void mouseEntered (MouseEvent e){}
	public void mouseExited  (MouseEvent e){}
	public void mousePressed (MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	
	public static void main(String[] args) {
		GUI_03 ev = new GUI_03();
		ev.setVisible(true);
		
//메인메서드
	}
//메인클래스
}
