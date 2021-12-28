
public class Apple extends Phone {
	
	final static String BRAND = "Apple";
	
	Apple(String model, int price) {
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
