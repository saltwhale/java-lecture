
public class AssignExample {

	public static void main(String[] args) {
		
		// �Ҵ翬���� �쿡�� �·�
		// ������ ����/���, ������ ������(��)
		// '=' �Ҵ翬���� ��� �Ѵ�.
		int age = 31;		// ������ ����� ���ÿ� 31�̶�� ���� '�Ҵ�'
		int age2 = 10;
		int age3 = age + age2;
		
		System.out.println(" age : " +age);
		
		age = age + 10;
		System.out.println(" age : " +age);
		
		//������ ���� �� �Ҵ�(�ʱ�ȭ)
		int age4;				//������ �����ϰ�
		age4 = age * 10 / 20;	//���� �Ҵ� (�ʱ�ȭ)
		System.out.println(age4);
		
	}
	
}
