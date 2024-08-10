package Course_Topics;

public class Alice_Algorithm {
	public static int minApple(int M, int K, int N, int S, int E, int W) {
		if(M<=S*K+W+E)
			return M;
		else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println(minApple(10,15,0,1,0,0));
	}

}
