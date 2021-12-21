
public class ScopeExample {
	
	static String name = "너는 바보";
	
	// Scope 범위 = 이 변수가 어디까지 영향을 미치는지
	public static void main(String[] args) {
		
		String name = "이다원";		//같은 name변수를 선언했지만 scope가 다르기 때문에 다른 변수	
		
		{
			String g_name = "너";
			System.out.println(g_name);
		}
		
		g_name = "바보";		// Scope가 달라서 에러
		System.out.println(name);	//변수사용
		
		
	}

}
