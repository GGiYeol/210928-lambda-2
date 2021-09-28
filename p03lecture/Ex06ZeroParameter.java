package p14lambda.p03lecture;

public class Ex06ZeroParameter {
	public static void main(String[] args) {
		//파라미터가 없을때에는 빈 괄호가 있어야한다.
		MyInterface6 o1 = () -> System.out.println("heool");
		
		o1.method();
	}
}

interface MyInterface6{
	void method();
}