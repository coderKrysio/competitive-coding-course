package Course_Topics;

import java.util.*;

public class Natural_Sort implements Comparator{
	int compareRight(String a, String b){
		int bias = 0, ia = 0, ib = 0;
		for (;; ia++, ib++){
			char ca = charAt(a, ia);
			char cb = charAt(b, ib);
			if (!isDigit(ca) && !isDigit(cb)) {
				return bias;
			}
			if (!isDigit(ca)) {
				return -1;
			}
			if (!isDigit(cb)) {
				return +1;
			}
			if (ca == 0 && cb == 0) {
				return bias;
			}
			if (bias == 0) {
				if (ca < cb) {
					bias = -1;
				} else if (ca > cb) {
					bias = +1;
				}
			}
		}
	}
	
	public int compare(Object o1, Object o2){
		String a = o1.toString();
		String b = o2.toString();
		int ia = 0, ib = 0;
		int nza = 0, nzb = 0;
		char ca, cb;
		while (true) {
			nza = nzb = 0;
			ca = charAt(a, ia);
			cb = charAt(b, ib);
			while (Character.isSpaceChar(ca) || ca == '0') {
				if (ca == '0') {
					nza++;
				} else {
					nza = 0;
				}
				ca = charAt(a, ++ia);
			}
			while (Character.isSpaceChar(cb) || cb == '0') {
				if (cb == '0') {
					nzb++;
				} else {
					nzb = 0;
				}
				cb = charAt(b, ++ib);
			}
			if (Character.isDigit(ca) && Character.isDigit(cb)) {
				int bias = compareRight(a.substring(ia), b.substring(ib));
				if (bias != 0) {
					return bias;
				}
			}
			if (ca == 0 && cb == 0) {
				return compareEqual(a, b, nza, nzb);
			}
			if (ca < cb) {
				return -1;
			}
			if (ca > cb) {
				return +1;
			}
			++ia;
			++ib;
		}
	}

	static boolean isDigit(char c) {
		return Character.isDigit(c) || c == '.' || c == ',';
	}
	
	static char charAt(String s, int i) {
		return i >= s.length() ? 0 : s.charAt(i);
	}
	
	static int compareEqual(String a, String b, int nza, int nzb) {
		if (nza - nzb != 0)
			return nza - nzb;
		if (a.length() == b.length())
			return a.compareTo(b);
		return a.length() - b.length();
	}
	
	public static void main(String[] args){
		String[] strings = new String[] { "1-2", "1-20","1-02",  "10-20", "fred", "jane", "pic01","pic2", "pic02", "pic02a", "pic3", "pic4", "pic 4 else", "pic 5", "pic05", "pic 5","pic 5 something", "pic 6", "pic 7", "pic100", "pic100a", "pic120", "pic121","pic02000", "tom", "x2-g8", "x2-y7", "x2-y08", "x8-y8" };
		List orig = Arrays.asList(strings);
		System.out.println("Original: " + orig);
		List list = Arrays.asList(strings);
//		Collections.sort(list, new NaturalOrderComparator());
		System.out.println("Sorted: " + list);
	}
}