
public class Main {

	public static void main(String[] args) {
		
		Apple myApple = new Apple("iPhone 13", 799);
		Samsung mySamsung = new Samsung("A21", 249);
		Huawei myHuawei = new Huawei("Y9", 294);
		
		myApple.call();
		mySamsung.sendMessage();
		myHuawei.call();
		System.out.println(Huawei.BRAND);
		
	}

}
