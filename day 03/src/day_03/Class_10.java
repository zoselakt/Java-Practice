package day_03;

public class Class_10 {
	// ���� Ŭ���� (Subject) 
	// ����Ŭ������ 

	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Class_10() {
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public Class_10(int id, String name) {
		studentID = id;
		studentName= name;
		
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore(); 
		System.out.println(studentName + " �л��� ������ " + total + "���Դϴ�.");
	}

public static void main(String[] args) {
		// name
	Class_10 James = new Class_10();
	James.setKorea(70);
	James.setMath(20);
		
	Class_10 Tomas = new Class_10();
	Tomas.setKorea(70);
	Tomas.setMath(90);
		
	James.showStudentInfo();
	Tomas.showStudentInfo();
}

public class Subject {
	String subjectName;
	int score;
	
	public Subject(String name) {
		subjectName = name;
	}
	
	public void setSubjectName(String name) { 
		subjectName = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}
	
}

}

