package level1;

//public class Main4 {
//	public static void main(String[] args) {
//		//ctrl+alt+down ����� ����
//		System.out.println("|\\_/|");
//		System.out.println("|q p|   /}");
//		System.out.println("( 0 )\"\"\"\\"); //���Ⱑ ���ذ� �� ��!
//		System.out.println("|\"^\"`    |");
//		System.out.println("||_/=\\\\__|");
//	}
//}
/*
ū ����ǥ(")�� �齽����(\)�� �ܵ����� �Ἥ ����� ���� ����. 
�׷��� �̸� ����ϱ� ���� Ư�� ������ ����ϴµ� �̸� �̽������� �Ѵٰ� ���Ѵ�.
�׸��� ���յ� �� ���ڸ� Escape Sequence ��� �ϴµ� �齽����(\)�� ���� �ϳ��� �����Ͽ� ��Ÿ����
�츮�� ���� ���� \n \t ���� �͵� �̽������� ��������. 

(�̽������� ������ = �̽������� ���� = �����..)

*/

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main4{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("|\\_/|");
		bw.newLine(); //�ٱ�����, �� ���θ��� ������ ���ش�. 
		//���� �̸� ���� �ʰ� �� write ���� \n �� �ٿ��൵ �ȴ�.
		
		bw.write("|q p|   /}");
		bw.newLine();
		
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();
		
		bw.write("||_/=\\\\__|");
		bw.newLine();

		bw.flush(); //��Ʈ���� ����ִ� �����͸� ����.
		bw.close(); //��Ʈ���� �������ش�.
		
	}
}