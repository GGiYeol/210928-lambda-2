package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,6);
		
		method(list, num -> System.out.println(num)); //코드완성
		method(list, num -> System.out.println("item : " + num)); //코드완성
		method(list, num -> System.out.println("item : " + num * 2)); //코드완성
//		method(list, n -> System.out.println("item : " + n * 2)); 
		//파라미터 명은 매치만 잘 시켜주면 된다.
	}
	public static void method(List<Integer> list, MyInterface4 c) {
		for(int item : list) {
			c.method(item);
		}
	}
}

interface MyInterface4	{
	void method(int num);
}