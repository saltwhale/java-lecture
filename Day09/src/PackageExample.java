import student.EleStudent;
//student패키지 폴더의 EleStudent 라는 클래스만 사용한다.

//import student.*;(* == all)
//student 패키지/폴더에 있는 모든 클래스들을 참조할 수 있다.

public class PackageExample {

	public static void main(String[] args) {
		
		//student.EleStudent ele = student.EleStudent();
		//import 없이 모든 코드에 패키지/폴더명을 명시해서 사용할 수 있다.
		EleStudent ele = new EleStudent();
		ele.name = "보노보노";
		ele.grade = 4;
		
	}
	
}
