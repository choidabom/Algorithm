package Inflearn.Inflearn_Practice;
// �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ���
// ���� ���� �� �ܾ�� �������� ���е�
// ù �ٿ� ���� �� �ܾ ���, ���� ���̰� �� �ܾ ���� ���� ��� ���� �ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������
import java.util.*;

public class Practice_03_2 {
	public String solution(String str) {
		String answer="";
		String[] s = str.split(" "); //���ڿ��� ������ �������� ���� �迭
		//it is time to study
		//["it", "is", "time", "to", "study"]
		
		for(String x : s) { // for each�������� �迭�� �־����.
			if(x.length() > answer.length()) {
				answer = x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_03_2 T = new Practice_03_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //���ڿ��� �Է¹޾ƾ��ϱ� ������ nextLine() ���
		System.out.println(T.solution(str));
	}
}
