package basic;

public class Operation {
	public int add(int a, int b) {
		 int c = a + b;
		 return c;
	 }
	
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public int mult(int a, int b) {
		int c = a * b;
		return c;
	}
	
	public double div(double a, double b) {
		double c = a / b;
		return c;
	}
	
	public static void main(String[] args) {
		Operation oper = new Operation();
		int s = oper.add(79,23);
		System.out.println("Sum is >>> "+s);
		int sub = oper.sub(104, 59);
		System.out.println("Subtraction is >>> "+sub);
		int m = oper.mult(104, 59);
		System.out.println("Multiplication is >>> "+m);
		double d = oper.div(104, 59);
		System.out.println("Division is >>> "+d);
		
	}
	
	
		
	}


