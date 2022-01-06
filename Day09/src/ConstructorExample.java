
public class ConstructorExample {

	public static void main(String[] args) {
		
		// Ŭ������ ��ü�� ����� �۾� = ������
		Bus bus = new Bus();	//����Ʈ ������
		bus.printMyNum(); 		//�����ڰ� ���� ��� 503������ ������ �޼��� ������ �Ǿ� �ֱ� ������ 200�� ��µȴ�.

		Bus bus2 = new Bus(1000);
		bus2.printMyNum();
		
	}
	
}

// �����ڸ� �����ϴ� ���
// Ŭ������ (�Ű�����) { ... ���� ... }
// this(keyword) ������
class Bus extends Vehicle {
	int num =503;				// �Ӽ�/���/�ʵ�
	
	//�޼������ ������ 1. ������ �޼���� Ŭ���� �̸��� ������. 2. ���ϰ��� ����.
	//----- ������ ���� -------------
//	Bus () {
//		num = 200;
//	}
	
	Bus (int num) {
		super(4);		// == new Vehicle(4) �ٷ� �� �ƹ��� Ŭ������ ������ ȣ��
		this.num = num;
	}
	
//	Bus(double bus_num) {
//		this.num = (int)bus_num;
//	}
	// ----------------------------
	
	void printMyNum() {
		System.out.println(num);
	}
	
}

// Ż �� Ŭ����
class Vehicle {
	int wheelCnt;
	Vehicle(int wheelCnt) {
		this.wheelCnt = wheelCnt;
	}
}