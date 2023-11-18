// find pivot index 
// it is the index of the item for which the sum of all left elements (including this) 
// is equal to the sum of all right items

import java.util.Arrays;

public class PivotIndex {
    
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 2};
        int[] fromLeft = new int[arr.length], fromRight = new int[arr.length];
        int lSum = 0, rSum = 0;

        for(int i=0, j=arr.length - 1; i<arr.length; i++, j--) {
            fromLeft[i] = lSum + arr[i];
            lSum += arr[i];
            fromRight[j] = rSum + arr[j];
            rSum += arr[j];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(fromLeft));
        System.out.println(Arrays.toString(fromRight));
        // {1, 8, 11, 17, 22}
        // {22, 21, 14, 11, 5}

        int left = 0, right = arr.length - 1;
        while(left < right) {
            if(fromLeft[left] == fromRight[right] && left == right - 1) {
                break;
            } else if(fromLeft[left] < fromRight[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        if(left >= right)
            System.out.println(-1);
        else
            System.out.println(left);
    }

}

