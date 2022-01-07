//final
//클래스, 메서드, 속성에서 사용될 수 있다.
// ex) 클래스에 final = 상속 안 하겠다.
// ex) 메서드에 final = 오버라이등을 허용하지 않겠다.
// ex) 속성에 final = 값을 변경할 수 없게 하겠다.

// 선언방법
// final class 클래스명
// final 리턴타입 메서드명 (매개변수)
// final 데이터타입 변수명 = 값

public class FinalExample {
	public static void main(String[] args) {
		A1 ao = new B1();
		ao.printName();
	}
	
}

//-------- final class예제
//final class AO {
//	String name = "보노보노";
//}
//
//final class는 상속을 할 수 없으므로 에러를 발생 시킨다.
//class BO extends AO {}
//-------------------------

//-----------------final 속성/변수 예제
//final 속성/변수는 한 번 초기화(값이 들어간 이후) 변경이 불가능하다.
//다만 생성자를 통한 초기화의 경우만 예외로 한다.
class AO {
	final int grade = 10;
	//final int grade;
	//AO(int grade) {
	//	this.grade = grade;
	//}
}

class BO extends AO {
	void changeGrade() {
		//값을 직접 입력하는 것을 불가능하다.
		//this.grade = 100;
		//new AO(1);
	}
}

//------final 메서드 예제------------
class A1 {
	void printName() {
		System.out.println("보노보노");
	}
}

class B1 extends A1 {
	final void printName() {
		System.out.println("포로리");
	}
}

class C1 extends B1 {
	//void printName() {}
	//아버지 B1에서 메서드가 final이므로, 메서드 중첩(오버라이딩)을 할 수 없다. 
}
//-------------------------------


//상수 선언
//final static 데이터타입 상수명
// ex) final static double PI = 3.141592;
// ex) static final double PI = 3.141592;
// 상수는 모두 대문자로 쓰는 것을 원칙응로 한다.