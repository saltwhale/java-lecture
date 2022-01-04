

public class Application2 {
	
	public static void main(String[] args) {
//		Korean k = new Korean();
//		k.name = "나는 한국인";
//		k.sayHello();							// Person 에 대한 속성이 Korean에 상속됨
		
		
		Person p = new Japanese();				
		// is a 관계 Japanese is a Person -> 같은 Person이 아니라도 변수 설정이 가능
		p.name = "나까무라";
		p.sayHello();	// Person의 메서드가 아니라 Japanese의 메서드가 실행됨(다형성)  
		
	}

}


// class 문법
// [접근한정자] class 클래스명 { // 내용 }

class Person {
	
	String name;							//속성 (필드)
	
	public void sayHello() {				//행동(매서드)
		System.out.println(name + "입니다. 안녕하세요.");
		
	}
	
}

// 상속은 extends [Class명]
class Korean extends Person {
	public void sayHello() {
		System.out.println(name + "입니다. 안녕하세요.");
	}
}

class Japanese extends Person {
	public void sayHello() {
		System.out.println(name + "입니다. 곤니찌와.");
	}
}


class Chinese extends Person {
	public void sayHello() {
		System.out.println(name + "입니다. 니하오.");
	}
}