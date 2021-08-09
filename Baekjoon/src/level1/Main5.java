package level1;

//두 수를 입력받고 합을 출력하는 문제
//방법1: Scanner로 입력받아 연산하는 방법
//방법2: BufferedReader로 입력받아 연산하는 방법
//readLine(): 한 행을 읽어옴. read(): 한 문자만 읽어옴.
//readLine()은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해줘야함.
//문자열 분리 방법 1. StringTokenizer 클래스를 이용하여 분리해주는 방법 2. split()을 이용하는 방법


//방법1
//Scanner 객체를 생성하여 두 수를 입력받은 후 출력
//생성한 Scanner 객체는 불필요한 리소스 낭비를 막기 위해 입력을 받은 후에는 종료해주는 것이 좋다.

//import java.util.Scanner;
//
//public class Main5 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		System.out.println(A+B);
//		
//		in.close();
//	}
//	
//}

////방법2-1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main5{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
	}
}

//// java.util.NoSuchElementException는 존재하지 않는 것을 가져오려고 할 때 발생
//


//방법2-2 
//br.readLine()을 통해 읽어온 것을 split(" ")하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법이다.


//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class Main5{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String[] str = br.readLine().split(" ");
//		int a = Integer.parseInt(str[0]);
//		int b = Integer.parseInt(str[1]);
//		
//		System.out.println(a+b);
//	}
//}







