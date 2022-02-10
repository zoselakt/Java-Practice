package day_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Z_Practice{
	
		public static int count;
		private int no;
		private String name;
		private boolean gender;
		private String memo;
		private Date writeDate;
		
		public Z_Practice() {
			this("무명씨", false, "없음");
		}
		public Z_Practice(String name, boolean gender, String memo) {
			no = ++count;
			this.name = name;
			this.gender = gender;
			this.memo = memo;
			writeDate = new Date();
		}
		
		public static int getCount() {
			return count;
		}
		public static void setCount(int count) {
			Z_Practice.count = count;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isGender() {
			return gender;
		}
		public void setGender(boolean gender) {
			this.gender = gender;
		}
		public String getMemo() {
			return memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public Date getWriteDate() {
			return writeDate;
		}
		public void setWriteDate(Date writeDate) {
			this.writeDate = writeDate;
		}
		
		@Override
		public String toString() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH: mm:ss.SSS");
			return name +"("+(gender ? "남" : "여") + ") + 님이 " + sdf.format(writeDate) + "에 남긴말" + memo;
		}
		

}
