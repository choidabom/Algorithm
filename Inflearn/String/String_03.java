package Inflearn.String;
// �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷�
// ���� ���� �� �ܾ�� �������� ���еȴ�.
// ���� ���̰� �� �ܾ ���� ���� ��� ���� �ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �Ѵ�.

import java.util.Scanner;

public class String_03 {
	public String solution(String str) {
		// ��� 1
		String answer = "";
		//int m = Integer.MIN_VALUE; // �� ���������� ���� ������ ���� ������ 0���� �ʱ�ȭ�ص� �������.
		String[] s = str.split(" "); // ���ڿ��� ������ �������� String �迭�� ����
		//System.out.println(Arrays.toString(s)); // ������ �������� ���ڿ��� �迭�� �и����ش�.
		
//		for(String x : s) { // �迭�̱� ������ for each�� �����ϴ�.
//			int len = x.length();
//			if(len > m) {
//				m = len;
//				answer = x;
//			}
//		}
		// �� �������� for�� ����
		for(String x:s) {
			if(x.length() > answer.length()) {
				answer = x;
			}
		}
		
		// ��� 2 .... ��ƴ�... �ٽ� ����
		
//		String answer = "";
//		int m = Integer.MIN_VALUE, pos; // pos: ���� �ȿ��� �ܾ�� �ܾ� ���̿� �����ϴ� ���鹮���� �ε��� ��ġ�� �����ϱ� ���� ����
//		while((pos=str.indexOf(' '))!= -1){ // ���⸦ �߰� �� �ϸ� -1�� return, �߰��ϸ� �ε��� ��ȣ�� return
//			String tmp = str.substring(0, pos);
//			int len = tmp.length();
//			if(len > m) {
//				m = len;
//				answer = tmp;
//			}
//			str=str.substring(pos+1);
//		}
//		if(str.length()>m) answer = str; // ������ �ܾ� ó���� ������Ѵ�.
//		
		return answer;
	}
	
	public static void main(String[] args) {
		String_03 T = new String_03();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine(); 
		// next()�� nextLine()�̶� ���� �ٸ��� ^_____^
		// kb.next()�� ���� ������� �Է� ���� ��쿡�� ���� ������ ���ڱ��� �ۿ� �Է� ���� �� ����.
		// �ܾ �ƴ϶� ������ �Է¹޾ƾ��ϱ� ������ nextLine()�� ����.
		kb.close();

		System.out.println(T.solution(str));
	}
}

//it is time to study
//-> study
//eitoiw iruow witouweiotwiowioei eiiuow e
//-> witouweiotwiowioei
