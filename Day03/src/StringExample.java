
public class StringExample {

	public static void main(String[] args) {
		
		//��������, ���
		//������Ÿ��(�ڷ���) ������;		<--����

		String name;
		String home;
		String description;
		
		name = "�̴ٿ�";
		home = "���굿";
		
		System.out.println(name+"�� ���� ���굿�̴�.");
		
		description = name + "�� ���� " + home + "�̴�."; //�Ʒ��� ���� ���� ���������
		
		description = String.format("%s�� ���� %s�̴�.", name, home); //�� ���� ȿ���� �� ����.
		
		System.out.println(description);
		
		
		//������Ÿ��(�ڷ���) ������ = ��;	<-- ����� ���ÿ� �ʱ�ȭ
		
		//String name = "�̴ٿ�";
		
		
		//�������� "������"
		
		char c_name = 'A';
		
		//char c_name = discription.charAt(0); 
		
		System.out.println(c_name);
		
	}
	
}
