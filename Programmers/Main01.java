// 프로그래머스 Level 1 문자열 내 p와 y의 개수

// 대문자, 소문자가 섞여있는 문자열 s
// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return하는 solution 완성하시오.
// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴
// 단, 개수를 비교할 때는 대문자와 소문자를 구별하지 않음 => 다 대문자로 바꿔도 되고, 다 소문자로 바꿔도 됨.

import java.util.*;
public class Main01 {
	public boolean solution(String str) {
		boolean answer = true;
		int p = 0, y = 0;
		for(int i= 0; i < str.length(); i++) {
			if(str.charAt(i)=='p' || str.charAt(i) == 'P') { // 대소문자 구별 x
				p++;
			}
			else if(str.charAt(i)=='y' || str.charAt(i) == 'Y') { // 대소문자 구별 x
				y++;
			}		
		}
		
		if(p != y) {
			answer = false;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main01 T = new Main01();
		Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
		kb.close();
	}
}

//pPoooyY
//true
//Pyy
//false


//대문자를 소문자로 바꾸는 코드(소문자를 대문자로 바꿀 수도 있음)

//import java.util.*;
//public class Main01 {
//	public static void main(String[] args) {
//		Main01 T = new Main01();
//		Scanner kb = new Scanner(System.in);
//     String str = kb.next();
// 	for(char x : str.toCharArray()) { // str를 기반으로 해서 문자배열이 생성됨.
//			if(Character.isLowerCase(x)) Character.toUpperCase(x);
//			System.out.println(x);
//		}  
//	}
//}


// 정답률 60% 나왔던 오답
/*
import java.util.*;
public class Main01 {
	public boolean solution(String str) {
		boolean answer = false;
		int count1 = 0; // 횟수 세기
		int count2 = 0; // 횟수 세기
		
		for(char x : str.toCharArray()) { //str를 기반으로 해서 문자배열이 생성됨.
			if(Character.isLowerCase(x)) Character.toUpperCase(x); // 소문자를 대문자로 바꿈.
			
		}
		
		for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='p') {
            	count1++; 
            }
            else if(str.charAt(i)=='y') {
            	count2++; 
            }
            else if(!((str.charAt(i)=='y')&&(str.charAt(i)=='p'))) {
            	answer = true;
            }
		}
		
		if(count1==count2) answer = true;
		else if(count1 == 0 && count2 == 0) answer = true;
		else answer = false;

		return answer;
	}
	
	public static void main(String[] args) {
		Main01 T = new Main01();
		Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
	}
}
*/

// 오빠가 푼 코드
/*
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0, y = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                p++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                y++;
        }
        if(p != y) return false;

        return answer;
    }
}
*/
