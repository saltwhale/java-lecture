
public class Application5 {

}


// 2. �޼��� �����ε�(Ȯ��)
// ���� �̸��� ���� �޼����̸鼭 �Ű������� �ڷ���, ����, ���� �� �ϳ� �̻��� �޶�� ��
class Bus {
	
	int wheel = 4;
	
	void pushButton() {
		System.out.println("������");
	}
	
	//�޼��� ���� �����ϳ� �������� �ൿ�� �� �� �ֵ��� ����� �ִ� ��
	void pushButton(int count) {
		if(count <= 3) {
			System.out.println("������");
		} else {
			System.out.println("�׸� ���� �̻�����");
		}
		
	}
	
}