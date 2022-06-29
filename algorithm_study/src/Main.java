import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num =Integer.parseInt(br.readLine());
		
		int i;
		for(i=0;;i++) {
			if(num<10 || num==12)
				break;
			num-=5;
		}
		if(num==8) {
			i=i+1+1;
		}
		else if(num==5) {
			i=i+1;
		}
		else if(num==3 || num==6 || num==9 ) {
			i+=num/3;
		}
		else {
			i=-1;
		}
		bw.write(String.valueOf(i));
		bw.flush();
		bw.close();
	}
}