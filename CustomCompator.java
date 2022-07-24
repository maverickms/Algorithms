import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public String toString() {
  	return this.start + ", " + this.end;
  }
};

class CustomCompator {
	
	static class SortByFirstElem implements Comparator<int[]> {
		public int compare(int[] a, int[] b) {
			return (b[0] > a[0])?1:-1;
		}
	}

	public static void main(String[] args) {
		// int[][] arr = {{6, 7}, {2, 4}, {5, 9}};

		// // Arrays.sort(arr, (a,b) -> b[0] - a[0]);
		// Arrays.sort(arr, new SortByFirstElem());

		// for(int i=0; i<arr.length; i++)
		// 	System.out.println(Arrays.toString(arr[i]));



		List<Interval> input = new ArrayList<Interval>();
    	input.add(new Interval(3, 4));
    	input.add(new Interval(2, 5));
    	input.add(new Interval(1, 9));	

    	Collections.sort(input, (a, b) -> Integer.compare(a.start, b.start));

    	for(Interval i : input)
    		System.out.println(i.toString());
	}

}