package Inflearn.Inflearn_Practice;
// �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾�
// �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�ϴ� ���α׷�
// ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ� ���� 100 �� ����

import java.util.*;

public class Practice_02 {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
		}

		return answer;
	}
	public static void main(String[] args) {
		Practice_02 T = new Practice_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //���ڿ� �Է¹ޱ�
		System.out.println(T.solution(str)); 
	}
}


// String.toCharArray() ���ڿ��� char�� �迭�� �ٲ���
//public class Practice_02 {
//	public static void main(String[] args) {
//		String str = "Hello, world!";
//		
//		char[] arr = str.toCharArray(); // char�� �迭 ����
//		
//		// Java���� �迭�� ���̸� ���ϱ� ���ؼ��� �迭�� length �Ӽ��� ����ؾ��Ѵ�.
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		
//		// �߰�) char�� �迭 ���ļ� ���ڿ��� �����
//		String s = new String(arr);
//		System.out.println(s);
//	}
//}
