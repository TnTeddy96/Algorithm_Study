import java.util.Scanner;
	
public class Main{
	static void sort(int[] a) {
		int num = 0;
		for(int i = 0; i<a.length; i++) {
			for(int j = 1; j<a.length;j++) {
				if(a[j-1]>a[j]) {
					num = a[j-1];
					a[j-1] = a[j];
					a[j] = num;
				}
			}
		}
		for(int k  : a) {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArr = sc.nextInt();
		int[] numArr = new int[sizeArr];
		
		for(int i =0; i<numArr.length ;i++) {
			numArr[i] = sc.nextInt();
		}
		sort(numArr);
	}
}