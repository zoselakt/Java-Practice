package day_03;

public class Class_Subject {
	// 참조 클래스 (Subject) 
	// 참조클래스는 

	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Class_Subject() {
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public Class_Subject(int id, String name) {
		studentID = id;
		studentName= name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore(); 
		System.out.println(studentName + " 학생의 총점은 " + total + "점입니다.");
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

