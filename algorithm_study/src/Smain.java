import java.util.Scanner;

public class Smain {
	
	static void myNum(int[] w, int[] h, int n[]) {
		
		for(int i = 0;i<w.length;i++) {
			int num=1;
			for(int j = 0; j<w.length;j++) {
				if(w[i]<w[j]&&h[i]<h[j]) {			//��ġ�� �۴ٸ�
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
		
		// �ش� �迭�� �� ���� ����
		for(int i = 0; i<many;i++) {
			wei[i] = sc.nextInt();
			hig[i] = sc.nextInt();
		}
		//����� ���ؼ� �迭�� �ִ� �Լ�
		myNum(wei, hig, num);
		
		System.out.print(num[0]);
		for(int i = 1; i<num.length;i++) {
			System.out.print(" " + num[i]);
		}
	}

}
