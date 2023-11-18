import java.util.PriorityQueue;
import java.util.Queue;

class CustomOBJ implements Comparable<CustomOBJ> {
	private double value;
	private int idx;

	public CustomOBJ(double _value, int _idx) {
		value = _value;
		idx = _idx;
	}

	@Override
	public int compareTo(CustomOBJ c) {
		return (c.value > this.value) ? 1 : -1;
	}

	@Override
	public String toString() {
		return this.idx + ", " + this.value;
	}
}

class PriorityQCustomObj {

	public void test() {
		CustomOBJ o1 = new CustomOBJ(100, 1);
		CustomOBJ o2 = new CustomOBJ(65.2, 2);
		CustomOBJ o3 = new CustomOBJ(3.1, 3);
		CustomOBJ o4 = new CustomOBJ(150.22, 4);

		Queue<CustomOBJ> customOBJPQ = new PriorityQueue<>();
		customOBJPQ.add(o1);
		customOBJPQ.add(o2);
		customOBJPQ.add(o3);
		customOBJPQ.add(o4);

		while(!customOBJPQ.isEmpty())
			System.out.println(customOBJPQ.poll());
	}

	public static void main(String[] args) {
		PriorityQCustomObj pq = new PriorityQCustomObj();
		pq.test();
	}

}