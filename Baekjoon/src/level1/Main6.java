package level1;

//�� ���� �Է¹ް� ������ �� ����� ����ϴ� ����

//���1

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


//���2

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
/* ���� String ���� ���� ���ϰ� �Է°� ���ÿ� �����ڷ� �и����൵ �ȴ�.
 *      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine();, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a-b);
 */

//java.util.NoSuchElementException�� �������� �ʴ� ���� ���������� �� �� �߻�


