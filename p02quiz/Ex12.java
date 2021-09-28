package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex12 {
	
	public static void main(String[] args) {
		List<Car> list = Arrays.asList(new Car("telsa",500), new Car("Kia",300), new Car("Volvo", 200), new Car("meme", 400));
		
		//list.sort
		//가격순으로 정렬
		
//		list.sort((a,b) -> a.getPrice() - b.getPrice());
//		System.out.println(list);
		list.sort((c1,c2) -> c1.getPrice() - c2.getPrice());
		list.forEach(c -> System.out.println(c.getModel() + ":" + c.getPrice())
				);
	}
	
}

class Car{
	private String model;
	private int price;
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}