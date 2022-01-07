package kr.education;

//접근한정자의 실무상 활용
public class StudentExample {
	
	//프라이빗으로 설정한 후
	private String name;
	private int grade;
	public int age;
	
	//이름 가져오기
	public String getName() {
		return this.name;
	}
	
	//이름 설정하기
	public void setName(String name) {
		this.name = name;
	}

	//자동으로 생성하기 
	//우클릭 -> Source -> Generate getter and setter	

}
