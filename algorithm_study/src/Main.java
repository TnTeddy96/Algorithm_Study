	import java.util.Scanner;
	import java.util.ArrayList;
	
	
	public class Main{
		public static String whatsMvn(int m) {
			ArrayList<Character> list = new ArrayList<Character>();
			int count = 0;
			String mvN;
			for(int i = 666;;i++) {
				//mvN �� ���ڿ��� �ٲٱ�
				 mvN= Integer.toString(i); 
				 //mvN�� ĳ���� ��̸���Ʈ �� ����
				for(int j = 0;j<mvN.length();j++) {
					list.add(j, mvN.charAt(j));
				}
				
				for(int k = 0;k<list.size();k++){
					if(list.get(k)=='6'&&(k+2)<list.size()) {
						if(list.get(k+1)=='6'&&list.get(k+1)==list.get(k+2)) {
							count++;
							break;
						}
					}
				}
				//��� ����Ʈ �ʱ�ȭ
				list.clear();
				//m��° ��ȭ��� �ݺ��� Ż��
				if(count==m)
					break;
			}
			return mvN;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int mvS = sc.nextInt();
			System.out.println(whatsMvn(mvS));
		}
	}