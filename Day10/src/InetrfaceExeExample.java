
public class InetrfaceExeExample {
	
	public static void main(String[] args) {
	
		//1. �߻�Ŭ������ new�� ��ü���� �Ұ���
		// ������ ������ ��� �� �Ǿ� �ֱ� �����̴�.
		//2. �������̽��� new�� ��ü �����Ұ���
		// ������ a) interface�� class�� �ƴ϶� ��ü ������ �Ұ���
		// b) ������ ���
		// !) interface�� ��űԾ��� ����� ��
		
		InterfaceExample im = new SKInternet();
		InterfaceExample im2 = new LGInternet();
		
		im.connect();
		im2.connect();
		
		//ImCC�� Father�� ���� Ŭ�����̱� ������ FatherŬ������ ���� �� �ִ�.
		Father fa = new ImCC();
		AA aa = new ImCC();
		BB bb = new ImCC();
		CC cc = new ImCC();
		
	}

}

class Father {
	
}
class ImCC extends Father implements AA, BB, CC {
	//�������̽��� ���߱���(���)�� �����ϴ�.
	
	//�� �������̽��� �ִ� �߻�޼��带 ��� ������ ���� ������ ������ ����.
	public void aa() {
	}
	
	public void bb() {
	}
	
	public void cc() {
	}
	
}


interface AA {
	void aa();			//�߻�޼��� ����
}
interface BB {
	void bb();
} //extends AA{}
//�������̽������� ������ extends�� ���
interface CC {
	void cc();
}//extends BB{}