package Inflearn.String;

//�� ���� ���ڿ��� �Է¹ް�, 
//Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
//��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

//ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
//���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

//=> �󵵼� ���� ����

import java.util.Scanner;

public class String_01 {
	public int solution(String str, char t) {
		int answer = 0;
		//��ҹ��ڸ� �������� �ʱ� ������ str�� �빮�ڷ� �ٲٰ�, t�� �빮�ڷ� �ٲ������ ��.
		str = str.toUpperCase();
		t=Character.toUpperCase(t); //���ڴϱ� Character��� Ŭ������ �ִ� �޼ҵ� ���
		//System.out.println(str+""+t);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) { //���ڿ��� �ε����Ϸ��� charAt ���
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) { // static���� �ν��Ͻ� �޼ҵ带 ȣ���Ϸ��� ��ü �����ؾ���.
		String_01 T = new String_01();
		Scanner kb = new Scanner(System.in); // kb�� keyboard ����
		String str = kb.next(); // ���ڿ� �ϳ� �о���̴°�
		char c = kb.next().charAt(0); //���ڿ��̶�� �����ϰ� �ű⼭ �ε��� ù��°�� 
		kb.close();

		System.out.print(T.solution(str, c)); // solution�� ȣ���� ��
	}

}
