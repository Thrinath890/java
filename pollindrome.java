package String;

public class Pollindrome {
	public static void main(String[] args) {
		System.out.println(ispollindrome("malayalam"));
		
	}
	  static boolean ispollindrome(String s) {
		char[] a=s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
