
public class MultipleArrayExample2 {

	public static void main(String[] args) {
	
		char[][] arr = new char[2][]; 
		
		arr[0] = new char[3];			// 1층에는 방 3개
		arr[1] = new char[3];			// 2층에는 방 4개인 경우
										// 실행했을 때 에러는 나지 않지만 사용하지 않는다.

		for(int x = 0; x < 2; x++) {
			for(int y = 0; y < 3; y++) {
				arr[x][y] = (char)y;
				
			}

		}
		
		for(int x = 0; x < 2; x++) {
			for(int y = 0; y < 3; y++) {
				System.out.println("arr[" + x + "][" + y + "] = " + (int)arr[x][y]);
			}
			
		}
		
	}
	
}
