package Inflearn.Inflearn_Practice;
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램
// 문장 속의 각 단어는 공백으로 구분된다.
// 가장 길이가 긴 단어가 여러 개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 답으로 한다.

import java.util.Arrays;
import java.util.Scanner;

public class Practice_03 {
	public String solution(String str) {
		String answer = "";
		String[] words = str.split(" "); // 문자열을 공백을 기준으로 배열을 만든
		//System.out.println(Arrays.toString(words)); // 공백을 기준으로 문자열을 배열로 분리해준다.
		System.out.println(Arrays.toString(words));
		

		//왜 틀리지??????????
		
//		for(int i=0; i<words.length; i++) { // 배열의 길이를 셀 때는 length를 사용한다.
//			if(words[i].length()> words[i+1].length()) {
//				answer = words[i]; 
//			}
//			else if(words[i].length()== words[i+1].length()) {
//				answer = words[i];      // 가장 길이가 긴 단어가 여러 개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
//			}
//			else {
//				answer = words[i+1];
//			}
//		}
		return answer;
	}
	public static void main(String[] args) {
		Practice_03 T = new Practice_03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); 
		// next()랑 nextLine()이랑 많이 다르다 ^_____^
		// 단어가 아니라 문장을 입력받아야하기 때문에 nextLine()을 쓴다.
		
		System.out.println(T.solution(str));
	}
}


