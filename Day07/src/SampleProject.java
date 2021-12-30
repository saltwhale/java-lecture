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
			
			System.out.print("숫자를 입력해주세요(종료 0). > ");
			input = sc.nextInt();
			if(input == 0) break;
			System.out.println(input + "월은 영어로 " + arrMonthName[input -1] + "입니다.");
					
		}
		
		sc.close();
		System.out.println("프로그램종료.");
		
	}
	
}
