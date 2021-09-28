package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex10 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("java", "", "a","lava"));
		
		list.replaceAll(s -> {
			
			if(s.length()<=2) {
				return s;
			}
			return s.substring(s.length()-2);
		});
		
		//삼항연산식 활용
//		list.replaceAll(s->s.length() <=2 ? s: s.substring(s.length() -2));
		System.out.println(list);
	}
}
