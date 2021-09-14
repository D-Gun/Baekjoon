package baekjoon11720;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String sCnt = bf.readLine();
			String sNum = bf.readLine();
			int result = 0;
			
			for (int i = 0; i < Integer.parseInt(sCnt); i++) {
				result += sNum.charAt(i)-'0';
			}
			
			System.out.println(result);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
