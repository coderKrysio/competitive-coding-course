package Course_Topics;

import java.util.*;

public class Leaders_in_Array_Brute_Force {
	public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n){
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			boolean leader = true;
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i]){
					leader=false;
					break;
				}
			}
			if(leader)
				ans.add(arr[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 6;
		int arr[] = {2,4,6,3,1,2};
		ArrayList<Integer> ans = printLeadersBruteForce(arr,n);
		for(int i =0;i<ans.size(); i++) {
			System.out.println(ans.get(i)+" ");
		}
	}

}
