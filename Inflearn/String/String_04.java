package Inflearn.String;
import java.util.*;

//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
//첫 줄에 자연수 N(3<=N<=10) 주어짐.
//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어짐,
//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어 출력한다.


public class String_04 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str){
			String tmp = new StringBuilder(x).reverse().toString();
			// StringBuilder도 문자열을 다루는 클래스이다. 문자열을 다루는 메서드가 많다.
			// 예를 들면 good이라는 단어가 StringBuilder의 객체로 만들어진 것

			// String이 있음에도 StringBuilder를 왜 쓰는가? => 객체 하나로 가능, 여러개 안 만들어져서 메모리 낭비 없음
			// String은 더하거나 3replace()했을 때 새로운 객체가 생성됨. 
			answer.add(tmp); // ArrayList에 더하는 것 add
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String_04 T = new String_04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); 		// N이 주어짐
		String[] str = new String[n];	// N개의 단어가 각 줄에 하나씩 주어짐 
		
		for(int i=0; i<n; i++){
			str[i] = kb.next();
		} 
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		
		kb.close();
	}
}


/*
3
good
Time
Big

doog
emiT
giB
*/

/* 
//#2
public class String_04 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>(); // 단어가 하나가 아닌 여러개를 받아 처리해야하므로 ArrayList 사용
		for(String x : str){
			char[] s = x.toCharArray(); // 문자 배열화
			int lt = 0, rt = x.length()-1;	// 밖에서부터 안으로 서로 바꿔들어간다. 
			while(lt<rt){	
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); // valueOf는 static으로 선언된 메서도, char[]도 Stirng으로 변환 가능
			answer.add(tmp);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String_04 T = new String_04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); 		// N이 주어짐
		String[] str = new String[5];	// N개의 단어가 각 줄에 하나씩 주어짐 
		
		for(int i=0; i<n; i++){
			str[i] = kb.next();
		} 
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		
		kb.close();
	}
}
*/

//#3
/*
 public class String_04 {
	public String[] solution(int n, String[] arr) {
        String[] answer = new String[n]; 
        for (int i = 0; i < n; i++) {
			answer[i]="";	// String 배열을 만들면 기본적으로 null 값으로 초기화되기 때문에
			for (int k = arr[i].length() - 1; k >= 0; k--) {
                answer[i] += arr[i].charAt(k);
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		String_04 T = new String_04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); 		// N이 주어짐
		String[] str = new String[n];	// N개의 단어가 각 줄에 하나씩 주어짐 
		
		for(int i=0; i<n; i++){
			str[i] = kb.next();
		} 
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		
		kb.close();
	}
}

 */