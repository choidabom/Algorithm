package level1;

//�� ���� �Է¹ް� ���� ����ϴ� ����
//���1: Scanner�� �Է¹޾� �����ϴ� ���
//���2: BufferedReader�� �Է¹޾� �����ϴ� ���
//readLine(): �� ���� �о��. read(): �� ���ڸ� �о��.
//readLine()�� �� ���� ���� �б� ������ ��������� �Է��� �� ���ڿ��� ��������� �и��������.
//���ڿ� �и� ��� 1. StringTokenizer Ŭ������ �̿��Ͽ� �и����ִ� ��� 2. split()�� �̿��ϴ� ���


//���1
//Scanner ��ü�� �����Ͽ� �� ���� �Է¹��� �� ���
//������ Scanner ��ü�� ���ʿ��� ���ҽ� ���� ���� ���� �Է��� ���� �Ŀ��� �������ִ� ���� ����.

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

////���2-1

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

//// java.util.NoSuchElementException�� �������� �ʴ� ���� ���������� �� �� �߻�
//


//���2-2 
//br.readLine()�� ���� �о�� ���� split(" ")�Ͽ� ���� ������ ������ �� String �迭�� ���� �����ϴ� ����̴�.


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







