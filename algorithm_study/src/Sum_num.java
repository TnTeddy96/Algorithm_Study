import java.util.Scanner;

public class Sum_num {

	public static int num_sum(int m, String n) {
		char g;
		int val=0;
		int sum=0;
		for(int i =0; i<m; i++) {
			g=n.charAt(i);
			val=g-'0';
			sum+=val;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int many = sc.nextInt();
		String num = sc.next();
		System.out.println(num_sum(many, num));
	}

}
