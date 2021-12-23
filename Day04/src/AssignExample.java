
public class AssignExample {

	public static void main(String[] args) {
		
		// 할당연산은 우에서 좌로
		// 좌측은 변수/상수, 우측은 데이터(값)
		// '=' 할당연사자 라고 한다.
		int age = 31;		// 변수를 선언과 동시에 31이라는 값을 '할당'
		int age2 = 10;
		int age3 = age + age2;
		
		System.out.println(" age : " +age);
		
		age = age + 10;
		System.out.println(" age : " +age);
		
		//변수를 선언 후 할당(초기화)
		int age4;				//변수를 선언하고
		age4 = age * 10 / 20;	//값을 할당 (초기화)
		System.out.println(age4);
		
	}
	
}
