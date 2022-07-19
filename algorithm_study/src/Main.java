import java.io.*;
import java.util.Arrays;	
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		char[] arr = new char[num.length()];
		Integer[] intArr = new Integer[num.length()];
		for(int i =0;i<num.length();i++){
			arr[i] = num.charAt(i);
		}
		for(int i =0;i<num.length();i++){
		intArr[i]=arr[i]-'0';	
		}
		Arrays.sort(intArr, Collections.reverseOrder());
		
		for(int i=0;i<intArr.length;i++) {
			bw.write(String.valueOf(intArr[i]));
		}
		
		bw.flush();
		bw.close();
	}
}