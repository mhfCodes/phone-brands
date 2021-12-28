
public class Main {

	public static void main(String[] args) {
		
		Apple myApple = new Apple("iPhone 13", 799);
		Samsung mySamsung = new Samsung("A21", 249);
		Huawei myHuawei = new Huawei("Y9", 294);
		
		myApple.call();
		mySamsung.sendMessage();
		myHuawei.call();
		System.out.println(Huawei.BRAND);
		
		// Find the cheapest		
		Phone[] myPhones = {myApple, mySamsung, myHuawei};
		int min = 10000;
		int cheapIndex = 0;
		for (int i = 0; i < myPhones.length; i++) {
			if (myPhones[i].price < min) {
				min = myPhones[i].price;
				cheapIndex = i;
			}
		}
		System.out.println("The Cheapest Phone is " + myPhones[cheapIndex].model);
		
	}

}
