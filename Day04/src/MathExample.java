
public class MathExample {

	public static void main(String[] args) {
		
		//�������
		//+, -, *, /, %
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + b + a + b + b);		// ���� - a(4byte), b(4byte) �� 8byte ���
		System.out.println(10 + 20 + 10 + 20 + 20);	// ���� ���� ���� ��������� ���� 1���� 4byte��
													// �� 20byte�� �ʿ��ϰ� ��
		
		System.out.println( a - b );				// ����
		
		System.out.println( a * b);					// ����
		
		System.out.println("a / b = " + a / b );	// ������
		// ���� 0.5���� �⺻ �������� int�̱� ������ 0�� ����Ѵ�.
		
		int c = 15;
		
		System.out.println("c % a = " + c % a );	// %�� ������ ���� ����Ѵ�.
		System.out.println("c % b = " + c % b );
		
	}
	
}
