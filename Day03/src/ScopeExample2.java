
public class ScopeExample2 {
	

	static String name = "�ʴ� �ٺ�";
	
	public static void main(String[] args) {
		// ����� ������ �߰�ȣ �������� ������ ��������.
		String name = "��";
		System.out.println(name); //��
		printName();
		
	}
	
	public static void printName() {
		// ����� �������� ������, �ڱ� ���� ���� �߰�ȣ�� üũ�Ѵ�.
		System.out.println(name); //�ʴ� �ٺ�
		
	}

}