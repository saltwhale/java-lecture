
public class InnerClass {

	class InnerInnerClass{	//�簴ü������ �ؾ� ����� �� �ִ� �̳�Ŭ����
		
	}
	
	static class StaticInnerClass { //��static �̳�Ŭ����
		
	}
	
	public static void main(String[] args) {
		InnerClass cls = new InnerClass();
		InnerClass.InnerInnerClass inCls = cls.new InnerInnerClass(); //�簴ü.new �̳�Ŭ����
		InnerClass.StaticInnerClass sCls = new InnerClass.StaticInnerClass(); //��new �̳�Ŭ����
		
	}
}

//�̳�Ŭ������ ����� ���� �ʴ��� ���� Ŭ������ ������ �� �ִ�.