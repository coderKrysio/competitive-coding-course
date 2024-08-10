//Name: Anushree Jaiswal
//Reg No: 22BCE11109

package Course_Topics;

import java.util.*;

public class Weightage_String_Approach_1 {
	static int distinctSubString(String P, String Q, int K, int N) {
		HashSet < String > S = new HashSet < String > ();
		for (int i = 0; i < N; ++i) {
			int sum = 0;
			String s = "";
			for (int j = i; j < N; ++j) {
				int pos = P.charAt(j) - 'a';
				sum += Q.charAt(pos) - '0';
				s += P.charAt(j);
				if (sum <= K) {
					S.add(s);
				} else {
					break;
				}
			}
		}
		return S.size();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String P = sc.next();
		System.out.println("Enter the values: ");
		String Q = sc.next();
		System.out.println("Enter the value of k: ");
		int K = sc.nextInt();
		int N = P.length();
		System.out.print(distinctSubString(P, Q, K, N));
		sc.close();
	}
}