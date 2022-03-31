import java.util.Scanner;

public class Main{
	public static int time(String d, int i) {
		int vlaue=0;
		switch(d.charAt(i)) {
		case 'A':	case 'B':	case 'C':
			vlaue=3;
			break;
		case 'D':	case 'E':	case 'F':
			vlaue=4;
			break;
		case 'G':	case 'H':	case 'I':
			vlaue=5;
			break;
		case 'J':case 'K':case 'L':
			vlaue=6;
			break;
		case 'M':case 'N':case 'O':
			vlaue=7;
			break;
		case 'P':case 'Q':case 'R':case 'S':
			vlaue=8;
			break;
		case 'T':case 'U':case 'V':
			vlaue=9;
			break;
		case 'W':case 'X':case 'Y':case 'Z':
			vlaue=10;
			break;
		}
			return vlaue;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		int sum =0;
		for(int i =0;i<dial.length();i++)
			sum+=time(dial, i);
		System.out.println(sum);
	}
}