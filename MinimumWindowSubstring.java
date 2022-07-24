import java.util.*;

class MinimumWindowSubstring {
  public static String findSubstring(String str, String pattern) {
    int start = 0, matched = 0;
    String window = "";
    Map<Character, Integer> freqMap = new HashMap<>();
    for(int i=0; i<pattern.length(); i++) {
      char c = pattern.charAt(i);
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }

    for(int end=0; end<str.length(); end++) {
      char c = str.charAt(end);
      if(freqMap.containsKey(c)) {
        freqMap.put(c, freqMap.get(c) - 1);
        if(freqMap.get(c) == 0) 
          matched++;
      }

      if(matched == freqMap.size()) {
        String tmp = str.substring(start, end + 1);
        if((window.length() == 0) || (tmp.length() < window.length()))
          window = new String(tmp);

        while(end - start + 1 > pattern.length()) {
          char s = str.charAt(start++);
          if(freqMap.containsKey(s)) {
            if(freqMap.get(s) == 0)
              matched++;
            
            freqMap.put(s, freqMap.get(s) + 1);
          }
        }
      }
    }
    return window;
  }

  public static void main(String[] args) {
    System.out.println(findSubstring("aabdec", "abc"));  
  }

}
