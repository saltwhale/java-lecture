
public class ArrayExample {
	
	public static void main(String[] args) {
		
		// �迭
		// ���� ����
		// ���������
		// ������Ÿ�� ������[����] or ������Ÿ��[����] ������ 
		// int a[10]; 
		
		//1. ������
		int[] a = new int[5]; 
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
		
		//�ݺ������� �� �ֱ�
		for (int i = 0; i < 5; i ++) {
			a[i] = i;
		}
		
		//a[5] = 10;		// Array out of bound exception ���� �ε����� ����ϴ� ���
							// ������ ���� x ��Ÿ�� �μ��� o 
		
		//�迭���� + ���
		int[] b = {1, 2, 3, 4, 5};
		
		for(int i = 0; i<b.length; i++) {
			System.out.println(i+1);
		}
		
			int[] c = {97, 98, 99, 100};
		
			for(int i = 0; i<c.length; i++) {
				System.out.println((char)c[i]);
			}
			
			
			/* 
			 1. �迭����
			 �迭�� ���� ������Ÿ���� ������ �������� ��
			 int[5] -> 4*5 = 20bytes
			 
			 2. �迭�����
			 int[] ������; 
			 
			 
			 3. �迭 ���ǰ� ���ÿ� �� �����
			 char[] ������ = new char[5];	-> ������ �� �� ���� �Է����� x
			 ���ֱ� a : a[0] - 97; a[1] = 98; ....
			 ���ֱ� b : for�� ���� �ݺ��� ���
			 */
			
			
			 // �� �ҹ��� �ֱ�
			 char[] alpha = new char[24];
			 //���� �����
			 char alpha_start = 'A'; // 'a' ��� 97(�ƽ�Ű�ڵ�) ��� ����
			 //���� ����
			 for(int i = 0; i <alpha.length; i++) {
				 alpha[i] = alpha_start ++;
			 }
			 
			 for(int i = 0; i<alpha.length; i++) {
				 System.out.print(alpha[i]);
			 }
			 
			 //�迭 ����� ���ÿ� �� �ֱ�
			 //������Ÿ�� �迭 ������ = {��};
			 char[] arrCh = {97, 98, 99};		//�� 3�� ���� = 3byte
			 //�� ������ �������� ��� ���� �����
			



	}
		
}
