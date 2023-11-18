import java.util.Arrays;
import java.util.Scanner;

class MaxDotProduct {

	public long maxProduct(long[] val_per_item, long[] freq_per_slot) {

		Arrays.sort(val_per_item);
		Arrays.sort(freq_per_slot); 

		long max_product = 0;
		for(int i=0; i<val_per_item.length; i++) 
			max_product += val_per_item[i] * freq_per_slot[i]; 
	
		return max_product;
	}

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			long[] val = new long[n], freq = new long[n];

			// value per item
			for(int i=0; i<n; i++)
				val[i] = s.nextLong();

			for(int i=0; i<n; i++)
				freq[i] = s.nextLong();

			MaxDotProduct m = new MaxDotProduct();
			System.out.println(m.maxProduct(val, freq));
		}
	}
}