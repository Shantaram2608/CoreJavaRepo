package basic;

public class A {
	public static void main(String[] args) {
		add(11, 22);
		
	} //end of main method
	
	static void add(int a, int b) {
		int c = a + b ;
		System.out.println("Sum is = "+c);
		sub(88,66);
	}
	
	static void sub(int a, int b) {
		int c = a -b ;
		System.out.println("Subtraction is = "+c);
		mult(23,9);
	}
	
	static void mult(int a, int b) {
		int c = a * b ;
		System.out.println("Multiplication is = "+c);
	}

}
