
public class ArrayExample {
	
	public static void main(String[] args) {
		
		// 배열
		// 값의 집합
		// 변수선언법
		// 데이터타입 변수명[갯수] or 데이터타입[갯수] 변수명 
		// int a[10]; 
		
		//1. 선언방식
		int[] a = new int[5]; 
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
		
		//반복문으로 값 넣기
		for (int i = 0; i < 5; i ++) {
			a[i] = i;
		}
		
		//a[5] = 10;		// Array out of bound exception 없는 인덱스를 사용하는 경우
							// 컴파일 에러 x 런타입 인셉션 o 
		
		//배열선언 + 출력
		int[] b = {1, 2, 3, 4, 5};
		
		for(int i = 0; i<b.length; i++) {
			System.out.println(i+1);
		}
		
			int[] c = {97, 98, 99, 100};
		
			for(int i = 0; i<c.length; i++) {
				System.out.println((char)c[i]);
			}
			
			
			/* 
			 1. 배열정리
			 배열은 같은 데이터타입을 가지는 연속적인 방
			 int[5] -> 4*5 = 20bytes
			 
			 2. 배열선언법
			 int[] 변수명; 
			 
			 
			 3. 배열 선건과 동시에 방 만들기
			 char[] 변수명 = new char[5];	-> 선언할 때 방 수를 입력하지 x
			 갑넣기 a : a[0] - 97; a[1] = 98; ....
			 값넣기 b : for문 같은 반복문 사용
			 */
			
			
			 // 영 소문자 넣기
			 char[] alpha = new char[24];
			 //방을 만들고
			 char alpha_start = 'A'; // 'a' 대신 97(아스키코드) 사용 가능
			 //값을 넣음
			 for(int i = 0; i <alpha.length; i++) {
				 alpha[i] = alpha_start ++;
			 }
			 
			 for(int i = 0; i<alpha.length; i++) {
				 System.out.print(alpha[i]);
			 }
			 
			 //배열 선언과 동시에 값 넣기
			 //데이터타입 배열 변수명 = {값};
			 char[] arrCh = {97, 98, 99};		//방 3개 만듦 = 3byte
			 //방 갯수가 많아지는 경우 쓰기 어려움
			



	}
		
}
