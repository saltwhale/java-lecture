
// Application ���� ��Ÿ�� ����Ʈ
public class Application {
	
	public static void main(String[] args) {
		Person p = new Person();			//�� �� �տ� ���̴� ��(����ȭ) = �޸𸮿� �ö�� �ִ�
		p.name = "���뺸��";					//��ü�� �ִ� �Ӽ�(�ʵ�)�� �����Ϸ��� . �� �ʿ��ϴ�.
		p.sayHello();
		
		Person p2 = new Person();
		p.name = "���θ�";
		p.sayHello();
		
		// �ּҰ� �񱳷� ���� �� ����.
		if(p == p2) {
			System.out.println("p�� p2�� ���ƿ�.");
		} else {
			System.out.println("p�� p2�� ���� �ʾƿ�.");
		}
		
		// ��ü ��ü�� ���ϴ� ���(���� Ŭ���� ����̳�?) = instanceof ������.
		if (p instanceof Person) {
		// ���೻��
		}
		
		if (p2 instanceof Person) {
		// ���೻��
		}
		
	}

}


// class ����
// [����������] class Ŭ������ { // ���� }

class Person1 {
	
	String name;							//�Ӽ� (�ʵ�)
	
	public void sayHello() {				//�ൿ(�ż���)
		System.out.println(name + "�Դϴ�. �ȳ��ϼ���.");
		
	}
	
}