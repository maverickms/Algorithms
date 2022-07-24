import java.util.Scanner; 

class LCM {
	
	public static int getGCD(int a, int b) {
		
		if(a < b) {
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

		int gcd = getGCD(a, b);
		long lcm = (long)a * (long)(b / gcd);

		System.out.println(lcm);
	}
}