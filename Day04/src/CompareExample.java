
public class CompareExample {

	public static void main(String[] args) {
		
		// �񱳿���
		// ��/������ ������ ����
		// >, >, >=. <=
		// == ����
		// != ���� �ʴ�
		// ������� boolean
		
		int a = 10, b = 20, c = 10;
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a >= b));
		
		System.out.println("!(a > b) = " + !(a > b));
		// !�� not�� �ǹ��� (!false == true, !true == false)
	
		System.out.println(" a == b = " + (a == b));
		// a == b �� a�� b�� ���� ���ΰ�
		
		System.out.println(" a != b = " + (a != b));
		// a != b �� a�� b�� ���� ���� ���ΰ�
		
		boolean result = (a >= b);
		System.out.println(result);
		
	}
}
