//final
//Ŭ����, �޼���, �Ӽ����� ���� �� �ִ�.
// ex) Ŭ������ final = ��� �� �ϰڴ�.
// ex) �޼��忡 final = �������̵��� ������� �ʰڴ�.
// ex) �Ӽ��� final = ���� ������ �� ���� �ϰڴ�.

// ������
// final class Ŭ������
// final ����Ÿ�� �޼���� (�Ű�����)
// final ������Ÿ�� ������ = ��

public class FinalExample {
	public static void main(String[] args) {
		A1 ao = new B1();
		ao.printName();
	}
	
}

//-------- final class����
//final class AO {
//	String name = "���뺸��";
//}
//
//final class�� ����� �� �� �����Ƿ� ������ �߻� ��Ų��.
//class BO extends AO {}
//-------------------------

//-----------------final �Ӽ�/���� ����
//final �Ӽ�/������ �� �� �ʱ�ȭ(���� �� ����) ������ �Ұ����ϴ�.
//�ٸ� �����ڸ� ���� �ʱ�ȭ�� ��츸 ���ܷ� �Ѵ�.
class AO {
	final int grade = 10;
	//final int grade;
	//AO(int grade) {
	//	this.grade = grade;
	//}
}

class BO extends AO {
	void changeGrade() {
		//���� ���� �Է��ϴ� ���� �Ұ����ϴ�.
		//this.grade = 100;
		//new AO(1);
	}
}

//------final �޼��� ����------------
class A1 {
	void printName() {
		System.out.println("���뺸��");
	}
}

class B1 extends A1 {
	final void printName() {
		System.out.println("���θ�");
	}
}

class C1 extends B1 {
	//void printName() {}
	//�ƹ��� B1���� �޼��尡 final�̹Ƿ�, �޼��� ��ø(�������̵�)�� �� �� ����. 
}
//-------------------------------


//��� ����
//final static ������Ÿ�� �����
// ex) final static double PI = 3.141592;
// ex) static final double PI = 3.141592;
// ����� ��� �빮�ڷ� ���� ���� ��Ģ���� �Ѵ�.