
public class OpExample {

	public static void main (String[] args) {
		
		// ���׿�����(��������)
		
		// 1. ++
		int a = 10;
		a ++;						// �������� a = a + 1 
		System.out.println("a = " +a);
		++ a;						// �������� a = a + 1
		System.out.println("++ a = " +a);
		
		System.out.println(a ++);	// = 12, a�� ����� �� 
		System.out.println(a);		// = 13, +1�� ��
		
		System.out.println(++ a);	// = 14, +1�� �� �� a�� ���
		
		// 2. --
		int b = 10;
		System.out.println(b --);
		System.out.println(b);
		System.out.println(-- b);

	}
	
}
