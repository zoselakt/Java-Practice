package day_08;

import java.awt.*;
import javax.swing.*;

public class GUI_02 extends Frame{
	public static void main(String[] args) {
		
		// ���̾ƿ� �Ŵ��� (��ġ������): �����̳ʿ� ���Ե� ������Ʈ�� ��ġ�� �ڵ�����
		// �����̳��� ũ�Ⱑ����ǰų� ���ο� ������Ʈ�� �߰��ɶ� ������Ʈ�� ���ġ�ϴ� �ڵ带 �ۼ��� �ʿ䰡 ����,
		
		// ����
		// FlowLayout : �� �� ������� ��ġ
		// BorderLayout: �������� �߾����� ������ ������ ������ ��ġ
		// GridLayout: ����ũ��� ������ �� �� ���� ��ġ
		// CardLayout: ī�带 �׾Ƴ��� ���� ������Ʈ�� �ɰ��� ��ġ
		
		//  new FlowWindow();
		//	new BorderWindow();  // ���� flow�� �ߺ��Ǿ� ���� ���
		//	new GridWindow();
		
//			GUI_02 f = new GUI_02();
//			f.setVisible(true);
//			GUI_02 b = new GUI_02();
//			b.setVisible(true);
//			GUI_02 g = new GUI_02();
//			g.setVisible(true);
			GUI_02 cl = new GUI_02();
			cl.setBounds(300, 300, 200, 200);
			cl.setVisible(true);
			cl.next();
//����
	}
	
//		Button btn1, btn2, btn3, btn4, btn5;
/*
		public GUI_02() {
			
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		setLayout(fl);
		setSize(300, 300);
		
		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		}
*/		
/*
	public GUI_02() {
	BorderLayout bo = new BorderLayout();
		setLayout(bo);
		setSize(300, 300);
		
		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
	}	
*/
/*
	public  GUI_02() {
		GridLayout gl = new GridLayout(3,2, 10,10);
		setLayout(gl);
		setSize(300, 300);
		
		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
	}
	*/

	CardLayout card;
	Panel p1, p2, p3, p4;
		
	public GUI_02() {
		super("card layout �׽�Ʈ");
		card = new CardLayout();
		setLayout(card);
		
		p1 = new Panel();
		p1.setBackground(Color.BLUE);
		p1.add(new Label("car1"));
		
		p2 = new Panel();
		p2.setBackground(Color.CYAN);
		p2.add(new Label("car2"));
		
		p3 = new Panel();
		p3.setBackground(Color.green);
		p3.add(new Label("car3"));
		
		p4 = new Panel();
		p4.setBackground(Color.gray);
		p4.add(new Label("car4"));
		
		add(p1,"1"); 
		add(p2,"2"); 
		add(p3,"3"); 
		add(p4,"4"); 
	}
	public void next() {
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(2000);
			}  catch (Exception e) {
				e.printStackTrace();
			}
			card.next(this);
//			card.previous(this);
		}
	}
//����Ŭ����
}

/*
class FlowWindow extends JFrame{
	FlowWindow() {
		setTitle("flow window");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");

		add(btn1);
		add(btn2);
		add(btn3);
		
		this.setLayout(new FlowLayout());
		setVisible(true);
	}
}	
*/
/*
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

		this.add(btn1, BorderLayout.EAST);
		this.add(btn2, BorderLayout.WEST);
		this.add(btn3, BorderLayout.SOUTH);
		this.add(btn4, BorderLayout.NORTH);
		this.add(btn5, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		setVisible(true);	
	}
}
*/
/*
class GridWindow extends JFrame{
	GridWindow() {
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
*/

