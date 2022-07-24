import java.util.*;

class Job {
	int start;
	int end;
	int cpuLoad;

	public Job(int _s, int _e, int _cpu) {
		start = _s;
		end = _e;
		cpuLoad = _cpu;
	}

	public String toString() {
		return "{" + start + ", " + end + ", " + cpuLoad + "}";
	}
}

class MaximumCPULoad {
	public static int findMaxCPULoad(List<Job> jobs) {
		int maxLoad = 0, currentCPULoad = 0;
		Collections.sort(jobs, (a,b) -> Integer.compare(a.start, b.start));

		Queue<Job> queue = new PriorityQueue<Job>(jobs.size(),
			(a, b) -> Integer.compare(a.end, b.end));

		for(Job curr:jobs) {
			while(!queue.isEmpty() && queue.peek().end < curr.start)
				currentCPULoad -= queue.poll().cpuLoad;

			queue.offer(curr);
			currentCPULoad += curr.cpuLoad;			
			maxLoad = Math.max(maxLoad, currentCPULoad);
		}

		return maxLoad;
	}

	public static void main(String[] args) {
		List<Job> input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 3), new Job(2, 5, 4), new Job(7, 9, 6)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

    input = new ArrayList<Job>(Arrays.asList(new Job(6, 7, 10), new Job(2, 4, 11), new Job(8, 12, 15)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));

    input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 2), new Job(2, 4, 1), new Job(3, 6, 5)));
    System.out.println("Maximum CPU load at any time: " + MaximumCPULoad.findMaxCPULoad(input));
	}
}