
public class InnerClass {

	class InnerInnerClass{	//①객체생성을 해야 사용할 수 있는 이너클래스
		
	}
	
	static class StaticInnerClass { //②static 이너클래스
		
	}
	
	public static void main(String[] args) {
		InnerClass cls = new InnerClass();
		InnerClass.InnerInnerClass inCls = cls.new InnerInnerClass(); //①객체.new 이너클래스
		InnerClass.StaticInnerClass sCls = new InnerClass.StaticInnerClass(); //②new 이너클래스
		
	}
}

//이너클래스는 상속을 받지 않더라도 상위 클래스에 접근할 수 있다.