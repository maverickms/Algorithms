import java.util.Scanner;
import java.util.HashMap;

class FibonacciLastDigit {
	public int lastDigitForNth(int n) {
		if(n <= 1) return 1;
		if(n == 2) return 1;

		int a = 1, b = 1, c = 0;
		for(int i=3; i<=n; i++) {
			c = (a + b) % 10;
			a = b;
			b = c;
		} 
		return c;
	}

	public static void main(String[] args) {
		FibonacciLastDigit f = new FibonacciLastDigit();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(f.lastDigitForNth(n));
	}
}