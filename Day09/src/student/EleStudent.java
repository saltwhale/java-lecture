//1. ���� : package ��Ű����
//2. ��Ű���� : ��� �ҹ��ڸ� ���
// ex) �Ϲ������� ȸ�� �������� �������� ó��
// ex) com.naver.util , kr.co.daum.data ...

package student;			

public class EleStudent {

	public String name;
	public int grade;	
	private static EleStudent std;			//������� �ʾ����Ƿ� null
	
	public void printName() {
		System.out.println("�̸��� " + name + "�Դϴ�.");
	}
	
	//singleton
	public static EleStudent getInstance() { //null�� ��� ���� ����
		if(std == null) std = new EleStudent(); 
		return std;
	}
	
}
