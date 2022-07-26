package Inflearn.String;

//대문자와 소문자가 같이 존재하는 문자열을 입력받아
//대문자는 소문자로, 소문자는 대문자로 변환하여 출력하는 프로그램

//첫 줄에 문자열이 입력된다. 문자열의 길이 100 넘지 않음
//문자열은 영어 알파벳만으로 구성됨.

import java.util.Scanner;

public class String_02 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) { //str를 기반으로 해서 문자배열이 생성됨.
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
			
//			 아스키 코드로 문제를 풀 수 있음, 대문자: 65~90, 소문자 : 97~122
//			 so, 소문자에서 32를 빼면 대문자가 된다.
//			if(x>=97 && x <=122) answer+=(char)(x-32); //문자로 변경되기 때문에 (char)추가
//			else answer+=(char)(x+32);
		}
		
		return answer;		
	}
	public static void main(String[] args) {
		String_02 T = new String_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		kb.close();

		System.out.println(T.solution(str));
		

	}

}
