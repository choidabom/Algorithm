package Inflearn.String;
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램
// 문장 속의 각 단어는 공백으로 구분된다.
// 가장 길이가 긴 단어가 여러 개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 답으로 한다.

import java.util.Scanner;

public class String_03 {
	public String solution(String str) {
		// 방법 1
		String answer = "";
		//int m = Integer.MIN_VALUE; // 이 문제에서는 값이 음수가 없기 때문에 0으로 초기화해도 상관없다.
		String[] s = str.split(" "); // 문자열을 공백을 기준으로 String 배열을 만듬
		//System.out.println(Arrays.toString(s)); // 공백을 기준으로 문자열을 배열로 분리해준다.
		
//		for(String x : s) { // 배열이기 때문에 for each문 가능하다.
//			int len = x.length();
//			if(len > m) {
//				m = len;
//				answer = x;
//			}
//		}
		// 더 직관적인 for문 같다
		for(String x:s) {
			if(x.length() > answer.length()) {
				answer = x;
			}
		}
		
		// 방법 2 .... 어렵다... 다시 보기
		
//		String answer = "";
//		int m = Integer.MIN_VALUE, pos; // pos: 문장 안에서 단어와 단어 사이에 존재하는 공백문자의 인덱스 위치를 저장하기 위한 변수
//		while((pos=str.indexOf(' '))!= -1){ // 띄어쓰기를 발견 못 하면 -1을 return, 발견하면 인덱스 번호를 return
//			String tmp = str.substring(0, pos);
//			int len = tmp.length();
//			if(len > m) {
//				m = len;
//				answer = tmp;
//			}
//			str=str.substring(pos+1);
//		}
//		if(str.length()>m) answer = str; // 마지막 단어 처리를 해줘야한다.
//		
		return answer;
	}
	
	public static void main(String[] args) {
		String_03 T = new String_03();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine(); 
		// next()랑 nextLine()이랑 많이 다르다 ^_____^
		// kb.next()와 같은 방식으로 입력 받을 경우에는 띄어쓰기 이전의 문자까지 밖에 입력 받을 수 없다.
		// 단어가 아니라 문장을 입력받아야하기 때문에 nextLine()을 쓴다.
		kb.close();

		System.out.println(T.solution(str));
	}
}

//it is time to study
//-> study
//eitoiw iruow witouweiotwiowioei eiiuow e
//-> witouweiotwiowioei
