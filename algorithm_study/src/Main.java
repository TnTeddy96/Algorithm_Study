import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
	
public class Main{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		int sizeArr = sc.nextInt();
		int[] numArr = new int[sizeArr];
		
		for(int i =0; i<numArr.length ;i++) {
			numArr[i] = sc.nextInt();
		}
		Arrays.sort(numArr);
		
		for(int k : numArr)
			bf.write(k + "\n");
		bf.close();
	}
}