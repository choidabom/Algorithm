package level1;

//public class Main2 {
//	public static void main(String[] args) {
//		System.out.println("����ģ�� ��������");
//		System.out.println("����ģ�� ��������");
//	}
//}

public class Main2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb = new StringBuffer(); => StringBuilder�� �Ȱ���.
		
		sb.append("����ģ�� ��������\n");
		sb.append("����ģ�� ��������");
		
		System.out.println(sb);		
	}
}
/* ���ڿ��� �̾� ���̴� ���̱� ������ ��ǻ� �� sb�� ����Ǿ� �ִ� ���ڿ���
"����ģ�� ��������\n����ģ�� ��������"�̴�. */

 