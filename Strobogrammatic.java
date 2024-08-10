package Course_Topics;

import java.util.*;

public class Strobogrammatic {
	public static boolean isStrobom(String num) {
		Map<Character,Character> S1 = new HashMap<Character, Character>();
		S1.put('0','0');
		S1.put('1','1');
		S1.put('8','8');
		S1.put('9','9');
		S1.put('6','6');
		int n = num.length();
		for(int i = 0,j=n-1;i<=j;i++,j--) {
			char left = num.charAt(i);
			char right = num.charAt(j);
			char map = S1.getOrDefault(left,'-');
			if(map =='-')
				return false;
			if(map!=right)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStrobom("181"));

	}

}
