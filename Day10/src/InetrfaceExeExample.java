
public class InetrfaceExeExample {
	
	public static void main(String[] args) {
	
		//1. 추상클래스는 new로 객체생성 불가능
		// 이유는 구현이 모두 안 되어 있기 때문이다.
		//2. 인터페이스는 new로 객체 생성불가능
		// 이유는 a) interface는 class가 아니라서 객체 생성이 불가능
		// b) 구현이 없어서
		// !) interface는 통신규약을 만드는 것
		
		InterfaceExample im = new SKInternet();
		InterfaceExample im2 = new LGInternet();
		
		im.connect();
		im2.connect();
		
		//ImCC는 Father의 하위 클래스이기 때문에 Father클래스로 묶을 수 있다.
		Father fa = new ImCC();
		AA aa = new ImCC();
		BB bb = new ImCC();
		CC cc = new ImCC();
		
	}

}

class Father {
	
}
class ImCC extends Father implements AA, BB, CC {
	//인터페이스는 다중구현(상속)이 가능하다.
	
	//각 인터페이스에 있는 추상메서드를 모두 구현해 주지 않으면 에러가 난다.
	public void aa() {
	}
	
	public void bb() {
	}
	
	public void cc() {
	}
	
}


interface AA {
	void aa();			//추상메서드 생성
}
interface BB {
	void bb();
} //extends AA{}
//인터페이스끼리의 구현은 extends를 사용
interface CC {
	void cc();
}//extends BB{}