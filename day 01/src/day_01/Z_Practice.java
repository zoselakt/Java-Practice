package day_01;

import java.util.Date;

public class Z_Practice{
		
		private int no;
		private String name;
		private boolean gender;
		private String memo;
		private Date writeDate;
		
		public Z_Practice() {
			System.out.println("�⺻�����ڰ� ����˴ϴ�.");
		}
		public Z_Practice(String name, boolean gender, String memo) {
			this.name = name;
			this.gender = gender;
			this.memo = memo;
		}
		@Override
		public String toString() {
			return name + "(" + (gender ? "��" : "��") + ")�� ���主" + memo;
		}

	
}