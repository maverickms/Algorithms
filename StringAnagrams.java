import java.util.*;

class StringAnagrams {
  public static List<Integer> findStringAnagrams(String str, String pattern) {
    List<Integer> resultIndices = new ArrayList<Integer>();
    int start = 0, matched = 0;
    Map<Character, Integer> freqMap = new HashMap<>(); 

    for(int i=0; i<pattern.length(); i++) {
      char c = pattern.charAt(i);
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }

    for(int end=0; end<str.length(); end++) {
      char c = str.charAt(end);
      if(freqMap.containsKey(c)) {
        freqMap.put(c, freqMap.get(c) - 1);  
        System.out.println(freqMap.toString());
        if(freqMap.get(c) == 0) // character has been completely matched
          matched++;
      }

      if(matched == freqMap.size()) {
        resultIndices.add(start);
      }

      if(end >= pattern.length() - 1) {
        char s = str.charAt(start++);
        if(freqMap.containsKey(s)) {
          if(freqMap.get(s) == 0) 
            matched--;
          freqMap.put(s, freqMap.get(s) + 1);
        }
      }
    }
    return resultIndices;
  }

  public static void main(String[] args) {
    List<Integer> res = findStringAnagrams("ppqp", "pq");
    System.out.println(res.toString());
  }
}
