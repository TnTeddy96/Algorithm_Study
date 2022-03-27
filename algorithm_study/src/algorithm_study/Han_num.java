package algorithm_study;
import java.util.*;
//1065번 한수
//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
//N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램 
public class Han_num {
	static boolean han_num(int i) {
		if(i<100)
			return true;
		else
			if((((i/10)%10)-(i%10))==((i/100)-((i/10)%10)))
				return true;
			else
				return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();
		for (int i =1; i<=num; i++) {
			if(han_num(i)==true)
					count++;
		}
		System.out.println(count);
		sc.close();
	}

}
