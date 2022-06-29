import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		
		StringTokenizer st = new StringTokenizer(line);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int i =0;
		if((v-a)%(a-b)!=0){
			i=(v-a)/(a-b)+1+1;
		}
		else {
			i=(v-a)/(a-b)+1;
		}
		
		bw.write(String.valueOf(i));
		bw.flush();
		bw.close();
	}
}