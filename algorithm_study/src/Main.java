import java.util.Scanner;
/*WBWB
 * BWBW
 */
public class Main{
	static int check1(String a[][], int n, int m) {
		int count=0;
		for(int i = n;i<n+8;i++) {
			for(int j = m;j<m+8;j=j+2) {
				if(i%2==0) {
					if(!(a[i][j]+a[i][j+1]).equals("WB") &&(a[i][j]+a[i][j+1]).equals("BW"))
						count+=2;
					else if(!(a[i][j]+a[i][j+1]).equals("WB"))
						count++;
				}
				else {
					if(!(a[i][j]+a[i][j+1]).equals("BW")&&(a[i][j]+a[i][j+1]).equals("WB"))
						count+=2;
					else if(!(a[i][j]+a[i][j+1]).equals("BW"))
						count++;
				}
			}
		}
		return count;
	}
	/*BWBW
	 	WBWB
	 */
	static int check2(String a[][], int n , int m) {
		int count=0;
		for(int i = n;i<n+8;i++) {
			for(int j = m;j<m+8;j=j+2) {
				if(i%2==0) {
					if(!(a[i][j]+a[i][j+1]).equals("BW")&&(a[i][j]+a[i][j+1]).equals("WB"))
						count+=2;
					else if(!(a[i][j]+a[i][j+1]).equals("BW"))
						count++;
				}
				else {
					if(!(a[i][j]+a[i][j+1]).equals("WB")&&(a[i][j]+a[i][j+1]).equals("BW"))
						count+=2;
					else if(!(a[i][j]+a[i][j+1]).equals("WB"))
						count++;
				}
			}
		}
		return count;
	}
	static int manyLong(String a[][], int n, int m) {
		if(check1(a, n, m)<check2(a, n , m))
			return check1(a, n , m);
		else
			return check2(a, n, m);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=32;
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		//n*m 보드판
		String [][] chessB= new String[n][m];
		
		// 입력된 BW를 보드판에 저장
		for(int i =0;i<n;i++) {
			String line = sc.nextLine();
			for(int j = 0;j<m;j++) 
				chessB[i][j] = Character.toString(line.charAt(j));
		}

		//BW를 8*8 만큼만 검사 하고 불일치도(수정해야하는 판의 갯수) 중 작은값 num에 저장
		for(int i =0;i<n-7;i++) {				//		세로 
			for(int j = 0;j<m-7;j++) {		//		가로
				if(manyLong(chessB, i, j)<=num)
					num=manyLong(chessB, i, j);
			}
		}
		System.out.println(num);
	}
}