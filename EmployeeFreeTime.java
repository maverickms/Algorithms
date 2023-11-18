import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public String toString() {
    return "{" + start + ", " + end + "}";
  }

};

class EmployeeFreeTime {

  public static List<Interval> findEmployeeFreeTime(List<List<Interval>> schedule) {
    Queue<Interval> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.start, b.start));
    for(List<Interval> lst:schedule) {
      for(int i=0; i<lst.size(); i++) {
        queue.offer(lst.get(i));
      }
    }

    List<Interval> result = new ArrayList<>();

    int end = 0;
    if(!queue.isEmpty()) {
      Interval first = queue.poll();
      end = first.end;
    }

    while(!queue.isEmpty()) {
      Interval curr = queue.poll();
      if(end >= curr.start) {
        end = Math.max(end, curr.end);
      } else {
        result.add(new Interval(end, curr.start));
        end = curr.end;
      }
    }

    return result;
  }

  public static void main(String[] args) {

    List<List<Interval>> input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(5, 6))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 3), new Interval(6, 8))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(5, 6), new Interval(9, 12))));
    List<Interval> result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
    System.out.println();

    input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3), new Interval(9, 12))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 4))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(6, 8))));
    result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");
    System.out.println();

    input = new ArrayList<>();
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(1, 3))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(2, 4))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(3, 5), new Interval(7, 9))));
    input.add(new ArrayList<Interval>(Arrays.asList(new Interval(5, 7), new Interval(10, 12))));
    result = EmployeeFreeTime.findEmployeeFreeTime(input);
    System.out.print("Free intervals: ");
    for (Interval interval : result)
      System.out.print("[" + interval.start + ", " + interval.end + "] ");

    System.out.println();
  }
}
