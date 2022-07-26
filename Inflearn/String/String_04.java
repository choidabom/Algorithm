package Inflearn.String;
import java.util.*;

//N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷� �ۼ�
//ù �ٿ� �ڿ��� N(3<=N<=10) �־���.
//�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־���,
//N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ������ ����Ѵ�.


public class String_04 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str){
			String tmp = new StringBuilder(x).reverse().toString();
			// StringBuilder�� ���ڿ��� �ٷ�� Ŭ�����̴�. ���ڿ��� �ٷ�� �޼��尡 ����.
			// ���� ��� good�̶�� �ܾ StringBuilder�� ��ü�� ������� ��

			// String�� �������� StringBuilder�� �� ���°�? => ��ü �ϳ��� ����, ������ �� ��������� �޸� ���� ����
			// String�� ���ϰų� 3replace()���� �� ���ο� ��ü�� ������. 
			answer.add(tmp); // ArrayList�� ���ϴ� �� add
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String_04 T = new String_04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); 		// N�� �־���
		String[] str = new String[n];	// N���� �ܾ �� �ٿ� �ϳ��� �־��� 
		
		for(int i=0; i<n; i++){
			str[i] = kb.next();
		} 
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		
		kb.close();
	}
}


/*
3
good
Time
Big

doog
emiT
giB
*/

/* 
//#2
public class String_04 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>(); // �ܾ �ϳ��� �ƴ� �������� �޾� ó���ؾ��ϹǷ� ArrayList ���
		for(String x : str){
			char[] s = x.toCharArray(); // ���� �迭ȭ
			int lt = 0, rt = x.length()-1;	// �ۿ������� ������ ���� �ٲ����. 
			while(lt<rt){	
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); // valueOf�� static���� ����� �޼���, char[]�� Stirng���� ��ȯ ����
			answer.add(tmp);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String_04 T = new String_04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); 		// N�� �־���
		String[] str = new String[5];	// N���� �ܾ �� �ٿ� �ϳ��� �־��� 
		
		for(int i=0; i<n; i++){
			str[i] = kb.next();
		} 
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		
		kb.close();
	}
}
*/

//#3
/*
 public class String_04 {
	public String[] solution(int n, String[] arr) {
        String[] answer = new String[n]; 
        for (int i = 0; i < n; i++) {
			answer[i]="";	// String �迭�� ����� �⺻������ null ������ �ʱ�ȭ�Ǳ� ������
			for (int k = arr[i].length() - 1; k >= 0; k--) {
                answer[i] += arr[i].charAt(k);
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		String_04 T = new String_04();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); 		// N�� �־���
		String[] str = new String[n];	// N���� �ܾ �� �ٿ� �ϳ��� �־��� 
		
		for(int i=0; i<n; i++){
			str[i] = kb.next();
		} 
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		
		kb.close();
	}
}

 */