package basic;

public class MathsOper {// class start from here

	public static void main(String[] args) {    // is  this main method
		//Arithmatic operations code
	  int a = 40;
	  int b = 10;
	  int c= 7;
	  int add = a+b;
	  int sub = a-b;
	  int multi = a*b;
	  int div = a/b;
	  int mod = a%b;
	  
	  //code for calculating area
	  int rect = a*b;
	  double circle = 3.14*c*c;
	  int square = c*c;
	  
	  
	  System.out.println("ARITHMATIC OPERATIONS");
	  System.out.println("------------------------");
	  System.out.println("Addition is = " +add);
	  System.out.println("Subtraction is = " +sub);
	  System.out.println("Multiplication is = "+multi);
	  System.out.println("Division is = "+div);
	  System.out.println("Modulus is = "+mod);
	  System.out.println("=========================");
	  System.out.println("CALCULATION OF AREA");
	  System.out.println("-------------------------");
      System.out.println("Area of rectangle b = 10 & l = 40 is =  " +rect);
      System.out.println("Area of circle having Radius 7 is =  " +circle);
      System.out.println("Area of square having side 7 is =  "+square);
      
 
	}

} // end of class
