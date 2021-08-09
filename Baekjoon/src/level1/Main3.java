package level1;

/*자바에서는 몇몇 문자는 단독으로 써서 출력할 수 없다. => 이스케이프 문자(제어 문자)
 * (대표적으로 백슬래시와 큰 따옴표가 있다.)

그래서 문자를 출력하기 위해 조합을 만들어서 출력할 수 있도록 하는데 이를 Escape Sequance 라고 한다.

이스케이프 시퀀스는 백슬래시(\) + 문자 의 조합으로 쓰인다.*/

//방법1
//public class Main3 {
//	public static void main(String[] args) {
//		System.out.println("\\    /\\");
//		System.out.println(" )  ( ')");
//		System.out.println("(  /  )");
//		System.out.println(" \\(__)|");
//		/* 자바에서 \의 경우 두 번 해야지 문자열로 인식하는 것 같음 */
//	}
//
//}

//방법2
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main3{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\");
		bw.newLine(); //줄구분자, 각 라인마다 개행을 해준다. 
		//물론 이를 쓰지 않고 각 write 마다 \n 을 붙여줘도 된다.
		
		bw.write(" )  ( ')");
		bw.newLine();
		
		bw.write("(  /  )");
		bw.newLine();
		
		bw.write(" \\(__)|");
		bw.newLine();

		bw.flush(); //스트림에 들어있는 데이터를 비운다.
		bw.close(); //스트림을 종료해준다.
		
	}
}

