import java.util.Scanner;

public class Main{
	
	static int manyLong(String a[][], int n, int m) {
		int count = 0;	//불일치도
		String match;
		String nMatch;
		if(a[n][m].charAt(0)=='W') {
			match = "WB";
			nMatch = "BW";
		}
		else {
			match = "BW";
			nMatch = "WB";
		}
		if(n%2==0) {
			for(int i = n;i<n+8;i++) {
				for(int j = m;j<m+8;j=j+2) {
					if(i%2==1) 
						if(!(a[i][j] + a[i][j+1]).equals(nMatch)) 
							count++;
					else 
						if(!(a[i][j] + a[i][j+1]).equals(match)) 
							count++;
				}
			}
		}
		else {
			for(int i = n;i<n+8;i++) {
				for(int j = m;j<m+8;j=j+2) {
					if(i%2==1) 
						if(!(a[i][j] + a[i][j+1]).equals(nMatch)) 
							count++;
					else 
						if(!(a[i][j] + a[i][j+1]).equals(match)) 
							count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int num =64;
		//n*m 보드판
		String [][] chessB= new String[n][m];
		
		// 입력된 BW를 배열에 저장
		for(int i =0;i<n;i++) 
			for(int j = 0;j<m;j++) 
				chessB[i][j] = Character.toString(sc.nextLine().charAt(j));
		
		for(int i = 0;i<n;i++)
			for(int j = 0;j<m;j++)
				System.out.print(chessB[i][j]);
		//count 를 저장할 Array 선언
		int[] notMatchNum = new int[(n-7)*(m-7)];
		
		for(int i =0;i<n;i++) {
			if(n-i<7)
				break;
			else
				for(int j=0;j<m;j++) {
					if(m-j<7)
						break;
					else 
						notMatchNum[j] = manyLong(chessB, i, j);
				}
		}
		for(int i=0;i<notMatchNum.length;i++) {
			if(notMatchNum[i]<num)
				num=notMatchNum[i];
		}
		System.out.println(num);
	}
}