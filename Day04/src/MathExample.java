
public class MathExample {

	public static void main(String[] args) {
		
		//산술연산
		//+, -, *, /, %
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + b + a + b + b);		// 덧셈 - a(4byte), b(4byte) 총 8byte 사용
		System.out.println(10 + 20 + 10 + 20 + 20);	// 위와 같은 값을 출력하지만 숫자 1개당 4byte씩
													// 총 20byte가 필요하게 됨
		
		System.out.println( a - b );				// 뺄셈
		
		System.out.println( a * b);					// 곱셈
		
		System.out.println("a / b = " + a / b );	// 나눗셈
		// 값이 0.5지만 기본 정수형은 int이기 때문에 0을 출력한다.
		
		int c = 15;
		
		System.out.println("c % a = " + c % a );	// %는 나머지 값을 출력한다.
		System.out.println("c % b = " + c % b );
		
	}
	
}
