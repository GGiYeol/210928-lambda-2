package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,6);
		
		//list.forEach활용, lambda활용
		//출력결과 : 6,8,10,12
		
		list.forEach(a -> System.out.print(a * 2 + " "));
	}
}
