package level1;

//���1

//import java.util.Scanner;
//
//public class Main7 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
////��ü�� �������ִµ� Scanner(System.in)���� System.in�� �Է��� ���� Byte ������ �д� ���� ���Ѵ�.
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//				
//		System.out.println(A*B);
//		
//		in.close();
//	}
//}

//���2

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
