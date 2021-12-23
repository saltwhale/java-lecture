
public class OpExample {

	public static void main (String[] args) {
		
		// 단항연산자(증감연산)
		
		// 1. ++
		int a = 10;
		a ++;						// 전위연산 a = a + 1 
		System.out.println("a = " +a);
		++ a;						// 후위연산 a = a + 1
		System.out.println("++ a = " +a);
		
		System.out.println(a ++);	// = 12, a를 출력한 후 
		System.out.println(a);		// = 13, +1을 함
		
		System.out.println(++ a);	// = 14, +1을 한 후 a를 출력
		
		// 2. --
		int b = 10;
		System.out.println(b --);
		System.out.println(b);
		System.out.println(-- b);

	}
	
}
