import java.util.Scanner;

public class Main{
	static int manyAlpha(String c) {
		int count = 1;
		for( int i = 1; i<c.length();i++) {
			if(c.charAt(i)=='-')
				continue;
			else if(c.charAt(i)=='j') { 
				if(c.charAt(i-1)=='l' || c.charAt(i-1)=='n')
					continue;
			}
			else if(c.charAt(i)=='=') {
				if(i>=2) {
					if(c.charAt(i-1)=='z'&&c.charAt(i-2)=='d') 
						count--;
				}
				continue;
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cAlpha = sc.next();
		System.out.println(manyAlpha(cAlpha));
	}
}