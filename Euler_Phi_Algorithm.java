package Course_Topics;

public class Euler_Phi_Algorithm {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(phi(n));
	}
	
	static int phi(int n) {
		int result = 1;
		for(int i = 2;i<n;i++) {
			if(gcd(i,n)==1)
				result++;
		}
		return result;
	}
	static int gcd(int i, int n) {
		if(i==0)
			return n;
		return gcd(n%i,i);
	}

}
