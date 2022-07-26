package Inflearn.String;

//한 개의 문자열을 입력받고, 
//특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//문자열은 영어 알파벳으로만 구성되어 있습니다.

//=> 빈도수 세는 문제

import java.util.Scanner;

public class String_01 {
	public int solution(String str, char t) {
		int answer = 0;
		//대소문자를 구분하지 않기 때문에 str도 대문자로 바꾸고, t도 대문자로 바꿔버리면 됨.
		str = str.toUpperCase();
		t=Character.toUpperCase(t); //문자니깐 Character라는 클래스에 있는 메소드 사용
		//System.out.println(str+""+t);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) { //문자열을 인덱스하려면 charAt 사용
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) { // static에서 인스턴스 메소드를 호출하려면 객체 생성해야함.
		String_01 T = new String_01();
		Scanner kb = new Scanner(System.in); // kb는 keyboard 약자
		String str = kb.next(); // 문자열 하나 읽어들이는거
		char c = kb.next().charAt(0); //문자열이라고 생각하고 거기서 인덱시 첫번째꺼 
		kb.close();

		System.out.print(T.solution(str, c)); // solution을 호출한 것
	}

}
