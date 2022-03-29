import java.util.Scanner;
public class Main {

	public static void find(String w) {
		char where = 'a';
		int i_where=0;
		for(int i =0;i<26;i++) {
			for(int j = 0; j<w.length();j++) {
				if(w.charAt(j) ==where){
					i_where=j;
					break;
				}
				else
					i_where=-1;
			}
			where++;
			System.out.print(i_where + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		find(s);
	}

}
