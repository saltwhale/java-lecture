
public class StringExample {

	public static void main(String[] args) {
		
		//변수선언, 사용
		//데이터타입(자료형) 변수명;		<--선언

		String name;
		String home;
		String description;
		
		name = "이다원";
		home = "독산동";
		
		System.out.println(name+"은 집이 독산동이다.");
		
		description = name + "의 집은 " + home + "이다."; //아래와 같은 값을 출력하지만
		
		description = String.format("%s의 집은 %s이다.", name, home); //이 것이 효율이 더 좋다.
		
		System.out.println(description);
		
		
		//데이터타입(자료형) 변수명 = 값;	<-- 선언과 동시에 초기화
		
		//String name = "이다원";
		
		
		//문자형은 "정수형"
		
		char c_name = 'A';
		
		//char c_name = discription.charAt(0); 
		
		System.out.println(c_name);
		
	}
	
}
