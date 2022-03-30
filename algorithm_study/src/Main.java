import java.util.Scanner;

public class Main{
	public static int count(String g, int m) {
		char alp = 'A';
		alp = ((char)((int)alp + m));
		int count = 0;
		for(int i= 0; i<g.length();i++) {
			if((g.charAt(i)==alp)||(g.charAt(i)==((char)((int)alp+32)))) {
				count ++;
			}
		}
		return count;
	}
	public static void compare(int arr[]) {
		int count=0;
		int where =0;
		int i_where = 0;
		char alp = 'A';
		for(int  i = 0; i<arr.length;i++) {
			if(arr[i]==0)
				continue;
			else
				if(where<arr[i]) {
					where = arr[i];
					count = 0;
					i_where=i;
				}
				else if(where==arr[i]) {
					count++;
				}
		}
		alp =(char)((int)alp + i_where);
		if(count>0) 
			alp = '?';
		System.out.println(alp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String given = sc.next();
		int[] countArray = new int[26]; //return 받은 카운트를 저장할 배열
		
		for(int i = 0; i<26; i++) 
			countArray[i] = count(given, i);
		compare(countArray);
	}
}