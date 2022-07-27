// 프로그래머스 Level 1 자연수 뒤집어 배열로 만들기

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를 들어, n이 12345이면 [5, 4, 3, 2, 1]을 리턴합니다.

// 1) 먼저 나눈 다음, 맨 마지막의 수부터 차례대로 배열에 집어넣기
// 2) 각 자리 숫자를 나눠서 뒤집은 다음, 차례대로 배열에 집어넣기

class Solution{
	public int[] solution(long n){
		String s = n + "";	// 숫자열 n을 문자열 n으로 바꿈
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();	// 뒤집기
		String[] arr = sb.toString().split(""); 
	
		int[] answer = new int[arr.length];	// 배열의 길이는 length

		for(int i=0; i<arr.length; i++){
			answer[i] = Integer.parseInt(arr[i]);
		}
		return answer;
	}   
}

