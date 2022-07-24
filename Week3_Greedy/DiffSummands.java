import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class DiffSummands {
	
	public ArrayList<Integer> calculateSummands(int n, ArrayList<Integer> denoms, int prev_denom) {

		if(n == 0)
			return denoms;

		int x = prev_denom + 1, rem = n - x;

		if(rem <= x) {
			denoms.add(n);
			return denoms;
		} else {
			denoms.add(x);
			n -= x;
		}

		denoms = calculateSummands(n, denoms, x);
		return denoms;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = s.nextInt();
		DiffSummands d = new DiffSummands();

		ArrayList<Integer> out = d.calculateSummands(total, new ArrayList<Integer>(), 0);
		System.out.println(out.size());

		for(int i = 0; i < out.size(); i++)
			System.out.print(out.get(i) + " ");

		System.out.println();

	}
}