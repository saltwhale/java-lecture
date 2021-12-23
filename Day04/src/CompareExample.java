
public class CompareExample {

	public static void main(String[] args) {
		
		// 비교연산
		// 참/거짓을 밝히는 연산
		// >, >, >=. <=
		// == 같다
		// != 같지 않다
		// 결과값은 boolean
		
		int a = 10, b = 20, c = 10;
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a >= b));
		
		System.out.println("!(a > b) = " + !(a > b));
		// !는 not을 의미함 (!false == true, !true == false)
	
		System.out.println(" a == b = " + (a == b));
		// a == b → a와 b가 같은 값인가
		
		System.out.println(" a != b = " + (a != b));
		// a != b → a와 b가 같지 않은 값인가
		
		boolean result = (a >= b);
		System.out.println(result);
		
	}
}
