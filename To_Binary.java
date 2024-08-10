package Course_Topics;

public class To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		String s = Integer.toBinaryString(a);
		String rev = "";
		for(int x = s.length()-1; x >=0;x--) {
			rev += s.charAt(x);
		}
		if(s.equals(rev))			
			System.out.println("Binary form is palindrome");
		else
			System.out.println("Binary form is not palindrome");
	}

}
