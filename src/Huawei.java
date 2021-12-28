
public class Huawei extends Phone {

	final static String BRAND = "Huawei";
	
	Huawei(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void call() {
		System.out.println("I'm Calling With a " + this.model);
	}
	
	@Override
	public void sendMessage() {
		System.out.println("I'm Sending a Message With a " + this.model);
	}
	
	
}
