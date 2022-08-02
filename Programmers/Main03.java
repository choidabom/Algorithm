import java.util.*;
// 프로그래머스 Level 1 자릿수 더하기

// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return하는 solution 함수를 만들라
// N=123이면 1+2+3=6 을 return 하면 된다.

public class Main03 {
    public int solution(int n) {
        int answer = 0;
        String str = n +""; // 숫자 n을 문자열 str로 바꾸기
        String[] arr = str.split(""); // 문자열 내 글자 모두 나누기

        for(int i = 0; i<arr.length; i++){
            answer += Integer.valueOf(arr[i]); // 문자열 배열을 숫자로 바꾸기
        }
        return answer;
    }
// 하나도 안 찾아보고 내 힘으로 해결한 코드 ㅠ 조금씩 발전 중..!
}

// 123
//6
//987
//24