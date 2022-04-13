import java.util.Scanner;

public class Smain {
	
	static void myNum(int[] w, int[] h, int n[]) {
		
		for(int i = 0;i<w.length;i++) {
			int num=1;
			for(int j = 0; j<w.length;j++) {
				if(w[i]<w[j]&&h[i]<h[j]) {			//덩치가 작다면
					num++;
				}
			}
			n[i] = num;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int many = sc.nextInt();
		
		int[] wei = new int[many];
		int[] hig = new int[many];
		int[] num = new int[many];
		
		// 해당 배열에 각 값을 저장
		for(int i = 0; i<many;i++) {
			wei[i] = sc.nextInt();
			hig[i] = sc.nextInt();
		}
		//등수를 구해서 배열에 넣는 함수
		myNum(wei, hig, num);
		
		System.out.print(num[0]);
		for(int i = 1; i<num.length;i++) {
			System.out.print(" " + num[i]);
		}
	}

}
