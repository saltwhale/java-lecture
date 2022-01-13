
public class Application5 {

}


// 2. 메서드 오버로딩(확장)
// 같은 이름을 가진 메서드이면서 매개변수의 자료형, 개수, 순서 중 하나 이상이 달라야 함
class Bus {
	
	int wheel = 4;
	
	void pushButton() {
		System.out.println("문열림");
	}
	
	//메서드 명은 동일하나 여러개의 행동을 할 수 있도록 만들어 주는 것
	void pushButton(int count) {
		if(count <= 3) {
			System.out.println("문열림");
		} else {
			System.out.println("그만 눌러 이새끼야");
		}
		
	}
	
}