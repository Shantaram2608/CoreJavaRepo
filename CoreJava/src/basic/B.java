package basic;

public class B {
	public static void main(String[] args) {
		m1();
	}
	
	static void m1() {
		m2();
		System.out.println("====M1 is executed====");
	}
	
	static void m2() {
		m3(40,30);
		System.out.println("===M2 is executed===");
	}
	
	static void m3(int a, int b) {
		int c = a + b ;
		System.out.println("sum is = "+c);
		System.out.println("M3 is executed");
	}
	

}
