import java.util.Scanner;

class CarFueling {

	public int minRefuels(int dist, int range, int[] stops) {

		if(dist < range) return 0;

		int rf_count = 0, rem_range = range, curr_stop = 0, next_stop = 0, prev_stop = 0;

		for(int i=1; i<stops.length; i++) {
			curr_stop = stops[i];
			prev_stop = stops[i-1]; 

			rem_range -= (curr_stop - prev_stop);

			if(rem_range < 0) return -1;

			if(i < stops.length - 1) { 
				next_stop = stops[i+1];
			} else {
				next_stop = dist;
			}

			if(rem_range < next_stop - curr_stop) {
				rf_count++;
				rem_range = range;
			}
		}

		rem_range -= (dist - curr_stop); 
		if(rem_range >= 0)
			return rf_count;

		return -1;

	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		CarFueling cf = new CarFueling();

		int dist = myObj.nextInt();
		int range = myObj.nextInt();
		int num_stops = myObj.nextInt();
		int[] stops = new int[num_stops + 1];

		for(int i=1; i<=num_stops; i++)
			stops[i] = myObj.nextInt();

		int count = cf.minRefuels(dist, range, stops); 
		System.out.println(count);
	}
}