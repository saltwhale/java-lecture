
public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		// 정수형 데이터 타입
		
		// 명시적 형변환
		int a = 10;		// 4 bytes
		short b = (short)a; // int보다 short가 작은 크기의 자료형이기 때문에 강제형변환 (short)를 입력해줘야 함
		System.out.println(b);
		
		// 묵시적 형변환
		short c = 100;	// 2 bytes
		int d = c;		// short보다 int가 큰 크기의 자료형이기 때문에 강제로 담지 않아고 형변환이 가능
		System.out.println(d);
		
		//byte x = 128;	// 1 byte = -127 ~ 128 의 범위를 가지고 있어서 128은 범위를 벗어나서 오류
		
		//Example
		int a1 = 128;
		byte x1 = (byte)a1;		// 컴파일 에러는 나지 않지만 런타임 에러가 발생하게 된다.
		System.out.println(x1);	// 값은 표출되지만 실제로 프로그램이 돌아가지 않는다.(쓰레기 값 -128 error)
		
		double xa = 3.6441;		// double은 정수형
		int xb = (int)xa;		// int는 실수형
		System.out.println(xb);	// 강제형변환을 한 경우 소수점 밑 값은 버림
		
		int ya = 10;
		double yb = ya;
		System.out.println(yb);	// 묵시적형변환의 경우 실수형을 정수형으로 변환해서 출력한다.
		
	}

}
