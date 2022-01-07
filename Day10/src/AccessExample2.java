

public class AccessExample2 {

}

// default는 상속이 되지 않는다고 되어 있으나
// 동일 패키지, 동일 클래스 안에서는 상속도 가능하다.

class A {
	
	String name = "보노보노";
	int age = 10;
	
}

class B extends A {
	
	void printAClassMember() {
		this.name = "보노보노";
	}
}