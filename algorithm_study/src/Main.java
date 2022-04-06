import java.util.Scanner;

public class Main{
	
	static int room(int n) {
		if(n==1)
			return n;
		int min;
		int max;
		for(int i = 0;;i++) {
			min = (int)(2+3*i*(i+1));
			max =(int)(1+3*(i+1)*(i+2));
			if((min<=n)&&(n<=max))
				return i+2;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print(room(num));
	}
}