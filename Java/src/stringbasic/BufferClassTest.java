package stringbasic;

public class BufferClassTest {
	 
	// replace method of Buffer class
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("shantaram");
		sb.replace(2, 6, "****");
		System.out.println(sb); 
	}

}
