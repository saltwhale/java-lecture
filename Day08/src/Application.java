
// Application 실행 스타팅 포인트
public class Application {
	
	public static void main(String[] args) {
		Person p = new Person();			//내 눈 앞에 보이는 것(가시화) = 메모리에 올라와 있다
		p.name = "보노보노";					//객체에 있는 속성(필드)에 접근하려면 . 이 필요하다.
		p.sayHello();
		
		Person p2 = new Person();
		p.name = "포로리";
		p.sayHello();
		
		// 주소값 비교로 같을 수 없다.
		if(p == p2) {
			System.out.println("p와 p2는 같아요.");
		} else {
			System.out.println("p와 p2는 같지 않아요.");
		}
		
		// 객체 자체를 비교하는 방법(같은 클래스 출신이냐?) = instanceof 연산자.
		if (p instanceof Person) {
		// 실행내용
		}
		
		if (p2 instanceof Person) {
		// 실행내용
		}
		
	}

}


// class 문법
// [접근한정자] class 클래스명 { // 내용 }

class Person1 {
	
	String name;							//속성 (필드)
	
	public void sayHello() {				//행동(매서드)
		System.out.println(name + "입니다. 안녕하세요.");
		
	}
	
}