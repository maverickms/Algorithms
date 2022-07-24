import java.util.Scanner;
import java.util.Arrays;

class MaxPairProduct {
	
	static long findMaxProduct(int[] nums) {
		long product = 0;
		int i = 0, j = nums.length - 1;

		while(i < j) {
			product = Math.max(product, (long)nums[i] * (long)nums[j]);
			if(nums[i] <= nums[j])
				i++;
			else
				j--;
		}

		return product;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] nums = new int[size];
		for(int i=0; i<size; i++)
			nums[i] = s.nextInt();

		System.out.println(findMaxProduct(nums));

		/*for(int i=0; i<10; i++) {
			System.out.println(" ================ Test# " + (i+1) + " ===================");
			stressTest();
			System.out.println(" =================== End test #" + (i+1) + "==================================");
		}*/
	}

	static void stressTest() {
		int size = (int)(Math.random() * 100000);
		int[] nums = new int[size];

		for(int i=0; i<size; i++)
			nums[i] = (int)(Math.random() * 100000);

		System.out.println(Arrays.toString(nums));
		System.out.println(findMaxProduct(nums));	
	}
}