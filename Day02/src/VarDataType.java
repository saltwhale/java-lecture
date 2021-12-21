/* 기본자료형

1. 숫자형(+문자) 기본 프로토타입은 int
long(8byte), int(4byte), short(2byte), byte(1byte), char(2byte, 문자형/숫자형)

2. 실수형(소수점) 기본 프로토타입음 double
float(4byte), double(8byte)

3. 논리형
boolean(1byte)

*/


public class VarDataType {
	public static void main(String args[]) {
		
		System.out.println(10);
		
		char c = 64; // 캐릭터(char)은 아스키 코드를 대체한다. char은 숫자이기도 하지만 문자도 나타낼 수 있다.
		System.out.println(c);
		System.out.println((char)c);
		
		float fo = 0.11f; // 기본값이 double이기때문에 f를 표시해줘야한다. 
		double db = 0.12;
		
		boolean isPerson = false; // true 또는 false만 가능
		
		/* 기본자료형	=	클래스자료형
			int		=	Integer
			boolean	=	Boolean
			double	=	Double
		*/
		
		// Class고 문자열
		String name = "이다원";	//문자열은 큰따옴표
		char n = '이';			//문자(1글자)는 작은따옴표
		
		System.out.println(name);
		
		
	}
}
