package level2;

import java.util.Scanner;

public class Main1_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
		
		//방법 1
//		if (A > B) {
//			System.out.println(">");
//		}
//		if (A < B) {
//			System.out.println("<");
//		}
//		if (A == B) {
//			System.out.println("==");
//		}
		
		//방법 2
//		if (A > B) System.out.println(">");
//		else if (A < B) System.out.println("<");
//		else System.out.println("==");
		
		//방법 3
		//조건문을 좀 더 획기적으로 줄일 수 있는 방법 => 삼항연산자!
		// 변수 = (조건문) ? (true일 때의 연산) : (false일 때의 연산);
		String str = (A>B) ? ">" : ((A<B) ? "<" : "=="); //삼항연산자를 중첩
		System.out.println(str);
	}
}



