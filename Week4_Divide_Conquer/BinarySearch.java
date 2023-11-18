import java.util.Scanner;

class BinarySearch {

	public static void search(int[] arr, int[] elems) {

		for(int i=0; i<elems.length; i++) {
			int mid = -1, low = 0, high = arr.length - 1;
			int curr = elems[i];
			boolean found = false;
			while(low <= high) {
				mid = low + (high - low) / 2;
				if(curr < arr[mid]) {
					high = mid - 1;
				} else if(curr == arr[mid]) {
					high = mid - 1;
					found = true;
				} else {
					low = mid + 1;
				}
			}
			if(!found) System.out.print(-1 + " "); else System.out.print(low + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int arr_size = s.nextInt();
			int[] arr = new int[arr_size];

			for(int i=0; i <= arr_size-1; i++)
				arr[i] = s.nextInt();

			int elem_size = s.nextInt();
			int[] elems = new int[elem_size];
			for(int i=0; i <= elem_size-1; i++)
				elems[i] = s.nextInt(); 

			search(arr, elems);
		}
	}

}