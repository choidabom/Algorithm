package Inflearn.String;

//�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾�
//�빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷�

//ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���� 100 ���� ����
//���ڿ��� ���� ���ĺ������� ������.

import java.util.Scanner;

public class String_02 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) { //str�� ������� �ؼ� ���ڹ迭�� ������.
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
			
//			 �ƽ�Ű �ڵ�� ������ Ǯ �� ����, �빮��: 65~90, �ҹ��� : 97~122
//			 so, �ҹ��ڿ��� 32�� ���� �빮�ڰ� �ȴ�.
//			if(x>=97 && x <=122) answer+=(char)(x-32); //���ڷ� ����Ǳ� ������ (char)�߰�
//			else answer+=(char)(x+32);
		}
		
		return answer;		
	}
	public static void main(String[] args) {
		String_02 T = new String_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		kb.close();

		System.out.println(T.solution(str));
		

	}

}
