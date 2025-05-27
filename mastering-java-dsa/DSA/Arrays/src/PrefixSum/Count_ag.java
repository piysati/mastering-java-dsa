package PrefixSum;

import java.util.Arrays;

public class Count_ag {
    /* PYQ
    Count the pair of 'ag'
    -> basically just maintain the number of a's that have appeared and when comes 'g' just sum number of a's to count
     */
    public static void main(String[] args) {
        String str = "aaagag";       //abegag
        int[] carryForward_a = new int[str.length()];
        int totalCount = 0;     // total count of ag

        carryForward_a[0] = (str.charAt(0) == 'a')? 1 : 0;

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == 'a')  carryForward_a[i] = carryForward_a[i-1] + 1;
            else if(str.charAt(i) == 'g') {
                totalCount += carryForward_a[i-1];
                carryForward_a[i] = carryForward_a[i-1];
            }
            else carryForward_a[i] = carryForward_a[i-1];
        }

        System.out.println("Pairs of ag are: " + totalCount);
        System.out.println(Arrays.toString(carryForward_a));
    }
}
