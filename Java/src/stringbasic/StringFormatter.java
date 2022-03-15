package stringbasic;

public class StringFormatter {
	public static String capitalizeWord(String str){  
	    String words[]=str.split(" ");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	      capitalizeWord=capitalizeWord+first.toUpperCase()+afterfirst+" ";  
	    }  
	   return capitalizeWord.trim();  
	  //  System.out.println(capitalizeWord );
		//return capitalizeWord;
	} 
}
