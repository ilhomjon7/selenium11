package ilhom;


public class Vegetable {
public void fries() {
	System.out.println("fries make you fat");
	
}

public void chipes() {
	System.out.println("there is less chips in pakage then air");
	
}
public void pepsi() {
	System.out.println("pepsi in not made of potato");
}

public static void main(String[] args) {
	Vegetable  potato = new  Vegetable();
	potato.fries();
	potato.chipes();
	potato.pepsi();
}
}
