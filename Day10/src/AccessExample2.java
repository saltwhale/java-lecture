

public class AccessExample2 {

}

// default�� ����� ���� �ʴ´ٰ� �Ǿ� ������
// ���� ��Ű��, ���� Ŭ���� �ȿ����� ��ӵ� �����ϴ�.

class A {
	
	String name = "���뺸��";
	int age = 10;
	
}

class B extends A {
	
	void printAClassMember() {
		this.name = "���뺸��";
	}
}