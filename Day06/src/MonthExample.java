
public class MonthExample {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			
			System.out.println("사용법 : java 월 ");
		} else {
		
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
		
			int command = Integer.parseInt(args[0]) - 1;
			System.out.println(arrMonthName[command]);
		
		}
		
		
	}
	
}
