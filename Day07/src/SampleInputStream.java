import java.io.*;							// java.io <-�ڹ��� input�� output�� ����ϴ� ��Ű��

public class SampleInputStream {

	public static void main(String[] args) throws Exception {
		
		System.out.print("���ڸ� �Է��� �ּ��� > ");
		InputStream in = System.in;			//InputStream�� �ڹ��� Ư�� ��Ű�������� ��� ����
//		int input = in.read();			//in.read()�� exception(����)�� �߻���Ŵ
//		System.out.println("ASCII Code : " + input + ", CharValue : " + (char)input);
//		//input ��Ʈ���� read�� 1byte�� ù ��° ��¥�� �о����
		
		byte[] b = new byte[5];
		int input2 = in.read(b);
		
		for(int i = 0; i<b.length; i++) {
			System.out.println("ASCII Code : " + b[i] + ", CharValue : " + (char)b[i]);
		}
		
		//System.out.println("�Է°� : "+input2);
		
	}
	
}
