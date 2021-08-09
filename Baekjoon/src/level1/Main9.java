package level1;

//방법1-1 Scanner  + System.out.println()
//import java.util.Scanner;
//
//public class Main9 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		in.close();
//		
//		System.out.println(A+B); //덧셈
//		System.out.println(A-B); //뺄셈
//		System.out.println(A*B); //곱셈
//		System.out.println(A/B); //몫
//		System.out.println(A%B); //나머지
//	}
//}

//방법1-2 Scanner  + StringBuilder
//StringBuilder을 생성하여 하나의 문자열로 연결해 준 다음 한 번에 출력하는 방법
//import java.util.Scanner;
//
//public class Main9 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		in.close();
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append(A+B);
//		sb.append('\n');
//		
//		sb.append(A-B);
//		sb.append('\n');
//		
//		sb.append(A*B);
//		sb.append('\n');
//		
//		sb.append(A/B);
//		sb.append('\n');
//		
//		sb.append(A%B);
//		sb.append('\n');
//		
//		System.out.println(sb);
//	}
//}

//방법1-3 Scanner + BufferedWriter
//StringBuilder을 생성하여 하나의 문자열로 연결해 준 다음 한 번에 출력하는 방법
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main9 { //문자열을 담아둔 뒤 한번에 출력하는 방법!
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((A+B) + "\n");
		bw.write((A-B) + "\n");
		bw.write((A*B) + "\n");
		bw.write((A/B) + "\n");
		bw.write((A%B) + "\n");
		
		bw.flush();
		bw.close();
	}
}