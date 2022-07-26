package Inflearn.Inflearn_Practice;

// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램
// 첫 줄에 자연수 N(3<=N<=20)
// 두번째 줄부터 N개의 단어가 각 줄에 하나씩 주어짐
import java.util.ArrayList;
import java.util.Scanner;

public class Practice_04{
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str){
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String[] args) {
		Practice_04 T = new Practice_04();
		Scanner kb = new Scanner(System.in);
		kb.close();

		int n = kb.nextInt();			
		String[] str = new String[n];	
		for(int i = 0; i<n; i++){
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
} 