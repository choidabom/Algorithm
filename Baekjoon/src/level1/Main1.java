package level1;

//방법1
//public class Main1_1{
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	}
//}

//방법2
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main1{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("Hello World!");
		bw.flush();
		bw.close();
		
	}
}
/*BufferedWriter, BufferedReader는 Buffer에 있는 IO클래스인데 이 클래스들은 
데이터를 하나씩 읽어오는 것이 아니라 임시 공간(버퍼)에 저장해두었다가 한 번에 출력 또는 데이터를 보내는 방식이다.
즉. 예로 들어 1000개의 데이터를 1개씩 보내는게 아니라 임시로 한 공간에 담아둔 뒤 한 번에 보내는 방법이니 성능면에서 우수하다!*/
