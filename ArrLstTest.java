import java.util.*;

class ArrLstTest {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		System.out.println("------------");
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(0, 2);
		lst.add(2, 4);
		// System.out.println(Arrays.toString(lst.toArray()));
		System.out.println(lst.toString());
		System.out.println("Removing from end -- " + lst.remove(lst.size()-1));

		lst.add(1, 5);
		System.out.println(lst.toString());
		System.out.println("Removing from end -- " + lst.remove(lst.size()-1));
		System.out.println("Removing from front -- " + lst.remove(0));
		System.out.println(lst.toString());


		System.out.println();
		System.out.println("LinkedList");
		System.out.println("----------");
		List<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(0, 3);
		l.add(0, 5);
		System.out.println(l.toString());
		System.out.println("Removing from front -- " + l.remove(0));
		System.out.println("Removing from end -- " + l.remove(l.size() - 1));


		System.out.println();
		System.out.println("Queue");
		System.out.println("----------");
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		q.offer(3);
		q.offer(5);
		System.out.println(q.toString());
		System.out.println("Remove -- " + q.remove());
		System.out.println("Remove -- " +q.remove());
		System.out.println("poll -- " +q.poll());

	}
}