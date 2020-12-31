package hearth;

import java.util.Arrays;
import java.util.Scanner;

public class identiccalStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			char [] A = str1.toCharArray();
			char[] B = str2.toCharArray();
			Arrays.sort(A);
			Arrays.sort(B);
			boolean T = Arrays.equals(A,B);
			if(T) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
