package day_03;

public class Class_02 {
	public static void main(String[] args) {
		class Member{
			static String centerName ="Hello";
			String name;
			int age;
			String gender;
			
			void info() {
				System.out.println("center Name:" + centerName);
				System.out.println("Name:" + name);
				System.out.println("age:" + age);
				System.out.println("gender:" + gender); }
}
		
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		member1.name="��ö��";
		member1.age=32;
		member1.gender="����";
		
		member2.name="���ȣ";
		member2.age=28;
		member2.gender="����";
		
		member3.name="�̿���";
		member3.age=24;
		member3.gender="����";
		
		member4.name="��õ";
		member4.age=32;
		member4.gender="����";
		
		Member.centerName="Bye";
		System.out.println("member1------");
		member1.info();
		System.out.println("member2------");
		member2.info();
		System.out.println("member3------");
		member3.info();
		System.out.println("member4------");
		member4.info();
//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");
// ��üŸ�� �迭
		Animal animals[]= new Animal[3];
		for(int i =0; i<3; i++) {
		animals[i] = new Animal();
		}
		
		animals[0].kind="�����";
		animals[0].name="����";
		animals[0].age=1;
		
		animals[1].kind="������";
		animals[1].name="����";
		animals[1].age=3;
		
		animals[2].kind="�����";
		animals[2].name="����";
		animals[2].age=1;

		for(int i=0; i<3; i++) {
			animals[i].info(); }
}}

class Animal{
String kind;
String name;
int age;
void info() {
	System.out.println("kind:" + kind);
	System.out.println("name:" + name);
	System.out.println("age:" + age);
}}

		
		
		



