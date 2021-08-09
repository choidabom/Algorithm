package level1;

//public class Main4 {
//	public static void main(String[] args) {
//		//ctrl+alt+down 행단위 복사
//		System.out.println("|\\_/|");
//		System.out.println("|q p|   /}");
//		System.out.println("( 0 )\"\"\"\\"); //여기가 이해가 안 됨!
//		System.out.println("|\"^\"`    |");
//		System.out.println("||_/=\\\\__|");
//	}
//}
/*
큰 따옴표(")나 백슬래시(\)는 단독으로 써서 출력할 수가 없다. 
그래서 이를 출력하기 위해 특정 구문을 사용하는데 이를 이스케이프 한다고 말한다.
그리고 결합된 그 문자를 Escape Sequence 라고 하는데 백슬래시(\)와 문자 하나를 결합하여 나타낸다
우리가 흔히 쓰는 \n \t 같은 것도 이스케이프 시퀀스다. 

(이스케이프 시퀀스 = 이스케이프 문자 = 제어문자..)

*/

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main4{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("|\\_/|");
		bw.newLine(); //줄구분자, 각 라인마다 개행을 해준다. 
		//물론 이를 쓰지 않고 각 write 마다 \n 을 붙여줘도 된다.
		
		bw.write("|q p|   /}");
		bw.newLine();
		
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();
		
		bw.write("||_/=\\\\__|");
		bw.newLine();

		bw.flush(); //스트림에 들어있는 데이터를 비운다.
		bw.close(); //스트림을 종료해준다.
		
	}
}