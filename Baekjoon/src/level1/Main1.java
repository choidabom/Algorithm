package level1;

//���1
//public class Main1_1{
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	}
//}

//���2
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main1{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("Hello World!");
		bw.flush();
		bw.close();
		
	}
}
/*BufferedWriter, BufferedReader�� Buffer�� �ִ� IOŬ�����ε� �� Ŭ�������� 
�����͸� �ϳ��� �о���� ���� �ƴ϶� �ӽ� ����(����)�� �����صξ��ٰ� �� ���� ��� �Ǵ� �����͸� ������ ����̴�.
��. ���� ��� 1000���� �����͸� 1���� �����°� �ƴ϶� �ӽ÷� �� ������ ��Ƶ� �� �� ���� ������ ����̴� ���ɸ鿡�� ����ϴ�!*/
