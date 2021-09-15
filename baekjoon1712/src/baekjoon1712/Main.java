package baekjoon1712;

import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			String[] sArr = s.split(" ");
			
			long[] Num = new long[sArr.length];
			long result;
//			int cnt = 1;
			for (int i = 0; i < sArr.length; i++) {
				Num[i] = Integer.parseInt(sArr[i]);
			}
			if(Num[1] < Num[2]) {
//				while ((Num[0] + (Num[1]*cnt)) > Num[2]*cnt) {
//					cnt++;
//				}
//				System.out.println(cnt+1);
				result = Math.abs(Num[0]/(Num[1] - Num[2]))+1;
				System.out.println(result);
			}else {
				System.out.println(-1);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
