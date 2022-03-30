import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count= 0;
		String s = sc.nextLine();
		StringTokenizer st  = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		System.out.print(count);
	}
}