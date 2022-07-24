package Inflearn.Inflearn_Practice;
// 대문자와 소문자가 같이 존재하는 문자열을 입력받아
// 대문자는 소문자로, 소문자는 대문자로 변환하는 프로그램
// 첫 줄에 문자열이 입력된다. 문자열 길이 100 안 넘음

import java.util.*;

public class Practice_02 {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
		}

		return answer;
	}
	public static void main(String[] args) {
		Practice_02 T = new Practice_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //문자열 입력받기
		System.out.println(T.solution(str)); 
	}
}


// String.toCharArray() 문자열을 char형 배열로 바꿔줌
//public class Practice_02 {
//	public static void main(String[] args) {
//		String str = "Hello, world!";
//		
//		char[] arr = str.toCharArray(); // char형 배열 생성
//		
//		// Java에서 배열의 길이를 구하기 위해서는 배열의 length 속성을 사용해야한다.
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		
//		// 추가) char형 배열 합쳐서 문자열로 만들기
//		String s = new String(arr);
//		System.out.println(s);
//	}
//}
