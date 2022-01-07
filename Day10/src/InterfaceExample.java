//인터페이스는
//접근제한자 interface 인터페이스 명

//----인터넷접속용 인터페이스
//인터페이스 선언
public interface InterfaceExample {
	
	void connect();
	void close();
	void speedUp();
	void speedDown();
	
}

//인터페이스 구현
class SKInternet implements InterfaceExample {
	public void connect() {
		System.out.println("연결하기 구연했어요(SK)");
	}

	//자동생성 방법
	//마우스오른쪽 클릭 -> Source -> Override/Implement Method
	
	@Override
	public void close() {
		System.out.println("닫아요(SK)");
		
	}

	@Override
	public void speedUp() {
		System.out.println("속도 올려요(SK)");
		
	}

	@Override
	public void speedDown() {
		System.out.println("속도 내려요(SK)");
		
	}
	
}


class LGInternet implements InterfaceExample {
	public void connect() {
		System.out.println("연결하기 구연했어요(LG)");
	}
	
	@Override
	public void close() {
		System.out.println("닫아요(LG)");
		
	}

	@Override
	public void speedUp() {
		System.out.println("속도 올려요(LG)");
		
	}

	@Override
	public void speedDown() {
		System.out.println("속도 내려요(LG)");
		
	}
	
}