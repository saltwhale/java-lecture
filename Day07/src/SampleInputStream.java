import java.io.*;							// java.io <-자바의 input과 output을 담당하는 패키지

public class SampleInputStream {

	public static void main(String[] args) throws Exception {
		
		System.out.print("문자를 입력해 주세요 > ");
		InputStream in = System.in;			//InputStream은 자바의 특정 패키지에서만 사용 가능
//		int input = in.read();			//in.read()는 exception(예외)을 발생시킴
//		System.out.println("ASCII Code : " + input + ", CharValue : " + (char)input);
//		//input 스트림의 read는 1byte라서 첫 번째 글짜만 읽어들임
		
		byte[] b = new byte[5];
		int input2 = in.read(b);
		
		for(int i = 0; i<b.length; i++) {
			System.out.println("ASCII Code : " + b[i] + ", CharValue : " + (char)b[i]);
		}
		
		//System.out.println("입력값 : "+input2);
		
	}
	
}
