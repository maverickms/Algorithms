import java.util.Scanner;

class FibPartialSum {
	public int fps(int m, int n) {	
		int a = 0, b = 1, c = 0, sum = 0;

		if(n == 1) sum = 1;

		for(int i=2; i<=n; i++) {
			c = (a + b) % 10;
			a = b;
			b = c; 
			if(i >= m) {
				sum += c;
				sum = sum % 10;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int m = s.nextInt(), n = s.nextInt();
			FibPartialSum f = new FibPartialSum();

			System.out.println(f.fps(m, n));
		}
	}
}