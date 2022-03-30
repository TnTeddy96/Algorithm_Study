import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static String  make(String s, int r) {
		char g;
		String P="";
		for(int i=0;i<s.length();i++) {	
			for(int j =0;j<r;j++) {
				g=s.charAt(i);
				P = P + g;
			}
		}
		return P;
	}
	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String>  list = new ArrayList<>();
		int many = sc.nextInt();
		System.out.println();
		for(int i =0;i<many;i++) {
			int r = sc.nextInt();
			String s =sc.next();
			list.add(make(s, r));
		}
		for(int i =0;i<many;i++) {
			System.out.println(list.get(i));
		}
	}
}		