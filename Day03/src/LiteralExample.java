
public class LiteralExample {

	public static void main(String[] args) {

		// ���ͷ� (�̽�����ũ ������)
		String desc = "�ʴ� ���� ���� ���̳� ��";
		System.out.println(desc);
		
		// �ʴ� ���� ���� ���̳� ��.
		// "��" ���� ���� ���̳� ��. <---���� �ȿ� ū����ǥ�� �־ �����ϰ� ���� \"(ū����ǥ)
		
		desc = "\"��\" ���� ���� ���̳� ��";
		System.out.println(desc);
		
		// "��"
		// ��������		\n(������)
		// ���̳�		�� 	\t(��)
	
		desc = "\"��\"\n ���� ����\n ���̳� \t��";
		System.out.println(desc);
		
	}

}
