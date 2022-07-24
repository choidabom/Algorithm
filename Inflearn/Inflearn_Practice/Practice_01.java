package Inflearn.Inflearn_Practice;

// 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
// 대소문자 구분 x
// 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어짐.
// 첫 줄에 해당 문자 개수 출력
import java.util.Scanner;

public class Practice_01 {
	public int solution(String str, char ch) {
		int answer = 0;
		str = str.toUpperCase();
		//내가 짠 코드
		//ch = ch.charAt(0).toUpperCase();
		
		ch=Character.toUpperCase(ch); //문자니깐 Character라는 클래스에 있는 메소드 사용
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Practice_01 T = new Practice_01(); //객체 생성
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char ch = kb.next().charAt(0); // 한 문자 받기
		System.err.println(T.solution(str, ch));
	}
}


//public class Practice_01 {
//	public static void main(String[] args) {
//		Scanner kb = new Scanner(System.in);
//		String str = kb.next();
//		char ch = kb.next().charAt(0); //인덱스 0으로 접근
//		System.out.println(str);
//		System.out.println(ch);
//	}
//}
