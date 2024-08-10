package Course_Topics;
import java.util.*;

public class Swapping_Nibbles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		int swapnum = ((num & 0x0F)<<4) | ((num & 0xF0)>>4);
		System.out.println(num);
		System.out.println(swapnum);
		sc.close();
	}

}
