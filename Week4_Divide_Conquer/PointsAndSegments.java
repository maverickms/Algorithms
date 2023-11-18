import java.util.Scanner;

class PointsAndSegments {
	public static int[] naiveCountSegments(int[][] segments, int[] points) {

		int[] point_in_segments = new int[points.length];

		for(int i=0; i<points.length; i++) {
			for(int j=0; j<segments.length; j++) {
				if(	((segments[j][0] < points[i]) && (segments[j][1] > points[i])) ||
						(segments[j][0] == points[i]) || 
						(segments[j][1] == points[i]) 
					) {
					point_in_segments[i]++;
				}
			}
		}

		return point_in_segments;

	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int no_segments = s.nextInt();
			int no_points = s.nextInt();
			int[][] segments = new int[no_segments][2];
			int[] points = new int[no_points];

			for(int i=0; i<no_segments; i++) {
				segments[i][0] = s.nextInt();
				segments[i][1] = s.nextInt();
			}

			for(int i=0; i<no_points; i++) {
				points[i] = s.nextInt();
			}

			int[] arr = naiveCountSegments(segments, points);

			for(int i=0; i<arr.length; i++)
				System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}