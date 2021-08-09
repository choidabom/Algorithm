package level1;

//public class Main2 {
//	public static void main(String[] args) {
//		System.out.println("강한친구 대한육군");
//		System.out.println("강한친구 대한육군");
//	}
//}

public class Main2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb = new StringBuffer(); => StringBuilder랑 똑같다.
		
		sb.append("강한친구 대한육군\n");
		sb.append("강한친구 대한육군");
		
		System.out.println(sb);		
	}
}
/* 문자열을 이어 붙이는 것이기 때문에 사실상 저 sb에 연결되어 있는 문자열은
"강한친구 대한육군\n강한친구 대한육군"이다. */

 