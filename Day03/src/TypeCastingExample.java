
public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		// ������ ������ Ÿ��
		
		// ����� ����ȯ
		int a = 10;		// 4 bytes
		short b = (short)a; // int���� short�� ���� ũ���� �ڷ����̱� ������ ��������ȯ (short)�� �Է������ ��
		System.out.println(b);
		
		// ������ ����ȯ
		short c = 100;	// 2 bytes
		int d = c;		// short���� int�� ū ũ���� �ڷ����̱� ������ ������ ���� �ʾư� ����ȯ�� ����
		System.out.println(d);
		
		//byte x = 128;	// 1 byte = -127 ~ 128 �� ������ ������ �־ 128�� ������ ����� ����
		
		//Example
		int a1 = 128;
		byte x1 = (byte)a1;		// ������ ������ ���� ������ ��Ÿ�� ������ �߻��ϰ� �ȴ�.
		System.out.println(x1);	// ���� ǥ������� ������ ���α׷��� ���ư��� �ʴ´�.(������ �� -128 error)
		
		double xa = 3.6441;		// double�� ������
		int xb = (int)xa;		// int�� �Ǽ���
		System.out.println(xb);	// ��������ȯ�� �� ��� �Ҽ��� �� ���� ����
		
		int ya = 10;
		double yb = ya;
		System.out.println(yb);	// ����������ȯ�� ��� �Ǽ����� ���������� ��ȯ�ؼ� ����Ѵ�.
		
	}

}
