package level1;

import java.util.Scanner;

//����1) �Է���ü�� �迭�� �޾Ƶ鿩 �迭�� ���� ������� ���ϴ� ���??
//����2) ������ �������δ� �������� ����ϴ� ���??!!

public class Main11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt(); //(1)
		int b = in.nextInt(); //(2)
		
		System.out.println(a*(b%10)); //(3)�� ���: 1�� �ڸ�
		System.out.println(a*((b/10)%10)); //(4)�� ���: 10�� �ڸ�
		//System.out.println(a*((b%100)/10));
		
		System.out.println(a*(b/100)); //(5)�� ���: 100�� �ڸ�
		System.out.println(a*b);
	}

}
