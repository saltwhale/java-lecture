// �Ϲ����� Ŭ���� ����
//���������� class Ŭ������
public class AbstractClassExample {
	public static void main(String[] args) {
		AbstractStudent s = new AbstractSubClass();
		s.printName();
		s.printGrade();
	}
}


//�߻�Ŭ����
//abstract class Ŭ������
abstract class AbstractStudent {
	
	String name = "���뺸��";
	int grade = 3;
	
	void printName () {
		System.out.println("�̸��� " + name + "�Դϴ�.");
	}
	
	abstract void printGrade();
	
}

class AbstractSubClass extends AbstractStudent {
	
	@Override
	void printGrade() {
		System.out.println("�г��� "+grade+"�Դϴ�.");
	}
	
}