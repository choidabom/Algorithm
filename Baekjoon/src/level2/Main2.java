package level2;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		
		in.close();
		
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		//���ǹ��� �� �� ȹ�������� ���� �� �ִ� ��� => ���׿�����!
		// ���� = (���ǹ�) ? (true�� ���� ����) : (false�� ���� ����);
		//System.out.println((score >= 90)?"A":(score >= 80)?"B":(score >= 70)?"C":(score >= 60)?"D":"F");
	}

}
