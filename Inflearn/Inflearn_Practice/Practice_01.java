package Inflearn.Inflearn_Practice;

// �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ���
// ��ҹ��� ���� x
// ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־���.
// ù �ٿ� �ش� ���� ���� ���
import java.util.Scanner;

public class Practice_01 {
	public int solution(String str, char ch) {
		int answer = 0;
		str = str.toUpperCase();
		//���� § �ڵ�
		//ch = ch.charAt(0).toUpperCase();
		
		ch=Character.toUpperCase(ch); //���ڴϱ� Character��� Ŭ������ �ִ� �޼ҵ� ���
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Practice_01 T = new Practice_01(); //��ü ����
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char ch = kb.next().charAt(0); // �� ���� �ޱ�
		System.err.println(T.solution(str, ch));
	}
}


//public class Practice_01 {
//	public static void main(String[] args) {
//		Scanner kb = new Scanner(System.in);
//		String str = kb.next();
//		char ch = kb.next().charAt(0); //�ε��� 0���� ����
//		System.out.println(str);
//		System.out.println(ch);
//	}
//}
