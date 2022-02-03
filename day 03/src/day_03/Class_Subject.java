package day_03;

public class Class_Subject {
	// ���� Ŭ���� (Subject) 
	// ����Ŭ������ 

	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Class_Subject() {
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public Class_Subject(int id, String name) {
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
	Class_Subject James = new Class_Subject();
	James.setKorea(70);
	James.setMath(20);
		
	Class_Subject Tomas = new Class_Subject();
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

