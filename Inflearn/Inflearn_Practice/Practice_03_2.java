package Inflearn.Inflearn_Practice;
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력
// 문장 속의 각 단어는 공백으로 구분됨
// 첫 줄에 가장 긴 단어를 출력, 가장 길이가 긴 단어가 여러 개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 답으로
import java.util.*;

public class Practice_03_2 {
	public String solution(String str) {
		String answer="";
		String[] s = str.split(" "); //문자열을 공백을 기준으로 나눈 배열
		//it is time to study
		//["it", "is", "time", "to", "study"]
		
		for(String x : s) { // for each문에서는 배열을 넣어야함.
			if(x.length() > answer.length()) {
				answer = x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_03_2 T = new Practice_03_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //문자열을 입력받아야하기 때문에 nextLine() 사용
		System.out.println(T.solution(str));
	}
}
