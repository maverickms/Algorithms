import java.util.*;

class TestSet {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(3);
		s.add(4);
		s.add(3);
		s.add(4);
		s.add(1);
		s.add(2);
		System.out.println(s.toString());
		System.out.println(s.contains(5));
	}
}