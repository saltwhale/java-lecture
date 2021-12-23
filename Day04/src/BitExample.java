
public class BitExample {

	public static void main(String[] args) {
		
		// ��Ʈ����
		
		int a = 10, b = 11; 
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		// 2���� ���
		
		System.out.println("a | b = " + (a | b));
		System.out.println("a & b = " + (a & b));
		System.out.println("a ^ b = " + (a ^ b));
		// ��Ʈ���� ����
		
		System.out.println(Integer.toBinaryString(-1));	//4byte�� 32bit, 32�ڸ��� ���� ���
		System.out.println(Integer.toBinaryString(-2));
		
		// Shift ����
		// >>, <<, >>>
		
		 // ���� Shift -> ��ȣ��Ʈ(ù°��Ʈ)�� ���� �� ��Ʈ�� ä���
		 byte x = 10; 
		 // 00001010 (8bit�� 8�ڸ��� ���� ���)
		 System.out.println("x >> 2 = " + (x >> 2));
		 // 00000010 = 2
		 
		 x = -10;
		 System.out.println("-10 = " + Integer.toBinaryString(x));
		 System.out.println("-10 >> 5 = " + Integer.toBinaryString(x >> 5));
		 // 11111111111111111111111111111111 = -1
		 
		 // ���� Shift -> �� ��Ʈ�� 0���� ä���
		 System.out.println("-10 << 5 = " + Integer.toBinaryString(x << 5));
		 
		 byte z = 1;
		 System.out.println("1 << 7 = " + (z << 7)); 
		 // 00000001 << 7 = 1000000 = -128�� ���;� ������ 
		 //������ ���� �⺻������ int�̹Ƿ� 00000000000000000000000010000000 = 128�� ��µ�
		 System.out.println("1 << 7 = " + (byte)(z << 7)); //��������ȯ�� ��ų ���
		 // 10000000 = -128�� ��µ�
		 
	}
	
}
