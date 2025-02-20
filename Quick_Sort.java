package Course_Topics;

public class Quick_Sort {
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for(int j = low; j< high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	static void printArray(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	  public static void main(String[] args) {
	    int[] arr = {2, 7, 4, 1, 0, 3};
	    int n = arr.length;

	    System.out.println("Unsorted array: ");
	    printArray(arr);
	    
	    Quick_Sort ob = new Quick_Sort();
	    ob.quickSort(arr, 0, n - 1);

	    System.out.println("Sorted array: ");
	    printArray(arr);
	  }

}
