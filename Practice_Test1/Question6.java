package Practicetest1;

public class Question6 {

	public String repeatFront(String str, int n) {
		StringBuilder res = new StringBuilder();
		res.append(str.substring(0, n));
		while(n>0) {
			res.append(str.substring(0, n-1));
			n--;
		}
		return res.toString();
	}
	public static void main(String[] args) {
		Question6 t6 = new Question6();
		System.out.println(t6.repeatFront("Ice Cream", 2));
	}
}

