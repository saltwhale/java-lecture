/* �⺻�ڷ���

1. ������(+����) �⺻ ������Ÿ���� int
long(8byte), int(4byte), short(2byte), byte(1byte), char(2byte, ������/������)

2. �Ǽ���(�Ҽ���) �⺻ ������Ÿ���� double
float(4byte), double(8byte)

3. ����
boolean(1byte)

*/


public class VarDataType {
	public static void main(String args[]) {
		
		System.out.println(10);
		
		char c = 64; // ĳ����(char)�� �ƽ�Ű �ڵ带 ��ü�Ѵ�. char�� �����̱⵵ ������ ���ڵ� ��Ÿ�� �� �ִ�.
		System.out.println(c);
		System.out.println((char)c);
		
		float fo = 0.11f; // �⺻���� double�̱⶧���� f�� ǥ��������Ѵ�. 
		double db = 0.12;
		
		boolean isPerson = false; // true �Ǵ� false�� ����
		
		/* �⺻�ڷ���	=	Ŭ�����ڷ���
			int		=	Integer
			boolean	=	Boolean
			double	=	Double
		*/
		
		// Class�� ���ڿ�
		String name = "�̴ٿ�";	//���ڿ��� ū����ǥ
		char n = '��';			//����(1����)�� ��������ǥ
		
		System.out.println(name);
		
		
	}
}
