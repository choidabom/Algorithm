
// //N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷� �ۼ�
// //ù �ٿ� �ڿ��� N(3<=N<=10) �־���.
// //�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־���,
// //N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ������ ����Ѵ�.

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
// //		int n = kb.nextInt();			// ù �ٿ� �ڿ��� N�� �־���.
// //		String[] str = new String[n];	// N���� �ܾ�
// //		// String[] str = kb.nextLine();//�迭�� nextLine()���� ���� �� ��.
// //		for(int i=0; i<n; i++) {		
// //			str[i] = kb.next();			// N���� �ܾ �Է¹���.
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
