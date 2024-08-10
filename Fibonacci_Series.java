package Assessment;

import java.util.*;

public class Fibonacci_Series {
	static int fiboTerm(int n) {
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else if(n<1)
			return -1;
		else {
			int a = 0;
			int b = 1;
			int res = 0;
			for(int x=3;x<=n;x++) {
				res = a+b;
				a = b;
				b = res;
			}
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println(fiboTerm(n));
		sc.close();
	}

}
