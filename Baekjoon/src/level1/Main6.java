package level1;

//두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제

//방법1

//import java.util.Scanner;
//
//public class Main6 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		System.out.println(A-B);
//      in.close();
//	}
//}


//방법2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main6{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a-b);
	}
}
/* 굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 *      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine();, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a-b);
 */

//java.util.NoSuchElementException는 존재하지 않는 것을 가져오려고 할 때 발생


