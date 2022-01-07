import kr.education.StudentExample;

class Student extends StudentExample{
//StudentExample을 상속
	
	String name = "보노보노";
	int grade = 3;
	void printMySelf() {
		System.out.println(this.age);
		//StudentExample을 상속을 받았으니 age가 나와야 하는데
		//private로 설정되어 있어 상속 받지 못함(private, default는 상속x)
		System.out.println("내 이름은 "+name+"이고, "+grade+"학년 입니다.");
	}
}
