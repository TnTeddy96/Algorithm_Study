import java.util.Scanner;

public class Main{
	static boolean groupWordsChecker(String g){

		for(int i= 0;i<g.length();i++) {
			int where = 0;
			for(int k = 1; k<g.length();k++) {
				if((Character.compare(g.charAt(k-1),g.charAt(i)) == 0 )&&(Character.compare(g.charAt(i), g.charAt(k))!=0)) {
					where=k+1;
					break;
				}
			}
			if(where==0)
				return true;
			for(int p = where ; p<g.length();p++) {
				if(g.charAt(p)==g.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int many = sc.nextInt();
		int count = 0;
		for(int i = 0; i<many;i++) {
			String groupWords = sc.next();
			if(groupWordsChecker(groupWords)==true)
				count+=1;
		}
		System.out.print(count);
	}
}