// Anushree Jaiswal
// 22BCE11109

package Course_Topics;

import java.util.*;

public class Maximum_Subarray_Product_2 {
	static int maxSubarrayProduct(int arr[], int n){
		int max_ending_here = arr[0];
		int min_ending_here = arr[0];
		int max_so_far = arr[0];
		for (int i = 1; i < n; i++) {
			int temp = Math.max(Math.max(arr[i], arr[i] * max_ending_here),arr[i] * min_ending_here);
			min_ending_here = Math.min(Math.min(arr[i], arr[i] * max_ending_here),arr[i]*min_ending_here);
			max_ending_here = temp;
			max_so_far= Math.max(max_so_far, max_ending_here);
		}
		return max_so_far;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int x = 0;x<n;x++) {
			arr[x] = sc.nextInt();
		}
		System.out.printf("Maximum Sub array product is %d",maxSubarrayProduct(arr, n));
		sc.close();
	}
}