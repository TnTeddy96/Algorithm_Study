import java.util.Scanner;

public class Main{
	static void save(Scanner sc, int n, int[] nArray){
		for(int i = 0; i<n;i++) {
			nArray[i] = sc.nextInt();
		}
	}
	static int[] cmp(int[] n, int num, int m) {
		int[] nArray2=new int[num]; // ū���� ���� �迭
		int sum=0;
		for(int i = 0;i<n.length;i++) {
			for(int j = i+1;j<n.length;j++) {
				if(j==n.length)
					break;
				for(int k = j+1;k<n.length;k++) {
					if(k==n.length)
						break;
					else if((n[i]+n[j]+n[k]<=m)&&(n[i]+n[j]+n[k]>sum))
						sum = n[i] + n[j] + n[k];
				}
			}
			nArray2[i] = sum;
		}
		return nArray2;
	}
	static int ans(int[] nArray2) {
		int num=0;
		
		for(int i = 0; i<nArray2.length;i++) {
			if(nArray2[i] >=num)
				num=nArray2[i];
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // �Է¹��� ���� ����
		int m = sc.nextInt();// �ִ밪
		int[] nArray = new int[n]; //�Է¹��� ���� ������ �迭 
		save(sc, n, nArray); // �Է¹��� ���� �迭�� ����
		System.out.println(ans(cmp(nArray, n,m)));
		
	}
}