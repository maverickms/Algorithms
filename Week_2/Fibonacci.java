import java.util.Scanner;
import java.util.HashMap;

class Fibonacci {
	public long nthNumber(int n, HashMap<Integer, Long> map) {
		if(n<=1) return (long)n;
		if(map.containsKey(n)) return map.get(n);
		long x = nthNumber(n-1, map) + nthNumber(n-2, map);
		map.put(n, x);
		return x;
	}

	public static void main(String[] args) {
		HashMap<Integer, Long> map = new HashMap<>();
		Fibonacci f = new Fibonacci();
		Scanner s = new Scanner(System.in);

		map.put(0, 0L);
		map.put(1, 1L);

		int n = s.nextInt();
		System.out.println(f.nthNumber(n, map));
	}
}	