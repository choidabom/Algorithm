package level1;

import java.util.Scanner;

//������ ���̶�� �Է��� ���� ������ �־����ٴ� ����
//��� ���ǿ� �����ֵ��� ������ �Ǵ� ������� ���� ���Ͽ��� �Ѵ�.


public class Main8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		double A = in.nextInt();
//		double B = in.nextInt();
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		System.out.println(A/B);
		
		in.close(); //���⼭ �ñ��� ���� in.close();�� ��ġ�� ���̰� �� �ڿ��� ����� ���°ǰ�?
	}
} // => Ʋ�ȴ�!!


