
public class ScopeExample {
	
	static String name = "�ʴ� �ٺ�";
	
	// Scope ���� = �� ������ ������ ������ ��ġ����
	public static void main(String[] args) {
		
		String name = "�̴ٿ�";		//���� name������ ���������� scope�� �ٸ��� ������ �ٸ� ����	
		
		{
			String g_name = "��";
			System.out.println(g_name);
		}
		
		g_name = "�ٺ�";		// Scope�� �޶� ����
		System.out.println(name);	//�������
		
		
	}

}
