// if there is an abstract method in a class, that class must be abstract
public abstract class Phone {
	
	String model;
	int price;
	
	
	// abstract methods do not have body	
	public abstract void call(); 
	public abstract void sendMessage();
}
