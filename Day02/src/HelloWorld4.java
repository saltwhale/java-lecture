/* 자바의 명명규칙(개발자끼리 암묵적으로 정해둔 룰)
 * 
1. 클래스 이름 명명규칙 (카멜케이스 upper camel case - 쌍봉낙타) 
클래스 이름의 시작은 무조건 대문자
클래스 명이 두 단어 이상으로 이루어졌을 때 단어와 단어는 대문자로 구분한다.
ex) I am Sam -> IAmSam

2. 메소드 이름 명명규칙 (lower 카멜케이스 lower camel case - 단봉낙타)
메소드 이름의 시작은 무조건 소문자
두 단어 이상으로 조합된 경우 각 단어의 시작은 대문자 (단어와 단어의 구별은 대문자)
ex) I am Sam -> iAmSam

3. 변수 이름 명명규칙 
메소드 명명규칙을 따름

*/

public class HelloWorld4 {
	public static void main(String args[]) { //args 변수
		System.out.println("Hello World"); //out 변수 println 메소드
	}

}
