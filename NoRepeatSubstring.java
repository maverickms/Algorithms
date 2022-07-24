import java.util.*;

class NoRepeatSubstring {

  public static int findLength(String str) {
    Map<Character, Integer> map = new HashMap<>();
    int start = 0, maxLen = -1;
    for(int end=0; end<str.length(); end++) {
      Character c = str.charAt(end);
      int lastIdx = -1;
      if(map.containsKey(c)) lastIdx = map.get(c);
      if(lastIdx >= 0 && start <= lastIdx) 
          start = lastIdx + 1;
      map.put(c, end);
      maxLen = Math.max(maxLen, end - start + 1);
    }
    return maxLen;
  }

  public static void main(String[] args) {
    NoRepeatSubstring obj = new NoRepeatSubstring();
    System.out.println(obj.findLength("aabccbb"));  
  }

}