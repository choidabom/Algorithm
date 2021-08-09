package level1;

import java.util.Scanner;

//주의할 것이라면 입력이 공백 단위로 주어진다는 점과
//출력 조건에 나와있듯이 상대오차 또는 절대오차 범위 이하여야 한다.


public class Main8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		double A = in.nextInt();
//		double B = in.nextInt();
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		System.out.println(A/B);
		
		in.close(); //여기서 궁금한 점은 in.close();의 위치가 쓰이고 난 뒤에는 상관이 없는건가?
	}
} // => 틀렸다!!


