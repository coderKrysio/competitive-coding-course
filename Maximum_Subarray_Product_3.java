// Anushree Jaiswal
// 22BCE11109

package Course_Topics;

import java.util.*;
public class Maximum_Subarray_Product_3 {
	public static int maxProduct(List<Integer> nums) {
		if (nums.size() == 0)
			return 0;
		int maxSoFar = nums.get(0);
		int minSoFar = nums.get(0);
		int result = maxSoFar;
		for (int i = 1; i < nums.size(); i++) {
			int curr = nums.get(i);
			int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
			minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
			maxSoFar = tempMax;
			result = Math.max(maxSoFar, result);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int x = 0;x<n;x++) {
			arr[x] = sc.nextInt();
		}
		
		List<Integer> nums = new ArrayList<Integer>();
		for (int num : arr) {
			nums.add(num);
		}
		
		int maxProduct = maxProduct(nums);
		System.out.println("Max Product: " + maxProduct);
		sc.close();
	}
}