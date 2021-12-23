
public class LogicalExample {

	public static void main (String[] args) {
		
		// 논리연산
		// AND, OR, XOR, NOT
		
		// 1. AND 연산	
		// &, && → true & true, true && true
		// 양쪽 모두 '참'이어야 결과 값이 참이다.
		
		int a = 10, b = 15;
		boolean result = (a != b) && (a < b);	// true && true = true
		System.out.println(result); 
		System.out.println(result && false);	// true && false = false
		
		int c = 10, d = 10;
		System.out.println((c > d) && (c++ == ++d));
		System.out.println("c = " + c + ", " + "d = " + d);
		// &&은 false && true의 수식이 있을 때,
		// 앞 부분이 false이면 전체가 false이므로 뒷 부분은 연산하지 않는다.
		
		System.out.println((c > d) & (c++ == ++d));
		System.out.println("c = " + c + ", " + "d = " + d);
		// &를 한 번 만 쓰는 경우 false & true의 수식이 있을 때에도, 뒷 부분까지 모두 연산 한다.
		
		// 2. OR 연산
		// |, || (shift + \)
		// 둘 중 하나가 true이면 무조건 true이다.
		
		int x = 100, y = 200;
		System.out.println((x != y) || (x ++ == y ++));
		System.out.println("x = " + x + ", " + "y = " + y);
		
		// 3. XOR 연산
		// ^ 
		// 양 쪽이 달라야 true / 양 쪽이 같으면 false
		// true ^ true = false
		// true ^ false = true
		// false ^ false = false
		// false ^ true = true
		
		// 4. NOT
		// !true == false
		// !false == true
		// a != b
		
	}
}
