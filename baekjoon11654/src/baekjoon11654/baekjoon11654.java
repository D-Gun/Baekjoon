package baekjoon11654;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class baekjoon11654 {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
			System.out.println(bytes[0]);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
