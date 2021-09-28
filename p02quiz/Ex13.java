package p14lambda.p02quiz;

import java.util.HashMap;
import java.util.Map;

public class Ex13 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("spring", 1);
		map.put("java", 1);
		map.put("html", 1);
		map.put("css", 1);
		
		//map.repalceAll
		//각 entry의 값이 key의 length 가 되도록 코드 완성
		
		map.replaceAll( (a,b) -> b = a.length());
		
		System.out.println(map);
	}
}
