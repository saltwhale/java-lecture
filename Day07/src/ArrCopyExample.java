
public class ArrCopyExample {

	public static void main(String[] args) {
	
		// 배열의 길이는 한 번 정해지면 변경할 수 없다.
		// 따라서 길이를 늘이거나 줄일때는 옮겨놓은 배열을 선언하고 복사 후 기존 배열(집)을 파괴한다.
		
		int[] a = {1, 2, 3};		//원본배열
		int[] b = new int[5];		//복사할 배열
		
		// 복사할 배열에 값 대입
		for(int i = 0; i < a.length ; i++) {
			b[i] = a[i];
			
		}
		
		for(int i = 0; i < b.length ; i++) {
			b[i] = a[i];
			System.out.println(b[i]);
			
		}

		a = null;				// a 집 뿌수기
		
		
		int[] c = {1, 2, 3, 4, 5};
		int[] d = new int[3];
		System.arraycopy(c, 2, d, 0, 3);
		
		for(int i=0; i < d.length; i++) {
			d[i] = c[i+2];
			//d[0] = c[2];
			//d[1] = c[3];
			//d[2] = c[4];
			
		}
		
		for(int i=0; i < d.length; i++) {
			System.out.println(d[i]);
			
		}
		
	}
	
}
