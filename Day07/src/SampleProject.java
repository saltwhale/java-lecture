import java.util.Scanner;

public class SampleProject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		String[] arrMonthName = {
				"Jan",
				"Feb",
				"Mar",
				"Apr",
				"May",
				"June",
				"July",
				"Aug",
				"Sept",
				"Oct",
				"Nov",
				"Dec"		
		};
		
		while(true) {
			
			System.out.print("���ڸ� �Է����ּ���(���� 0). > ");
			input = sc.nextInt();
			if(input == 0) break;
			System.out.println(input + "���� ����� " + arrMonthName[input -1] + "�Դϴ�.");
					
		}
		
		sc.close();
		System.out.println("���α׷�����.");
		
	}
	
}
