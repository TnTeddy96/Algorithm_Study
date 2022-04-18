	import java.util.Scanner;
	import java.util.ArrayList;
	
	
	public class Main{
		public static String whatsMvn(int m) {
			ArrayList<Character> list = new ArrayList<Character>();
			int count = 0;
			String mvN;
			for(int i = 666;;i++) {
				//mvN 을 문자열로 바꾸기
				 mvN= Integer.toString(i); 
				 //mvN을 캐릭터 어레이리스트 에 저장
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
				//어레이 리스트 초기화
				list.clear();
				//m번째 영화라면 반복문 탈출
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