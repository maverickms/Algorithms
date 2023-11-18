import java.util.Arrays;
import java.util.Scanner; 

class MajorityElement {

	public static int findMajority(int[] arr) {
		if(arr.length == 0) return 0;
		if(arr.length == 1) return 1;

		Arrays.sort(arr);

		int mid_idx = arr.length / 2;

		int left_idx = binSearch(arr, 0, mid_idx - 1, arr[mid_idx]);
		if(left_idx == -1) left_idx = mid_idx;


		int right_idx = binSearch(arr, mid_idx + 1, arr.length - 1, arr[mid_idx]);
		if(right_idx == -1) right_idx = mid_idx;

		int total_range = right_idx - left_idx;
		if(total_range >= arr.length / 2) 
			return 1; 
		else 
			return 0; 
	}

	static int binSearch(int[] arr, int low, int high, int item) {

		boolean found = false;

		while(low <= high) {
			int mid = low + (high - low) / 2; 
			if(arr[mid] == item) {
				high = mid - 1;
				found = true;
			}
			else if(arr[mid] < item)
				low = mid + 1;
			else if(arr[mid] > item)
				high = mid - 1;
		}

		if(found) 
			return low; 
		else 
			return -1;
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int size = s.nextInt();
			int[] arr = new int[size];
			for(int i=0; i<size; i++)
				arr[i] = s.nextInt();

			System.out.println(findMajority(arr));
		}
	}

}