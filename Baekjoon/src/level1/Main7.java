package level1;

//방법1

//import java.util.Scanner;
//
//public class Main7 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
////객체를 생성해주는데 Scanner(System.in)에서 System.in은 입력한 값을 Byte 단위로 읽는 것을 뜻한다.
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//				
//		System.out.println(A*B);
//		
//		in.close();
//	}
//}

//방법2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main7{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		System.out.println(A/B);
	}
}
