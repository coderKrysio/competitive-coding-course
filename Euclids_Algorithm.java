package Course_Topics;

public class Euclids_Algorithm {

	public static void main(String[] args) {
		int a = 35;
		int b = 10;
		System.out.println(gcd(a,b));

	}
	static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}

}
