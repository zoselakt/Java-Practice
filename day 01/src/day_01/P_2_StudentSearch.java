package day_01;

import java.util.ArrayList;
import java.util.Scanner;

public class P_2_StudentSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Student student1 = new Student("손오공", "1232004");
        Student student2 = new Student("저팔계", "1232005");
        Student student3 = new Student("사오정", "1232006");

        ArrayList <Student>list = new ArrayList<Student>();

        list.add(student1);
        list.add(student2);
        list.add(student3);

        for(Student stu : list){
            System.out.println(stu.getName());
            System.out.println(stu.getNum());
        }
        System.out.println("검색프로그램을 시작합니다. y를 입력해주세요");
        while (true){

            String input = sc.next();

            if(input.equals("y")){
                System.out.println("검색을 시작합니다.");
                boolean flag = false;
                String name = sc.next();

                for (Student stu : list){
                    if (stu.getName().equals(name)){
                        System.out.println("해당하는 학번은:" + stu.getNum());
                        flag = true;
                    }else if(!stu.getName().equals(name)) {
                    	
                        System.out.println("해당하는학생이없습니다. 다시입력해주세요");
                        break;
                    }else{
                        System.out.println("잘못입력하셨습니다.");
                    }
                }
                System.out.println("계속 검색하고싶으면 y, 아니면 n");
            }else if(input.equals("n")){
                System.out.println("종료");
                break;
            }else {
                System.out.println("잘못입력하셨씁니다.!!!!");
                continue;
            }
        }
        System.out.println("프로그램 종료");

	}
}

class Student {

    private String name;
    private String num;

public Student(String name, String num) {
    this.name = name;
    this.num = num;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getNum() {
    return num;
}

public void setNum(String num) {
    this.num = num;
}
}
