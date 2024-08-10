//Name: Anushree Jaiswal
//Reg No: 22BCE11109

package Course_Topics;

import java.util.*;

public class Weightage_String_Approach_2 {
	static int distinctSubString(String str, int K, int N) {
		HashSet < String > S = new HashSet < String > ();
		for (int i = 0; i < N; ++i) {
			int sum = 0;
			String s = "";
			for (int j = i; j < N; ++j) {
				char ch = str.charAt(j);
				int currWeight = ch - 'a';
				sum += currWeight;
				s += str.charAt(j);
				if (sum == K) {
					S.add(s);
				} else {
					break;
				}
			}
		}
		return S.size();
	}
	public static void main(String[] args) {
		String str = "abcdef";
		int K = 5;
		int N = str.length();
		System.out.print(distinctSubString(str, K, N));
	}
}