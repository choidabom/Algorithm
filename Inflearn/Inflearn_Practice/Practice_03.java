package Inflearn.Inflearn_Practice;
// �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷�
// ���� ���� �� �ܾ�� �������� ���еȴ�.
// ���� ���̰� �� �ܾ ���� ���� ��� ���� �ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �Ѵ�.

import java.util.Arrays;
import java.util.Scanner;

public class Practice_03 {
	public String solution(String str) {
		String answer = "";
		String[] words = str.split(" "); // ���ڿ��� ������ �������� �迭�� ����
		//System.out.println(Arrays.toString(words)); // ������ �������� ���ڿ��� �迭�� �и����ش�.
		System.out.println(Arrays.toString(words));
		

		//�� Ʋ����??????????
		
//		for(int i=0; i<words.length; i++) { // �迭�� ���̸� �� ���� length�� ����Ѵ�.
//			if(words[i].length()> words[i+1].length()) {
//				answer = words[i]; 
//			}
//			else if(words[i].length()== words[i+1].length()) {
//				answer = words[i];      // ���� ���̰� �� �ܾ ���� ���� ��� ���� �ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �Ѵ�.
//			}
//			else {
//				answer = words[i+1];
//			}
//		}
		return answer;
	}
	public static void main(String[] args) {
		Practice_03 T = new Practice_03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); 
		// next()�� nextLine()�̶� ���� �ٸ��� ^_____^
		// �ܾ �ƴ϶� ������ �Է¹޾ƾ��ϱ� ������ nextLine()�� ����.
		
		System.out.println(T.solution(str));
	}
}


