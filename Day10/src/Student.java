import kr.education.StudentExample;

class Student extends StudentExample{
//StudentExample�� ���
	
	String name = "���뺸��";
	int grade = 3;
	void printMySelf() {
		System.out.println(this.age);
		//StudentExample�� ����� �޾����� age�� ���;� �ϴµ�
		//private�� �����Ǿ� �־� ��� ���� ����(private, default�� ���x)
		System.out.println("�� �̸��� "+name+"�̰�, "+grade+"�г� �Դϴ�.");
	}
}
