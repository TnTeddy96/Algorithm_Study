import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	ArrayList <Integer> list = new ArrayList<>();
        while(true){
            String a = br.readLine();
            StringTokenizer st = new StringTokenizer(a);
          
            int x = Integer.parseInt(st.nextToken());
            if(x==0)
            	break;
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if(x>y&&x>z) {
            	if(x*x==(y*y+z*z)) {
            		list.add(1);
            	}
            	else
            		list.add(0);
            }
            else if(y>z&&y>x) {
            	if(y*y==(x*x+z*z)) {
            		list.add(1);
            	}
            	else
            		list.add(0);
            }
            else
            	if(z*z==(x*x + y*y)) {
            		list.add(1);
            	}
            	else
            		list.add(0);
        }
        for(int i =0;i<list.size();i++) {
        	if(list.get(i)==1)
        		bw.write("right" + "\n");
        	else
        		bw.write("wrong" + "\n");
        }
        bw.flush();
        bw.close();
    }
}