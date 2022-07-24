import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;

class TryPriority {
	
	static class CustomIntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return (o1 > o2) ? -1 : 1; 
		}
	}

	public static void main(String[] args) {
		
		Queue<Integer> intPQ = new PriorityQueue<>(new CustomIntegerComparator());
		intPQ.add(2);
		intPQ.add(-1);
		intPQ.add(12);
		intPQ.add(3);
		intPQ.add(-10);

		while(!intPQ.isEmpty()) 
			System.out.println(intPQ.poll());

	}
}