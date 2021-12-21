
public class ScopeExample2 {
	

	static String name = "너는 바보";
	
	public static void main(String[] args) {
		// 선언된 변수는 중괄호 기준으로 범위가 정해진다.
		String name = "너";
		System.out.println(name); //너
		printName();
		
	}
	
	public static void printName() {
		// 사용할 변수명이 없으면, 자기 상위 영역 중괄호를 체크한다.
		System.out.println(name); //너는 바보
		
	}

}