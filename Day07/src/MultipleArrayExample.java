 
public class MultipleArrayExample {

	public static void main(String[] args) {
		
		// 1차원 배열
		// 데이터타입[] 변수명;
		//1. 선언과 동시에 초기화
		char[] a = {1, 2};		// a[0], a[1]
		//2. 선언과 동시에 빈 방 만들기
		char[] b = new char[2];	// new 데이터 타입[방크기]
		b[0] = 1;
		b[1] = 2;
		//3. 선언만 하기 (그리고 나중에 방 만들기)
		char[] c;
		c = new char[2];
		c[0] = 1;
		c[1] = 2;
		
		
		// 2차원 배열
		// 데이터타입[][] 변수형;
		char[][] 용궁빌라 = { 
				{1, 2, 3},		//용궁빌라[0][1] == 2
				{4, 5, 6}		//용궁빌라[1][2] == 6
		};
		
		
		// n차원 배열
		// 데이터타입[]*n 변수형;
		// ex) 3차원 배열
		char[][][] 신도아파트 = {
				{
					{1, 2},
					{2, 3}		// 신도아파트[0][1][1] == 3
				},
				{
					{4, 5},
					{5, 6}
				}
		};
		
	}
	
}