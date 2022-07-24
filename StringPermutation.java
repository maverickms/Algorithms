import java.util.*;

class StringPermutation {
  public static boolean findPermutation(String str, String pattern) {
    Map<Character, Integer> map = new HashMap<>();
    for(int i=0; i<pattern.length(); i++)
      map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);
    
    Map<Character, Integer> tmap = new HashMap<>(map);
    for(int i=0; i<str.length(); i++) {
      Character c = str.charAt(i);
      int val = tmap.getOrDefault(c, -1);
      System.out.println(i + " " + c + " " + val);

      if(val < 0 && tmap.size() < map.size()) {
        tmap = new HashMap<>(map);
      } else if(val > 0) {
        tmap.put(c, val - 1);
        if(tmap.get(c) == 0) tmap.remove(c);
      }

      System.out.println(tmap.toString());

      if(tmap.isEmpty()) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    System.out.println(findPermutation("odicf", "dc"));  
  }

}
