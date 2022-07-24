import java.util.Scanner;

class GCD {
	public int getGCD(int a, int b) {
		
		if(b < a) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		while(b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}

		return a;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt();

		GCD gcd = new GCD();

		System.out.println(gcd.getGCD(a, b));
	}
}