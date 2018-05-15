package ilhom;



public class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
		}
	public void subtract(int a, int b) {
		System.out.println(a-b);
	}
	public void mutiply(int a, int b) {
		System.out.println(a*b);
	}
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.add(10, 10);
		basicCal.subtract(20, 10);
		basicCal.mutiply(10, 10);
	basicCal.divide(100, 5);
	}
	
	
	
	
	
}
