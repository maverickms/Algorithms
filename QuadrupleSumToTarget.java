import java.util.*;

class QuadrupleSumToTarget {

  public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    quadruplets = findSets(4, arr, target, 0);
    return quadruplets;
  }

  public static List<List<Integer>> findSets(int size, int[] arr, int target, int start) {
    List<List<Integer>> sets = new ArrayList<>();
    for(int i=start; i<arr.length - size; i++) {
      if(i > 0 && arr[i] == arr[i-1]) continue;
      List<List<Integer>> tsets = new ArrayList<>();
      if(size == 3) {
        tsets = findPairs(arr, target-arr[i], i+1);
      } else {
        tsets = findSets(size - 1, arr, target - arr[i], i+1);
      }

      for(int j=0; j<tsets.size(); j++) {
        List<Integer> temp = tsets.get(j); 
        temp.add(0, arr[i]);
        sets.add(temp);
      }
    }
    return sets;
  }

  public static List<List<Integer>> findPairs(int[] arr, int target, int start) {
    Map<Integer, Integer> tmap = new HashMap<>();
    List<List<Integer>> sets = new ArrayList<>();

    for(int i=start; i<arr.length; i++) {

      if(tmap.containsKey(arr[i])) {
        int idx = tmap.get(arr[i]);
        List<Integer> tlist = new ArrayList<>();
        tlist.add(0, arr[idx]);
        tlist.add(0,arr[i]);
        sets.add(tlist);
      }
      int diff = target - arr[i];
      tmap.put(diff, i);
    }

    return sets;
  }

  public static void main(String[] args) {
    int[] arr = {2, 0, -1, 1, -2, 2};
    List<List<Integer>> quads = searchQuadruplets(arr, 2);
    System.out.println(quads.toString());
  }
}