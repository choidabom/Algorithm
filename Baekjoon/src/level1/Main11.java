package level1;

import java.util.Scanner;

//생각1) 입력자체를 배열로 받아들여 배열의 원소 순서대로 곱하는 방법??
//생각2) 저번에 경험으로는 나머지로 계산하는 방법??!!

public class Main11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt(); //(1)
		int b = in.nextInt(); //(2)
		
		System.out.println(a*(b%10)); //(3)의 계산: 1의 자리
		System.out.println(a*((b/10)%10)); //(4)의 계산: 10의 자리
		//System.out.println(a*((b%100)/10));
		
		System.out.println(a*(b/100)); //(5)의 계산: 100의 자리
		System.out.println(a*b);
	}

}
