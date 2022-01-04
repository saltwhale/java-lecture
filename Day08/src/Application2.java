

public class Application2 {
	
	public static void main(String[] args) {
//		Korean k = new Korean();
//		k.name = "���� �ѱ���";
//		k.sayHello();							// Person �� ���� �Ӽ��� Korean�� ��ӵ�
		
		
		Person p = new Japanese();				
		// is a ���� Japanese is a Person -> ���� Person�� �ƴ϶� ���� ������ ����
		p.name = "�����";
		p.sayHello();	// Person�� �޼��尡 �ƴ϶� Japanese�� �޼��尡 �����(������)  
		
	}

}


// class ����
// [����������] class Ŭ������ { // ���� }

class Person {
	
	String name;							//�Ӽ� (�ʵ�)
	
	public void sayHello() {				//�ൿ(�ż���)
		System.out.println(name + "�Դϴ�. �ȳ��ϼ���.");
		
	}
	
}

// ����� extends [Class��]
class Korean extends Person {
	public void sayHello() {
		System.out.println(name + "�Դϴ�. �ȳ��ϼ���.");
	}
}

class Japanese extends Person {
	public void sayHello() {
		System.out.println(name + "�Դϴ�. ������.");
	}
}


class Chinese extends Person {
	public void sayHello() {
		System.out.println(name + "�Դϴ�. ���Ͽ�.");
	}
}