package level2;

import java.util.Scanner;

public class Main1_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
		
		//��� 1
//		if (A > B) {
//			System.out.println(">");
//		}
//		if (A < B) {
//			System.out.println("<");
//		}
//		if (A == B) {
//			System.out.println("==");
//		}
		
		//��� 2
//		if (A > B) System.out.println(">");
//		else if (A < B) System.out.println("<");
//		else System.out.println("==");
		
		//��� 3
		//���ǹ��� �� �� ȹ�������� ���� �� �ִ� ��� => ���׿�����!
		// ���� = (���ǹ�) ? (true�� ���� ����) : (false�� ���� ����);
		String str = (A>B) ? ">" : ((A<B) ? "<" : "=="); //���׿����ڸ� ��ø
		System.out.println(str);
	}
}



