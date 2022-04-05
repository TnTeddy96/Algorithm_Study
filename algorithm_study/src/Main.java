import java.util.Scanner;

public class Main{
	static int breakEvenPoint(int f, int v, int p) {
		if(p-v<=0)
			return -1;
		else {
			return (((p-v)+f)/(p-v));
		}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fixMoney = sc.nextInt();
		int varMoney = sc.nextInt();
		int price = sc.nextInt();
		System.out.println(breakEvenPoint(fixMoney, varMoney, price));
	
	}
}