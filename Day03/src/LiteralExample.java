
public class LiteralExample {

	public static void main(String[] args) {

		// 리터럴 (이스케이크 시퀸스)
		String desc = "너는 집에 가서 잠이나 자";
		System.out.println(desc);
		
		// 너는 집에 가서 잠이나 자.
		// "너" 집에 가서 잠이나 자. <---문장 안에 큰따옴표를 넣어서 강조하고 싶음 \"(큰따옴표)
		
		desc = "\"너\" 집에 가서 잠이나 자";
		System.out.println(desc);
		
		// "너"
		// 집에가서		\n(뉴라인)
		// 잠이나		자 	\t(탭)
	
		desc = "\"너\"\n 집에 가서\n 잠이나 \t자";
		System.out.println(desc);
		
	}

}
