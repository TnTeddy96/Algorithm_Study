package algorithm_study;
import java.util.*;
//1065�� �Ѽ�
//� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
//N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷� 
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
