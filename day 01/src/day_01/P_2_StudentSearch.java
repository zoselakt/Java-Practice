package day_01;

import java.util.ArrayList;
import java.util.Scanner;

public class P_2_StudentSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Student student1 = new Student("�տ���", "1232004");
        Student student2 = new Student("���Ȱ�", "1232005");
        Student student3 = new Student("�����", "1232006");

        ArrayList <Student>list = new ArrayList<Student>();

        list.add(student1);
        list.add(student2);
        list.add(student3);

        for(Student stu : list){
            System.out.println(stu.getName());
            System.out.println(stu.getNum());
        }
        System.out.println("�˻����α׷��� �����մϴ�. y�� �Է����ּ���");
        while (true){

            String input = sc.next();

            if(input.equals("y")){
                System.out.println("�˻��� �����մϴ�.");
                boolean flag = false;
                String name = sc.next();

                for (Student stu : list){
                    if (stu.getName().equals(name)){
                        System.out.println("�ش��ϴ� �й���:" + stu.getNum());
                        flag = true;
                    }else if(!stu.getName().equals(name)) {
                    	
                        System.out.println("�ش��ϴ��л��̾����ϴ�. �ٽ��Է����ּ���");
                        break;
                    }else{
                        System.out.println("�߸��Է��ϼ̽��ϴ�.");
                    }
                }
                System.out.println("��� �˻��ϰ������ y, �ƴϸ� n");
            }else if(input.equals("n")){
                System.out.println("����");
                break;
            }else {
                System.out.println("�߸��Է��ϼ̾��ϴ�.!!!!");
                continue;
            }
        }
        System.out.println("���α׷� ����");

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
