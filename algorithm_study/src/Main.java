import java.io.*;

public class Main{
	static public void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] b = new int[3];
		
		int firstNum = Integer.parseInt(br.readLine());
		
		String secNum=br.readLine();
		
		for(int i =0;i<b.length;i++) {
			b[i]=secNum.charAt(i) - '0';
		}
		int j =0;
		int sum = 0;
		for(int i =2;i>-1;i--) {
			bw.write(String.valueOf(firstNum*b[i])+"\n");
			sum+=firstNum*b[i]*Math.pow(10, j);
			j++;
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}