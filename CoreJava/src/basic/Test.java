package basic;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.enrollmentno = 121;
		s1.name = "Shantaram";
		s1.dob = "26-Aug-1996";
		s1.email = "srlande2222@gmail.com";
		s1.gender = "M";
		s1.current_year = 2021;
		
		Student s2 = new Student();
		s2.enrollmentno = 122;
		s2.name = "Kishor";
		s2.dob = "02-jan-2004";
		s2.email = "kishor12@2gmail.com";
		s2.gender = "M";
		s2.current_year = 2021;
		
		Student s3 = new Student();
		s3.enrollmentno = 331;
		s3.name = "Sneha";
		s3.dob = "26-march-1996";
		s3.email = "sneha14@gmail.com";
		s3.gender = "F";
		s3.current_year = 2021;
		
		System.out.println("Student name :- "+s2.name);
		System.out.println(s1.enrollmentno);
		System.out.println(s2.dob);
		System.out.println(s3.email);
		System.out.println(s3.gender);
		System.out.println(s1.current_year);
		
		
}
	 

	}

 
 
