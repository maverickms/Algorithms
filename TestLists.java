import java.util.*;

class TestLists {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(6);
		l.add(7);

		System.out.println(l.toString());

		l.insert(4);
	}
}