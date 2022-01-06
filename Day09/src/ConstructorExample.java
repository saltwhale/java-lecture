
public class ConstructorExample {

	public static void main(String[] args) {
		
		// 클래스를 객체로 만드는 작업 = 생성자
		Bus bus = new Bus();	//디폴트 생성자
		bus.printMyNum(); 		//생성자가 없을 경우 503이지만 생성자 메서드 선언이 되어 있기 때문에 200이 출력된다.

		Bus bus2 = new Bus(1000);
		bus2.printMyNum();
		
	}
	
}

// 생성자를 선언하는 방법
// 클래스명 (매개변수) { ... 내용 ... }
// this(keyword) 생성자
class Bus extends Vehicle {
	int num =503;				// 속성/멤버/필드
	
	//메서드와의 차이점 1. 생성자 메서드는 클래스 이름을 가진다. 2. 리턴값이 없다.
	//----- 생성자 선언 -------------
//	Bus () {
//		num = 200;
//	}
	
	Bus (int num) {
		super(4);		// == new Vehicle(4) 바로 위 아버지 클래스의 생성자 호출
		this.num = num;
	}
	
//	Bus(double bus_num) {
//		this.num = (int)bus_num;
//	}
	// ----------------------------
	
	void printMyNum() {
		System.out.println(num);
	}
	
}

// 탈 것 클래스
class Vehicle {
	int wheelCnt;
	Vehicle(int wheelCnt) {
		this.wheelCnt = wheelCnt;
	}
}