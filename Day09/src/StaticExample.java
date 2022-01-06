//1. static은 메모리의 일정공간을 미리 만들어 놓고
//   모든 객체들이 공유하는 공간이다.
//2. static은 객체생성(new)을 필요로 하지 않는다.
//   클래스명.속성 / 클래스명.메서드()
//3. static은 속성, 메서드 등에서 사용될 수 있다.

public class StaticExample {
	
	public static void main(String[] args) {
		
		/*BoardObject bd = new BoardObject();
		bd.read();
		bd.read();
		bd.read();
		bd.read();
		
		System.out.println("bd2 객체생성");
		BoardObject bd2 = new BoardObject();
		bd2.read(); */
		
		//객체를 생성하지 않고 사용하는 방법
		BoardObject.count = 10;
		BoardObject.count ++;
		System.out.println("BoardCount : " + BoardObject.count);
		
		BoardObject.printHello();		// 객체생성(new) 없이 바로 실행된다.
		
		BoardObject bd = new BoardObject();
		bd.read();
		
	}

}

class BoardObject {
	static int count = 0;				//static 멤버변수(속성)
	void read () {
		this.count ++; //이런 방식은 거의 사용하지 않는다.(예제를 위해서 사용)
		System.out.println("읽은 수 : " + count);
	}
	
	static void printHello() {			//Static 메서드
		System.out.println("Hello");
	}
}
