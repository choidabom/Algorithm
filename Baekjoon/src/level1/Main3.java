package level1;

/*�ڹٿ����� ��� ���ڴ� �ܵ����� �Ἥ ����� �� ����. => �̽������� ����(���� ����)
 * (��ǥ������ �齽���ÿ� ū ����ǥ�� �ִ�.)

�׷��� ���ڸ� ����ϱ� ���� ������ ���� ����� �� �ֵ��� �ϴµ� �̸� Escape Sequance ��� �Ѵ�.

�̽������� �������� �齽����(\) + ���� �� �������� ���δ�.*/

//���1
//public class Main3 {
//	public static void main(String[] args) {
//		System.out.println("\\    /\\");
//		System.out.println(" )  ( ')");
//		System.out.println("(  /  )");
//		System.out.println(" \\(__)|");
//		/* �ڹٿ��� \�� ��� �� �� �ؾ��� ���ڿ��� �ν��ϴ� �� ���� */
//	}
//
//}

//���2
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main3{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\");
		bw.newLine(); //�ٱ�����, �� ���θ��� ������ ���ش�. 
		//���� �̸� ���� �ʰ� �� write ���� \n �� �ٿ��൵ �ȴ�.
		
		bw.write(" )  ( ')");
		bw.newLine();
		
		bw.write("(  /  )");
		bw.newLine();
		
		bw.write(" \\(__)|");
		bw.newLine();

		bw.flush(); //��Ʈ���� ����ִ� �����͸� ����.
		bw.close(); //��Ʈ���� �������ش�.
		
	}
}

