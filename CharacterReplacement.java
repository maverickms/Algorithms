import java.util.*;

class CharacterReplacement {
  public static int findLength(String str, int k) {
    int start = 0, maxLength = 0, allowedRep = k, replaceStart = 0, end = 0;
    for(end=0; end<str.length(); end++) {
      char rep = str.charAt(start), curr = str.charAt(end);
      if(curr != rep) {
        if(allowedRep == 0) {
          maxLength = Math.max(maxLength, end - start);
          start = replaceStart;
          end = replaceStart;
          allowedRep = k;
        } else {
          if(allowedRep == k) { 
            replaceStart = end;
          }
          allowedRep--;
        }
      }
    }

    maxLength = Math.max(maxLength, end - start);
    return maxLength;
  }

  public static void main(String[] args) {
    int l = findLength("abccde", 1);
    System.out.println(l);
  }
}