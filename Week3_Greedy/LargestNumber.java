import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

class LargestNumber {

	static class CustomIntegerCompartor implements Comparator<Integer> {

		@Override
		public int compare(Integer i1, Integer i2) {
			String s1 = String.valueOf(i1) + String.valueOf(i2);
			String s2 = String.valueOf(i2) + String.valueOf(i1);
			int i = 0, j = 0;

			while(i < s1.length() && j < s2.length()) {
				if (s1.charAt(i) == s2.charAt(j)) {}
				else if(s1.charAt(i) > s2.charAt(j)) return 1;
				else return -1;

				i++; j++;
			}

			if(i == s1.length()) 
				return 1; 
			else 
				return -1;
		}	
	}

	public String constructLargest(ArrayList<Integer> nums) {
		CustomIntegerCompartor c = new CustomIntegerCompartor();
		StringBuilder sb = new StringBuilder();
		while(!nums.isEmpty()) {
			int largest_idx = 0;
			for(int i=1; i<nums.size(); i++) {
				if(c.compare(nums.get(i), nums.get(largest_idx)) == 1)
					largest_idx = i;
			} 
			sb.append(String.valueOf(nums.get(largest_idx)));
			nums.remove(largest_idx);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i=0; i<n; i++)
			nums.add(s.nextInt());

		LargestNumber l = new LargestNumber();
		System.out.println(l.constructLargest(nums));	
	}

}