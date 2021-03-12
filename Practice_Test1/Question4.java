package Practicetest1;

public class Question4 {

	public static void main(String[] args) {
		 Question4 test = new Question4();

		    System.out.println(" " + test.mixString("abc", "xyz") + " ");
		    System.out.println(" " + test.mixString("Hi", "There") + " ");
		    System.out.println(" " + test.mixString("xxxx", "There") + " ");
		  }

		  public String mixString(String a, String b) {
		    String result = "";
		    int index = 0;
		    
		    if(a.length()>=b.length()) index = b.length();
		    if(a.length()<=b.length()) index = a.length();  
		    
		    
		    for(int i=0; i<index; i++){
		      result += a.substring(i, i+1) + b.substring(i, i+1);
		    }
		    
		    if(a.length() < b.length()) result += b.substring(a.length(), b.length());
		    if(a.length() > b.length()) result += a.substring(b.length(), a.length());
		    
		    return result;

	}

}
