
public class BitExample {

	public static void main(String[] args) {
		
		// 비트연산
		
		int a = 10, b = 11; 
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		// 2진수 출력
		
		System.out.println("a | b = " + (a | b));
		System.out.println("a & b = " + (a & b));
		System.out.println("a ^ b = " + (a ^ b));
		// 비트연산 실행
		
		System.out.println(Integer.toBinaryString(-1));	//4byte라서 32bit, 32자리의 수로 출력
		System.out.println(Integer.toBinaryString(-2));
		
		// Shift 연산
		// >>, <<, >>>
		
		 // 우측 Shift -> 부호비트(첫째비트)를 따라 빈 비트를 채운다
		 byte x = 10; 
		 // 00001010 (8bit라서 8자리의 수로 출력)
		 System.out.println("x >> 2 = " + (x >> 2));
		 // 00000010 = 2
		 
		 x = -10;
		 System.out.println("-10 = " + Integer.toBinaryString(x));
		 System.out.println("-10 >> 5 = " + Integer.toBinaryString(x >> 5));
		 // 11111111111111111111111111111111 = -1
		 
		 // 좌측 Shift -> 빈 비트를 0으로 채운다
		 System.out.println("-10 << 5 = " + Integer.toBinaryString(x << 5));
		 
		 byte z = 1;
		 System.out.println("1 << 7 = " + (z << 7)); 
		 // 00000001 << 7 = 1000000 = -128이 나와야 하지만 
		 //연산의 값은 기본적으로 int이므로 00000000000000000000000010000000 = 128이 출력됨
		 System.out.println("1 << 7 = " + (byte)(z << 7)); //강제형변환을 시킬 경우
		 // 10000000 = -128이 출력됨
		 
	}
	
}
