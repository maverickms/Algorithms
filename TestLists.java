import java.util.*;

class TestLists {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(6);
		l.add(7);

		l.remove(1);
		System.out.println(l.toString());

		l.add(4);

		System.out.println(l.toString());


		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		System.out.println(lst);

		System.out.println(lst.remove());
		System.out.println(lst);
		
		System.out.println(lst.peek());
		System.out.println(lst.removeFirst());
		System.out.println(lst.removeLast());
		System.out.println(lst);

	}
}