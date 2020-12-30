package hearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class anagram {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int T = Integer.parseInt(br.readLine());
		while (T>0) {
			String a = br.readLine();
			String b = br.readLine();
			int arrayA[]= new int[26];
			int arrayB[]=new int[26];
			for(int i=0;i<a.length();i++) {
				arrayA[a.charAt(i)-'a']++;
			}
			for(int i=0;i<b.length();i++) {
				arrayB[b.charAt(i)-'a']++;
			}
			int minDel = 0;
			for(int i=0;i<26;i++) {
				minDel += Math.abs(arrayA[i]-arrayB[i]);
			}
			System.out.println(minDel);
		}

	}

}
