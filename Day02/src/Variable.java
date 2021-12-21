/*변수
값을 담아두는 공간(데이터를 담은 상자에 하는 라벨링)
변수 명명 규칙은 단봉낙타
*/

public class Variable {
	public static void main(String[] args) {
		
		//자료형 변수명 = 데이터;
		int a = 10;
		int x;
		int myAge = 19; //myAge 변수 명명규칙은 단봉낙타라서 첫 문자는 소문자로 시작
		
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a*a);
		
		x = 9;
		x = a - x;
		
		/* 변수의 문법적 특징
		
		1. 변수의 시작은 숫자일 수 없다.
		int 0name;  -error
		int name0; - 정상
		
		2. 변수의 이름은 예약어 일 수 없다. 
		예약어 = 이미 자바에서 쓰고 있는 단어들 ex) class, static, void 등
		int class; - 자바컴파일러가 이미 사용하고 있는 예약어인 class는 사용 불가
		
		3. 공백을 허용하지 않는다
		int iAmSam;   -정상
		int i Am Sam; -error		
		
		4. 같은 Scope(대괄호 사이 { -- })에 같은 이름의 변수는 허용되지 않는다.
		int im = 10;
		int im;
		
		5. 대소문자는 구분한다.
		int ImABoy = 10;
		int imaBoy = 9;
		
		*/
		
	}
	
}
