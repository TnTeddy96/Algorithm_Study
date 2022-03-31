import java.util.Scanner;

public class Main{
	public static int SangSoo(int i) {
		i+= (i%10)*100-(i%10)+(i/100)-(i/100)*100;
		return i;
	}
	public static void compareNum(int i, int j) {
		if(i>j)
			System.out.println(i);
		else
			System.out.println(j);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		compareNum(SangSoo(num1),SangSoo(num2));
	}
}