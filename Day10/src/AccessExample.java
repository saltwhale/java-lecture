//��������(����)��
//public > protected > (default) > private
//�����
//1. ���(�Ӽ�) ������ ��� ����
//ex) public int age; [����������] ������ Ÿ�� ������;
//2. Ŭ������ ��� ����
//ex) class Person [����������] class Ŭ������
//3. �޼��忡 ��� ����
//ex) int plus(int x, int y) [����������] ����Ÿ�� �޼����(�Ű�����)

import kr.education.*;

public class AccessExample {

	public static void main(String[] args) {		
		// ���� ��Ű�� ���� default �����ڸ� ������
		//Ŭ����, �Ӽ�, �޼���� �ƹ� ���� ���� ��밡���ϴ�.
		Student std1 = new Student();
		std1.name = "���θ�";
		std1.grade = 10;
		std1.printMySelf();
		
		// �ٸ� ��Ű���� publicŬ������ ���� ����
		StudentDefault std2 = new StudentDefault();
		// StudentDefault Ŭ������ name �Ӽ��� public�̶� ���� ����
		std2.name = "�ʺθ�";
		//�ٸ� ��Ű���� default �Ӽ��̶� ������ �� ����.(����)
		//std.grade = 10;
		
	}
	
}
