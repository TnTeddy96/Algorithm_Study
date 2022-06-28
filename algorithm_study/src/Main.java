import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[9];
		for(int i = 0; i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int where= 0;
		int max = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				where=i + 1;
			}
		}
		bw.write(max + "\n" + where);
		bw.flush();
		br.close();
	}
}