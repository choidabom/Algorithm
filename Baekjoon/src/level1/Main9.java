package level1;

//���1-1 Scanner  + System.out.println()
//import java.util.Scanner;
//
//public class Main9 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		in.close();
//		
//		System.out.println(A+B); //����
//		System.out.println(A-B); //����
//		System.out.println(A*B); //����
//		System.out.println(A/B); //��
//		System.out.println(A%B); //������
//	}
//}

//���1-2 Scanner  + StringBuilder
//StringBuilder�� �����Ͽ� �ϳ��� ���ڿ��� ������ �� ���� �� ���� ����ϴ� ���
//import java.util.Scanner;
//
//public class Main9 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		in.close();
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append(A+B);
//		sb.append('\n');
//		
//		sb.append(A-B);
//		sb.append('\n');
//		
//		sb.append(A*B);
//		sb.append('\n');
//		
//		sb.append(A/B);
//		sb.append('\n');
//		
//		sb.append(A%B);
//		sb.append('\n');
//		
//		System.out.println(sb);
//	}
//}

//���1-3 Scanner + BufferedWriter
//StringBuilder�� �����Ͽ� �ϳ��� ���ڿ��� ������ �� ���� �� ���� ����ϴ� ���
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main9 { //���ڿ��� ��Ƶ� �� �ѹ��� ����ϴ� ���!
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((A+B) + "\n");
		bw.write((A-B) + "\n");
		bw.write((A*B) + "\n");
		bw.write((A/B) + "\n");
		bw.write((A%B) + "\n");
		
		bw.flush();
		bw.close();
	}
}