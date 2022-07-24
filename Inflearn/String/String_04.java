
// //N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
// //첫 줄에 자연수 N(3<=N<=10) 주어짐.
// //두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어짐,
// //N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어 출력한다.

// import java.util.*;
// //
// //public class String_04 {
// //	public ArrayList<String> solution(int n, String[] str) {
// //		ArrayList<String> answer = new ArrayList<String>();
// //		
// //		return answer;
// //	}
// //	public static void main(String[] args) {
// //		String_04 T = new String_04();
// ////	Scanner kb = new Scanner(System.in);
// //		int n = kb.nextInt();			// 첫 줄에 자연수 N이 주어짐.
// //		String[] str = new String[n];	// N개의 단어
// //		// String[] str = kb.nextLine();//배열은 nextLine()으로 받지 못 함.
// //		for(int i=0; i<n; i++) {		
// //			str[i] = kb.next();			// N개의 단어를 입력받음.
// //		}
// //		
// //		
// //		System.out.println(T.solution(n, str));
// //	}
// //}



// public class String_04 {
// 	/*
// 	public String solution(String str) {
// 		String answer = "";
		
		
		
// 		for(int i = arr[-1]; i >= 0 ; i--) {
// 			answer += arr[i];
// 		}
		
// 		return answer;
// 	}
// 	*/
// 	public static void main(String[] args) {
// 		String_04 T = new String_04();
// 		Scanner kb = new Scanner(System.in);
// 		String str = kb.nextLine();
// 		kb.close();
// 		String answer = "";
// 		//System.out.println(T.solution(str));
// 		char[] arr = str.toCharArray();
// 		/*
// 		 * int i = 0;
// 		while(i <= arr.length) {
// 			answer += arr[i];
// 			i--;
// 			if(i==0) {
// 				break;
// 			}
// 		}
// 		System.out.println(answer);
// 		*/
// 		for(int i = arr.length; i >= 0 ; i--) {
// 			answer += arr[i];
// 		}
// 		System.out.println(answer);
// 	}

// }
