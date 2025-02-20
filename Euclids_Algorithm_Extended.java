package Course_Topics;

public class Euclids_Algorithm_Extended {
	public static int gcdExtended(int a, int b, int x, int y) {
		if(a==0) {
			x=0;
			y=1;
			return b;
		}
		int x1 = 1, y1 = 1;
		int gcd = gcdExtended(b%a,a,x1,y1);
		x = y1 - (b/a)*x1;
		y = x1;
		
		return gcd;
	}

	public static void main(String[] args) {
		int x=1, y = 1;
		int a = 35, b = 22;
		int g = gcdExtended(a,b,x,y);
		System.out.println("GCD is "+ g);

	}

}
