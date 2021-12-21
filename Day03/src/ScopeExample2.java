
public class ScopeExample2 {
	

	static String name = "너는 바보";
	
	public static void main(String[] args) {
		String name = "너";
		System.out.println(name);
		printName();
		
	}
	
	public static void printName() {
		System.out.println(name);
		
	}

}