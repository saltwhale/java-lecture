import student.EleStudent;
//student��Ű�� ������ EleStudent ��� Ŭ������ ����Ѵ�.

//import student.*;(* == all)
//student ��Ű��/������ �ִ� ��� Ŭ�������� ������ �� �ִ�.

public class PackageExample {

	public static void main(String[] args) {
		
		//student.EleStudent ele = student.EleStudent();
		//import ���� ��� �ڵ忡 ��Ű��/�������� ����ؼ� ����� �� �ִ�.
		EleStudent ele = new EleStudent();
		ele.name = "���뺸��";
		ele.grade = 4;
		
	}
	
}
